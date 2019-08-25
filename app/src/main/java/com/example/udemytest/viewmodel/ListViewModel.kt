package com.example.udemytest.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.udemytest.model.DogBreed

class ListViewModel : ViewModel() {

    val dogs = MutableLiveData<List<DogBreed>>()
    val dogsLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh(){
        val dog1 =  DogBreed("1", "Corgi", "15 Years", "breedGroup", "bredFor", "temperament", "")
        val dog2 =  DogBreed("2", "Labrador", "13 Years", "breedGroup", "bredFor", "temperament", "")
        val dog3 =  DogBreed("3", "Rotwailer", "12 Years", "breedGroup", "bredFor", "temperament", "")
        val dog4 =  DogBreed("1", "Corgi", "15 Years", "breedGroup", "bredFor", "temperament", "")
        val dog5 =  DogBreed("2", "Labrador", "13 Years", "breedGroup", "bredFor", "temperament", "")
        val dog6 =  DogBreed("3", "Rotwailer", "12 Years", "breedGroup", "bredFor", "temperament", "")
        val dog7 =  DogBreed("1", "Corgi", "15 Years", "breedGroup", "bredFor", "temperament", "")
        val dog8 =  DogBreed("2", "Labrador", "13 Years", "breedGroup", "bredFor", "temperament", "")
        val dog9 =  DogBreed("3", "Rotwailer", "12 Years", "breedGroup", "bredFor", "temperament", "")
        val dog10 =  DogBreed("1", "Corgi", "15 Years", "breedGroup", "bredFor", "temperament", "")
        val dog11 =  DogBreed("2", "Labrador", "13 Years", "breedGroup", "bredFor", "temperament", "")
        val dog12 =  DogBreed("3", "Rotwailer", "12 Years", "breedGroup", "bredFor", "temperament", "")
        val dog13 =  DogBreed("1", "Corgi", "15 Years", "breedGroup", "bredFor", "temperament", "")
        val dog14 =  DogBreed("2", "Labrador", "13 Years", "breedGroup", "bredFor", "temperament", "")
        val dog15 =  DogBreed("3", "Rotwailer", "12 Years", "breedGroup", "bredFor", "temperament", "")
        val dogList = arrayListOf<DogBreed>(dog1,dog2,dog3,dog4,dog5,dog6,dog7,dog8,dog9,dog10,dog11,dog12,dog13,dog14,dog15)
        dogs.value = dogList
        dogsLoadError.value = false
        loading.value = false
    }

}