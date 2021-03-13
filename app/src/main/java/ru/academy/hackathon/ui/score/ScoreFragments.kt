package ru.academy.hackathon.ui.score

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.academy.hackathon.databinding.GameUsersBinding
import ru.academy.hackathon.databinding.ScoreFragmentBinding

interface CallbacksScoreFragments{
    fun openMainFragmentWithScoreFragments()
    fun openAddUserFragmentWithScoreFragments()
}

class ScoreFragments : Fragment() {
    private var _binding: ScoreFragmentBinding? = null
    private val binding get() = _binding!!

    private var callback : CallbacksScoreFragments? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = ScoreFragmentBinding.inflate(inflater)

        return _binding?.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is CallbacksScoreFragments) callback= context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.restartGame.setOnClickListener {
            callback?.openAddUserFragmentWithScoreFragments()
        }

        binding.endGameButton.setOnClickListener {
            callback?.openMainFragmentWithScoreFragments()
        }
    }
}