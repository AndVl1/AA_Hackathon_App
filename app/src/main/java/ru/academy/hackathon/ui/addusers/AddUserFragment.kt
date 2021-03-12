package ru.academy.hackathon.ui.addusers

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import ru.academy.hackathon.R
import ru.academy.hackathon.databinding.UsersFragmentBinding

class AddUserFragment : Fragment(R.layout.users_fragment) {

    private var _binding: UsersFragmentBinding? = null
    private val binding get() = _binding!!

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

    }
}