package com.animal

class BootStrap {

    def init = { servletContext ->

        def dog = new Species(name: 'Dog').save()
        def cat = new Species(name: 'Cat').save()
        def horse = new Species(name: 'Horse').save()

        def gs = new Breed(name: 'German Shepard', species: dog).save()
        def gd = new Breed(name: 'Great Dane', species: dog).save()
        def ps = new Breed(name: 'Persian', species: cat).save()
        def bs = new Breed(name: 'British Shorthair', species: cat).save()
        def ms = new Breed(name: 'Mustang', species: horse).save()
        def cd = new Breed(name: 'Clydesdale', species: horse).save()

        new Pet(name: 'Ricky', species: dog, breed: gs, age: 7, color: 'Brown').save()
        new Pet(name: 'Spot', species: dog, breed: gd, age: 5, color: 'Brown').save()
        new Pet(name: 'Kitty', species: cat, breed: ps, age: 3, color: 'White' ).save()
        new Pet(name: 'Cuttie', species: cat, breed: bs, age: 0, color: 'Brown').save()
        new Pet(name: 'Sunny', species: horse, breed: ms, age: 5, color: 'Black' ).save()
        new Pet(name: 'Big', species: horse, breed: cd, age: 5, color: 'Brown'  ).save()
        }

    def destroy = {
    }
 }
