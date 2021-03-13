package ru.academy.hackathon.ui.main.fragmentCategory

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.PagerTabStrip
import ru.academy.hackathon.MainActivity
import ru.academy.hackathon.R
import ru.academy.hackathon.application.FantsApp
import ru.academy.hackathon.data.CategoryFant
import ru.academy.hackathon.data.Fant
import ru.academy.hackathon.ui.main.ViewModelCategory


class FragmentCategoryListPage(val categoryFant: CategoryFant) : Fragment() {
    private var listRecyclerView: RecyclerView? = null
    private lateinit var pagerTabStrip: PagerTabStrip
    lateinit var fants: List<Fant>

    //    val viewModel: ViewModelCategory  by viewModel()
    lateinit var viewModel: ViewModelCategory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        retainInstance = true
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.view_pager_tab, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel = (requireActivity().application as FantsApp).myComponent.getViewModelCategory(fragment = this@FragmentCategoryListPage)
        viewModel.stateLiveData.observe(viewLifecycleOwner, Observer { setState(it) })
        fants = viewModel.loadCategoryList(categoryFant)
        listRecyclerView = view.findViewById<RecyclerView>(R.id.fcRecyclerView)
        listRecyclerView?.layoutManager = GridLayoutManager(activity, 2)
        listRecyclerView?.adapter =
            CategoryViewAdapter(viewModel=viewModel) { item ->
                doOnClick(
                    item
                )
            }
    }

    fun doOnClick(id: Long) {
//        viewModel.stateLiveData.value?.let {
//            getCategory(it, id)?.let {
//                // смена выбора фанта
//            }
//        }
    }

    private fun updateData(fantList: List<Fant>) {
        (listRecyclerView?.adapter as? CategoryViewAdapter)?.apply {
            bindCategory(fantList)
            Log.v("updateData", "${fantList.size}")

        }
    }

    fun setState(state: ViewModelCategory.ViewModelCategoryState) =
        when (state) {
            is ViewModelCategory.ViewModelCategoryState.Loading ->
                Log.v("setState", "Loading")
//                progressBar.visibility = ProgressBar.VISIBLE

            is ViewModelCategory.ViewModelCategoryState.Success -> {
                Log.v("setState", "Success")

                updateData(state.list)
            }
            is ViewModelCategory.ViewModelCategoryState.Error ->
                errorMessage(state.error)
        }

    fun getCategory(state: ViewModelCategory.ViewModelCategoryState, id: Long): Fant? {
        when (state) {
            is ViewModelCategory.ViewModelCategoryState.Success -> {
                updateData(state.list)
                return state.list[id.toInt()]
            }
            else -> return null
        }
    }

    fun errorMessage(string: String?) {
        val toast = Toast.makeText(activity, string, Toast.LENGTH_SHORT)
        toast.show()
    }
}