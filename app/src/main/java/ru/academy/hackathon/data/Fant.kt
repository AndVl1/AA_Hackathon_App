package ru.academy.hackathon.data

import android.os.Parcelable

data class Fant(
    var id: Int,
    var idCategory: Int,
    var textTask: String,
    var imageName: String,
    var countUsers: Int,
    var checkTask: Boolean
)