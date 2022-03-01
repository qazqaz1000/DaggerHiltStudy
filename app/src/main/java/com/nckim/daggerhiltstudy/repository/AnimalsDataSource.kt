package com.nckim.daggerhiltstudy.repository


class AnimalsDataSource {
    val animals : ArrayList<AnimalDataSource> = ArrayList()

    fun addAnimal(animal : AnimalDataSource){
        if(!animals.contains(animal)){
            animals.add(animal)
        }
    }

    fun myAnimalsPrint() : String{
        var print : String = ""
        for (anmial in animals){
            print += anmial.toStringProfile() + "\n"
        }
        return print
    }

}