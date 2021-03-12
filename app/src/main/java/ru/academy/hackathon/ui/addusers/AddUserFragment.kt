package ru.academy.hackathon.ui.addusers

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import ru.academy.hackathon.R
import ru.academy.hackathon.application.FantsApp
import ru.academy.hackathon.data.models.User
import ru.academy.hackathon.databinding.UsersFragmentBinding
import ru.academy.hackathon.ui.adapters.AddUserAdapter
import ru.academy.hackathon.ui.viewmodels.AddUserViewModel

class AddUserFragment : Fragment(R.layout.users_fragment) {

    private var _binding: UsersFragmentBinding? = null
    private val binding get() = _binding!!
    private lateinit var userAdapter: AddUserAdapter
    private lateinit var viewModel: AddUserViewModel

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setupRecyclerView()
        viewModel =
            (requireActivity().application as FantsApp).myComponent.getAddUserViewModel(fragment = this@AddUserFragment)

        viewModel.users.observe(viewLifecycleOwner,this::updateAdapter)

        binding.addUser.setOnClickListener {
            val user = User(name = binding.enterUsername.text.toString())
            viewModel.addUser(user=user)
        }
    }

    private fun setupRecyclerView() {
        userAdapter = AddUserAdapter()
        binding.addUserRecyclerView.apply {
            layoutManager = LinearLayoutManager(requireContext())
            adapter = userAdapter
        }
        binding.addUserRecyclerView.layoutManager = LinearLayoutManager(requireContext())
    }

    private fun updateAdapter(users : List<User>){
        userAdapter.bindUsers(users=users)
    }
}