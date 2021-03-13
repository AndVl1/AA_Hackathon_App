package ru.academy.hackathon.ui.game

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.observe
import ru.academy.hackathon.application.FantsApp
import ru.academy.hackathon.data.models.User
import ru.academy.hackathon.databinding.GameUsersBinding
import ru.academy.hackathon.ui.viewmodels.AddUserViewModel

class GameFragment : Fragment() {

    private var _binding: GameUsersBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: AddUserViewModel

    private lateinit var usersList: List<User>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = GameUsersBinding.inflate(inflater)
        return _binding?.root.also { restoreValues() }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel =
            (requireActivity().application as FantsApp).myComponent
                .getAddUserViewModel(fragment = this@GameFragment)

        viewModel.users.observe(viewLifecycleOwner) { users ->
            usersList = users
        }

        startGame()

        binding.completeFantButton.setOnClickListener {
            recalculatingPoints()
            Index.currentIndexUser++
            startGame()
        }

        binding.dropFantButton.setOnClickListener {
            Index.currentIndexUser++
            startGame()
        }

        binding.endFant.setOnClickListener {

        }
    }

    override fun onDestroyView() {
        super.onDestroyView()

        saveGameValues()
    }

    private fun startGame() {
        if (Index.currentIndexUser != usersList.size) {
            binding.usernameGame.text = usersList[Index.currentIndexUser].name
        } else {
            updateRound()
        }
    }

    private fun saveGameValues() {
        arguments = Bundle().apply {
            putInt(SAVE_INDEX_ROUND, Index.currentIndexRound)
            putInt(SAVE_INDEX_USER, Index.currentIndexUser)
        }
    }

    private fun restoreValues() {
        Index.currentIndexUser = arguments?.getInt(SAVE_INDEX_USER) ?: 0
        Index.currentIndexRound = arguments?.getInt(SAVE_INDEX_ROUND) ?: 0
    }

    @SuppressLint("SetTextI18n")
    private fun updateRound() {
        Index.currentIndexRound++
        binding.roundCount.text = "Круг $Index.currentIndexRound"
        Index.currentIndexUser = 0
    }

    private fun recalculatingPoints(){
        usersList[Index.currentIndexUser].countSuccessfulTask++
    }

    companion object {
        private const val SAVE_INDEX_ROUND = "SAVE_INDEX_ROUND"
        private const val SAVE_INDEX_USER = "SAVE_INDEX_ROUND"
    }
}

object Index {
    var currentIndexUser = 0
    var currentIndexRound = 1
}