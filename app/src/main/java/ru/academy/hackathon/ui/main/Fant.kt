package ru.academy.hackathon.ui.main

import android.os.Parcelable

data class Fant(
    var id: Long,
    var idCategory: Int,
    var textTask: String,
    var imageName: String,
    var countUsers: Int,
    var checkTask: Boolean
)