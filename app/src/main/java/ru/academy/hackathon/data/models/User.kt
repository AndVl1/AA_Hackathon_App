package ru.academy.hackathon.data.models

data class User(
    val name : String ,
    val ageType : String ,
    val taskType : String,
    val countSuccessfulTask : Int
)