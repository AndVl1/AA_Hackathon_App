package ru.academy.hackathon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import ru.academy.hackathon.ui.main.CategoryFant
import ru.academy.hackathon.ui.main.FragmentCategory
import ru.academy.hackathon.ui.main.FragmentCategoryListPage
import ru.academy.hackathon.ui.main.MainFragment
import ru.academy.hackathon.ui.main.ViewModelCategory

class MainActivity : AppCompatActivity() {

	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.main_activity)
		viewModelCategory = ViewModelCategory();
		Log.v("MainActivity","onCreate")




		if (savedInstanceState == null) {
			supportFragmentManager.beginTransaction()
					.replace(R.id.container, FragmentCategory())
					.commitNow()
		}
	}
	companion object {
		public lateinit var viewModelCategory :ViewModelCategory ;

	}
}