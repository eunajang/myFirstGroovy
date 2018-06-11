package com.animal

import grails.transaction.Transactional

@Transactional
class WeightEstimateService {

  def getEstimate(Pet pet) {
      log.info 'Estimating  pet weight...'

      // not correct weight
      if(pet.age==0){
        1*10
      } else {
        pet.age*10
      }
  }
}
