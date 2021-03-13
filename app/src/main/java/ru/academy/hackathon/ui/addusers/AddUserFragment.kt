package ru.academy.hackathon.ui.addusers

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import ru.academy.hackathon.R
import ru.academy.hackathon.application.FantsApp
import ru.academy.hackathon.data.models.User
import ru.academy.hackathon.databinding.UsersFragmentBinding
import ru.academy.hackathon.ui.adapters.AddUserAdapter
import ru.academy.hackathon.ui.viewmodels.AddUserViewModel

interface CallbacksAddUserFragment {
    fun openGame()
    fun backTo()
}

class AddUserFragment : Fragment() {

    private var _binding: UsersFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var userAdapter: AddUserAdapter
    private lateinit var viewModel: AddUserViewModel

    private var callback: CallbacksAddUserFragment? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = UsersFragmentBinding.inflate(inflater)
        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        viewModel =
            (requireActivity().application as FantsApp).myComponent.getAddUserViewModel(fragment = this@AddUserFragment)

        viewModel.users.observe(viewLifecycleOwner, this::updateAdapter)

        binding.addUser.setOnClickListener {
            val user = User(name = binding.enterUsername.text.toString())
            viewModel.addUser(user = user)
        }

        binding.backMainFragmentButton.setOnClickListener {
            callback?.backTo()
        }

        binding.nextFragmentGame.setOnClickListener {
            callback?.openGame()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is CallbacksAddUserFragment) callback = context
    }

    private fun setupRecyclerView() {
        userAdapter = AddUserAdapter()
        binding.addUserRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = userAdapter
        }
    }

    private fun updateAdapter(users: List<User>) {
        Log.d("AAA", "AAAAAAA")
        userAdapter.bindUsers(users = users)
        userAdapter.notifyDataSetChanged()
    }
}