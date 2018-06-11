package com.animal

class Breed {

    String name
    static belongsTo = [species: Species]
    
    static constraints = {
    }

    String toString() {
      name
    }
}
