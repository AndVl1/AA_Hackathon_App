package ru.academy.hackathon.application

import android.app.Application
import ru.academy.hackathon.di.AppComponent

class FantsApp : Application() {

    val myComponent: AppComponent by lazy { AppComponent(context = this) }
}
