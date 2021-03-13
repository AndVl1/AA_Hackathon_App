package ru.academy.hackathon.ui.game

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.academy.hackathon.application.FantsApp
import ru.academy.hackathon.databinding.GameUsersBinding
import ru.academy.hackathon.ui.viewmodels.AddUserViewModel

class GameFragment : Fragment() {

    private var _binding: GameUsersBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: AddUserViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = GameUsersBinding.inflate(inflater)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel =
            (requireActivity().application as FantsApp).myComponent
                .getAddUserViewModel(fragment = this@GameFragment)

        viewModel.users.observe(viewLifecycleOwner, )
    }
}