package com.animal

import grails.testing.gorm.DataTest
import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class PetSpec extends Specification implements DomainUnitTest<Pet>{

    void 'test name cannot be null'(){
        when: domain.name = null

        then:
            !domain.validate(['name'])
            domain.errors['name'].code == 'nullable'
    }

    void 'test name cannot be blank'() {
        when: domain.name = ''

        then:
            !domain.validate(['name'])
    }

    void 'test name can have a maximum of 25 characters'() {
        when: 'for a string of 26 characters'
        String str = 'a' * 26
        domain.name = str

        then: 'name validation fails'
        !domain.validate(['name'])
        domain.errors['name'].code == 'maxSize.exceeded'

        when: 'for a string of 25 characters'
        str = 'a' * 25
        domain.name = str

        then: 'name validation passes'
        domain.validate(['name'])
    }

    void 'test name can have a minimum of 3 characters'() {
        when: 'for a string of 2 characters'
        String str = 'a' * 2
        domain.name = str

        then: 'name validation fails'
        !domain.validate(['name'])
        domain.errors['name'].code == 'minSize.notmet'

        when: 'for a string of 3 characters'
        str = 'a' * 3
        domain.name = str

        then: 'name validation passes'
        domain.validate(['name'])
    }

    void 'test color can be null'(){
        when: domain.color = null

        then:
          'color validation passes'
           domain.validate(['color'])
    }

    void 'test age validation'() {
        when: domain.age < 0
        then: 'age validation fail'

        when: domain.age > 20
        then: 'age validation fail'
    }
}
