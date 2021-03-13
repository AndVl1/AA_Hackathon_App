package ru.academy.hackathon.ui.main.fragmentCategory

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.observe
import androidx.viewpager.widget.PagerTabStrip
import androidx.viewpager.widget.ViewPager
import ru.academy.hackathon.R
import ru.academy.hackathon.application.FantsApp
import ru.academy.hackathon.databinding.FragmentCategoryBinding
import ru.academy.hackathon.databinding.GameUsersBinding

interface CallbacksFragmentCategory {
    fun backTo()
    fun openGameWithFragmentCategory()
}

class FragmentCategory() : Fragment() {

    private var _binding: FragmentCategoryBinding? = null
    private val binding get() = _binding!!

    private var callback: CallbacksFragmentCategory? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCategoryBinding.inflate(inflater)

        return _binding?.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is CallbacksFragmentCategory) callback = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewPager: ViewPager = view.findViewById(R.id.viewpager)
        viewPager.adapter =
            FragmentPageAdapterTab(
                getChildFragmentManager()
            )
        viewPager.currentItem = 0
        val pagerTabStrip: PagerTabStrip = view.findViewById(R.id.pagerTabStrip)
        pagerTabStrip.drawFullUnderline = false
        pagerTabStrip.setTabIndicatorColorResource(R.color.design_default_color_primary)

        binding.toBackButton.setOnClickListener {
            callback?.backTo()
        }

        binding.toGameButton.setOnClickListener {
            checkUsers()
        }
    }

    private fun checkUsers() {
        val repository = (requireActivity().application as FantsApp).myComponent.userRepository
        repository.getAllUsers().observe(viewLifecycleOwner) { users ->
            if (users.size >= 2) {
                callback?.openGameWithFragmentCategory()
            } else {
                showToast(text = "Недостаточно игроков для игры")
            }
        }
    }

    private fun showToast(text: String) =
        Toast.makeText(requireContext(), text, Toast.LENGTH_LONG).show()
}