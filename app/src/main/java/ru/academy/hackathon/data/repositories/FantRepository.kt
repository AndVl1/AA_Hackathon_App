package ru.academy.hackathon.data.repositories

interface FantRepository {
    fun getAlcoholicFants() : List<String>

    fun getChildrenFants() : List<String>

    fun getSportsFants() : List<String>

    fun getStreetFants() : List<String>

}