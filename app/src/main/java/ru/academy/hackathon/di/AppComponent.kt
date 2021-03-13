package ru.academy.hackathon.di

import android.content.Context
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import ru.academy.hackathon.data.repositories.FantRepositoryImpl
import ru.academy.hackathon.data.repositories.UsersRepositoryImpl
import ru.academy.hackathon.ui.main.ViewModelCategory
import ru.academy.hackathon.ui.viewmodels.AddUserViewModel
import ru.academy.hackathon.ui.viewmodels.GameViewModel

class AppComponent(context: Context) {

    val userRepository = UsersRepositoryImpl(applicationContext = context)

    private val fantRepository = FantRepositoryImpl()

    fun getAddUserViewModel(fragment: Fragment): AddUserViewModel =
        ViewModelProvider(
            fragment,
            AddUserViewModel.Factory(repository = userRepository)
        )[AddUserViewModel::class.java]

    fun getViewModelCategory(fragment: Fragment): ViewModelCategory =
        ViewModelProvider(
            fragment,
            ViewModelCategory.Factory(repository = userRepository)
        )[ViewModelCategory::class.java]


    fun getGameViewModel(fragment: Fragment) =
        ViewModelProvider(
            fragment,
            GameViewModel.Factory(userRepository = userRepository, fantRepository = fantRepository)
        )[GameViewModel::class.java]
}
