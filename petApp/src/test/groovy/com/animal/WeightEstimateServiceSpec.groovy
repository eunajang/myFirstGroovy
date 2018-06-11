package com.animal

import grails.testing.gorm.DataTest
import grails.testing.services.ServiceUnitTest
import spock.lang.Specification

class WeightEstimateServiceSpec extends Specification implements ServiceUnitTest<WeightEstimateService>, DataTest{

    def setup() {
        mockDomain Breed
        mockDomain Species
        mockDomain Pet
    }

    void testEstimateRetrieval() {
      given: 'a pet'
      def species = new Species(name: 'Test')
      def breed = new Breed(name: 'Test', species: species)
      def pet = new Pet(name: 'Test Pet', species: species, breed: breed, age: 10)

      when: 'service is called'
      def estimate = service.getEstimate(pet)

      then: 'a non-zero result is returned'
      estimate >= 10

      and: 'estimate is not too large'
      estimate <= 200
  }
}
