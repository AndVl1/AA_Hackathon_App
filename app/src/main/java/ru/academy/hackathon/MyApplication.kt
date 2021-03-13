package ru.academy.hackathon

import android.app.Application
import org.koin.android.ext.koin.androidContext
import org.koin.core.component.KoinApiExtension
import org.koin.core.context.startKoin
//import ru.academy.hackathon.di.koinModule.categoryListModul

class MyApplication : Application() {
//    @KoinApiExtension
    override fun onCreate() {
        super.onCreate()
//        startKoin {
//            androidContext(this@MyApplication)
//            modules(categoryListModul)
//        }
    }
}
