package ru.academy.hackathon.data.repositories

interface FantRepository {
    fun getAlcoholicFants() : List<String>

    fun getChildrenFants() : List<String>

    fun getNewYearFants() : List<String>

    fun getPartyFants() : List<String>

    fun getSchoolFants() : List<String>

    fun getSportsFants() : List<String>

    fun getStreetFants() : List<String>

    fun getVulgarFants() : List<String>
}