package ru.academy.hackathon.data.repositories

import ru.academy.hackathon.data.FantData


class FantRepositoryImpl : FantRepository {
    override fun getAlcoholicFants(): List<String> =
        FantData().alghogolFants


    override fun getChildrenFants(): List<String> =
        FantData().childFants

    override fun getNewYearFants(): List<String> =
        FantData().alghogolFants

    override fun getPartyFants(): List<String> =
        FantData().alghogolFants

    override fun getSchoolFants(): List<String> =
        FantData().alghogolFants

    override fun getSportsFants(): List<String> =
        FantData().sportsFants

    override fun getStreetFants(): List<String> =
        FantData().streetsFants

    override fun getVulgarFants(): List<String> =
        FantData().alghogolFants
}