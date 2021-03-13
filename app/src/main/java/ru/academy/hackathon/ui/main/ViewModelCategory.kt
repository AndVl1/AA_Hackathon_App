package ru.academy.hackathon.ui.main

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import ru.academy.hackathon.data.CategoryFant

import ru.academy.hackathon.data.Fant
import ru.academy.hackathon.data.repository.RepositoryCategory

class ViewModelCategory() : ViewModel() {
    private var scope = viewModelScope
    private var rep: RepositoryCategory =
        RepositoryCategory();
    private val mutableState =
        MutableLiveData<ViewModelCategoryState>(ViewModelCategoryState.Loading)
    val stateLiveData: LiveData<ViewModelCategoryState> get() = mutableState

    fun loadCategoryList(category: CategoryFant): List<Fant> {
        Log.v("loadCategoryList","idCategory + ${category.idCategory}")

        var fants: List<Fant> = listOf()
        fants = rep.getFantsList(category.idCategory)
        Log.v("loadCategoryList","${fants.size}")
        mutableState.setValue(ViewModelCategoryState.Success(fants))

        return fants
    }

    sealed class ViewModelCategoryState {
        object Loading : ViewModelCategoryState()
        data class Success(val list: List<Fant>) : ViewModelCategoryState()
        data class Error(val error: String) : ViewModelCategoryState()
    }
}