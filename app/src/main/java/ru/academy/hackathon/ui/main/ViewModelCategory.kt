package ru.academy.hackathon.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import ru.academy.hackathon.data.CategoryFant

import ru.academy.hackathon.data.Fant
import ru.academy.hackathon.data.repositories.UsersRepositoryImpl
import ru.academy.hackathon.data.repository.RepositoryCategory
import ru.academy.hackathon.ui.viewmodels.AddUserViewModel

class ViewModelCategory( val repository: UsersRepositoryImpl) : ViewModel() {
    private var scope =  CoroutineScope(SupervisorJob() + Dispatchers.Main)
    private var rep: RepositoryCategory =
        RepositoryCategory()
    private val mutableState =
        MutableLiveData<ViewModelCategoryState>(ViewModelCategoryState.Loading)
    val stateLiveData: LiveData<ViewModelCategoryState> get() = mutableState

    fun loadCategoryList(category: CategoryFant): List<Fant> {
        Log.v("loadCategoryList","idCategory + ${category.idCategory}")

        var fants: List<Fant> = rep.getFantsList(category.idCategory)
        Log.v("loadCategoryList","${fants.size}")
        mutableState.setValue(ViewModelCategoryState.Success(fants))

        return fants
    }

    fun insertFant(fant : Fant){
        scope.launch {
            repository.insertFant(fant=fant)
        }
    }

    fun updateFant(fant : Fant){
        scope.launch {
            repository.updateFant(fant=fant)
        }
    }


    sealed class ViewModelCategoryState {
        object Loading : ViewModelCategoryState()
        data class Success(val list: List<Fant>) : ViewModelCategoryState()
        data class Error(val error: String) : ViewModelCategoryState()
    }

    @Suppress("UNCHECKED_CAST")
    class Factory(private val repository: UsersRepositoryImpl) :
        ViewModelProvider.NewInstanceFactory() {

        override fun <T : ViewModel?> create(modelClass: Class<T>): T {
            return ViewModelCategory(repository = repository) as T
        }
    }
}
