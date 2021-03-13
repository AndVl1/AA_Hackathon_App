package ru.academy.hackathon.ui.main

import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import ru.academy.hackathon.R
import ru.academy.hackathon.databinding.MainFragmentBinding
import ru.academy.hackathon.databinding.UsersFragmentBinding

interface CallbacksMainFragment{
	fun openSettings()
	fun openRules()
	fun openAddUsers()
}

class MainFragment : Fragment() {

	private var _binding: MainFragmentBinding? = null
	private val binding get() = _binding!!

	private var callback : CallbacksMainFragment? = null

	override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
	                          savedInstanceState: Bundle?): View? {
		_binding = MainFragmentBinding.inflate(inflater)
		return _binding?.root
	}

	override fun onAttach(context: Context) {
		super.onAttach(context)
		if(context is CallbacksMainFragment) callback = context
	}

	override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
		super.onViewCreated(view, savedInstanceState)
		binding.gameRuler.setOnClickListener {
			callback?.openRules()
		}

		binding.gameSettings.setOnClickListener {
			callback?.openSettings()
		}

		binding.gameStart.setOnClickListener {
			callback?.openAddUsers()
		}
	}

}