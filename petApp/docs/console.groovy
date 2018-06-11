import com.animal.*

def pets = Pet.list()
println pet.size()

def ricky = Pet.findGByName("Ricky")

println ricky.name
println ricky.species.name
println ricky.breed.name

def  dog = Species.findByName("Dog")
def dogs = Pet.findAllBySpecies(dog)

println dogs.size()
