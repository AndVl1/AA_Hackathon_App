package ru.academy.hackathon.ui.game

import android.annotation.SuppressLint
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
import java.time.LocalDate

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
        return _binding?.root?.also { restoreValues() }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel =
            (requireActivity().application as FantsApp).myComponent
                .getAddUserViewModel(fragment = this@GameFragment)

        viewModel.users.observe(viewLifecycleOwner) { users ->
            usersList = users
            startGame()
        }

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

    private fun startGame() {
        if (Index.currentIndexUser == usersList.size) {
            updateRound()
        } else {
            binding.usernameGame.text = usersList[Index.currentIndexUser].name
        }
    }

    private fun restoreValues() {
        Index.currentIndexRound = binding.roundCount.text.split(" ")[1].toInt()
        Log.d("INDEXUSER",Index.currentIndexUser.toString())
        Log.d("INDEXROUND",Index.currentIndexRound.toString())
    }

    @SuppressLint("SetTextI18n")
    private fun updateRound() {
        Log.d("AAA","UPDATE ROUND")
        Index.currentIndexRound++
        Log.d("AAAINDEXROUND", Index.currentIndexRound.toString())
        binding.roundCount.text = "Круг ${Index.currentIndexRound}"
        Index.currentIndexUser = 0
        binding.usernameGame.text = usersList[Index.currentIndexUser].name
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