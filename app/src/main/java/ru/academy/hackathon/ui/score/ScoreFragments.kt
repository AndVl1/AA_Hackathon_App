package ru.academy.hackathon.ui.score

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import ru.academy.hackathon.application.FantsApp
import ru.academy.hackathon.data.models.User
import ru.academy.hackathon.databinding.GameUsersBinding
import ru.academy.hackathon.databinding.ScoreFragmentBinding

interface CallbacksScoreFragments {
    fun openMainFragmentWithScoreFragments()
    fun openAddUserFragmentWithScoreFragments()
}

class ScoreFragments : Fragment() {
    private var _binding: ScoreFragmentBinding? = null
    private val binding get() = _binding!!

    private var callback: CallbacksScoreFragments? = null

    private lateinit var adapter: ScoreRecyclerViewAdapted

    private val scope = CoroutineScope(Dispatchers.IO)

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
        if (context is CallbacksScoreFragments) callback = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        (requireActivity().application as FantsApp).myComponent
            .userRepository.getAllUsers()
            .observe(viewLifecycleOwner) { users ->
                adapter.bindData(users = users)
                adapter.notifyDataSetChanged()
            }

        binding.restartGame.setOnClickListener {
            updateUsers()
            callback?.openAddUserFragmentWithScoreFragments()
        }

        binding.endGameButton.setOnClickListener {
            updateUsers()
            callback?.openMainFragmentWithScoreFragments()
        }


        with(binding.scoreRecyclerView) {
            layoutManager = LinearLayoutManager(context)
            adapter = initRecyclerView()
        }
    }

    private fun initRecyclerView(values: List<User> = emptyList()): ScoreRecyclerViewAdapted {
        adapter = ScoreRecyclerViewAdapted(values)
        return adapter
    }

    private fun updateUsers(){
        val repository = (requireActivity().application as FantsApp).myComponent.userRepository
        adapter.values.forEach { user->
            scope.launch {
                repository.updateUser(user = user.apply {
                    countSuccessfulTask =0
                })
            }
        }
    }
}