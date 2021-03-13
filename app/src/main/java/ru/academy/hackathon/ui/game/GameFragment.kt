package ru.academy.hackathon.ui.game

import android.annotation.SuppressLint
import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.observe
import ru.academy.hackathon.application.FantsApp
import ru.academy.hackathon.data.models.User
import ru.academy.hackathon.databinding.GameUsersBinding
import ru.academy.hackathon.ui.viewmodels.AddUserViewModel
import ru.academy.hackathon.ui.viewmodels.GameViewModel
import java.time.LocalDate

interface CallbacksGameFragment{
    fun openEndGame()
}

class GameFragment : Fragment() {

    private var _binding: GameUsersBinding? = null
    private val binding get() = _binding!!

    private lateinit var viewModel: AddUserViewModel
    private lateinit var gameViewModel: GameViewModel

    private lateinit var usersList: List<User>

    private var callback : CallbacksGameFragment? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = GameUsersBinding.inflate(inflater)
        return _binding?.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is CallbacksGameFragment) callback=context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel =
            (requireActivity().application as FantsApp).myComponent
                .getAddUserViewModel(fragment = this@GameFragment)

        gameViewModel =
            (requireActivity().application as FantsApp).myComponent.getGameViewModel(fragment = this@GameFragment)

        viewModel.users.observe(viewLifecycleOwner) { users ->
            usersList = users
            startGame()
        }

        binding.completeFantButton.setOnClickListener {
            recalculatingPoints()
            GameViewModel.Index.currentIndexUser++
            startGame()
        }

        binding.dropFantButton.setOnClickListener {
            GameViewModel.Index.currentIndexUser++
            startGame()
        }

        binding.endFant.setOnClickListener {
            callback?.openEndGame()
        }
    }

    private fun startGame() {
        if (GameViewModel.Index.currentIndexUser == usersList.size) {
            updateRound()
        } else {
            binding.usernameGame.text = usersList[GameViewModel.Index.currentIndexUser].name
        }
    }

    @SuppressLint("SetTextI18n")
    private fun updateRound() {
        Log.d("AAA", "UPDATE ROUND")
        GameViewModel.Index.currentIndexRound++
        binding.roundCount.text = "Круг ${GameViewModel.Index.currentIndexRound}"
        GameViewModel.Index.currentIndexUser = 0
        binding.usernameGame.text = usersList[GameViewModel.Index.currentIndexUser].name
    }

    private fun recalculatingPoints() {
        usersList[GameViewModel.Index.currentIndexUser].countSuccessfulTask++
        usersList.forEach { user ->
            gameViewModel.updateUser(user = user)
        }
    }
}
