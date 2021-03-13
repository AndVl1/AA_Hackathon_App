package ru.academy.hackathon.data.repositories

import ru.academy.hackathon.data.FantData


class FantRepositoryImpl : FantRepository {
    override fun getAlcoholicFants(): List<String> =
        FantData().alghogolFants


    override fun getChildrenFants(): List<String> =
        FantData().childFants


    override fun getSportsFants(): List<String> =
        FantData().sportsFants

    override fun getStreetFants(): List<String> =
        FantData().streetsFants

}