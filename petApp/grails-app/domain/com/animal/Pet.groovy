package com.animal

class Pet {

    Integer age
    String name
    Species species
    Breed breed
    String color

    static constraints = {
        age min: 0, max: 20
        name blank: false, nullable: false, maxSize: 25, minSize: 3
        color nullable: true
    }
}
