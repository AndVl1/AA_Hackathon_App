package ru.academy.hackathon.ui.addusers

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.text.InputType
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.observe
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import ru.academy.hackathon.R
import ru.academy.hackathon.application.FantsApp
import ru.academy.hackathon.data.models.User
import ru.academy.hackathon.databinding.UsersFragmentBinding
import ru.academy.hackathon.ui.adapters.AddUserAdapter
import ru.academy.hackathon.ui.viewmodels.AddUserViewModel

interface CallbacksAddUserFragment {
    fun openGame()
    fun backToMainFragmentWithAddUserFragment()
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
        setupTouchListener()
        viewModel =
            (requireActivity().application as FantsApp).myComponent.getAddUserViewModel(fragment = this@AddUserFragment)

//        viewModel.users.observe(viewLifecycleOwner, this::updateAdapter)

        viewModel.pagedUsers.observe(viewLifecycleOwner, Observer {
            userAdapter.submitList(it)
        })

        binding.addUser.setOnClickListener {
            val userName = binding.enterUsername.text.toString()
            if (userName.isNotBlank()) {
                val user = User(name = binding.enterUsername.text.toString())
                viewModel.addUser(user = user)
                clearEditText()
            } else {
                showToast(text = getString(R.string.enter_username_toast_text))
            }
        }

        binding.backMainFragmentButton.setOnClickListener {
            callback?.backToMainFragmentWithAddUserFragment()
        }

        binding.nextFragmentGame.setOnClickListener {
            if (userAdapter.itemCount >= 2) {
                checkAllFants()
            } else {
                showToast(text = getString(R.string.toast_text_small_users))
            }
        }

        with(binding.clearUsersButton) {
//            visibility = if (userAdapter.itemCount > 0)
//                View.VISIBLE
//            else
//                View.INVISIBLE
            setOnClickListener { viewModel.clearUsers() }
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

    private fun clearEditText() {
        binding.enterUsername.setText("")
        binding.enterUsername.inputType = InputType.TYPE_NULL
    }

    private fun setupTouchListener() {
        ItemTouchHelper(object : ItemTouchHelper.SimpleCallback(
            0,
            ItemTouchHelper.LEFT or ItemTouchHelper.RIGHT
        ) {
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                return false
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {
                // ?????????????????? ???? ??????????
                viewModel.deleteUser(user = userAdapter.getUserItem(viewHolder.adapterPosition)!!)
            }
        }).attachToRecyclerView(binding.addUserRecyclerView)
    }

    private fun updateAdapter(users: List<User>) {
        userAdapter.bindUsers(users = users)
    }

    private fun showToast(text: String) =
        Toast.makeText(requireContext(), text, Toast.LENGTH_LONG).show()

    private fun checkAllFants() {
        (requireActivity().application as FantsApp).myComponent.userRepository.getAllFant()
            .observe(viewLifecycleOwner) {fants->
                if(fants.isNotEmpty()){
                    callback?.openGame()
                }else{
                    showToast(text=getString(R.string.small_fants_toast_text))
                }
            }
    }
}
