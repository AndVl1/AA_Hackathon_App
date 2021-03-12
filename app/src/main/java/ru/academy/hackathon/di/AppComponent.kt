package ru.academy.hackathon.di

import android.content.Context
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import ru.academy.hackathon.data.repositories.UsersRepositoryImpl
import ru.academy.hackathon.ui.viewmodels.AddUserViewModel

class AppComponent(context: Context) {

    private val userRepository = UsersRepositoryImpl(applicationContext = context)

    fun getAddUserViewModel(fragment: Fragment): AddUserViewModel =
        ViewModelProvider(
            fragment,
            AddUserViewModel.Factory(repository = userRepository)
        )[AddUserViewModel::class.java]

}