package ru.academy.hackathon.ui.rules

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import ru.academy.hackathon.databinding.RulesFragmentBinding

interface CallbacksRulesFragment {
    fun backTo()
}

class RulesFragment : Fragment() {

    private var _binding: RulesFragmentBinding? = null
    private val binding get() = _binding!!

    private var callbacks : CallbacksRulesFragment? = null

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = RulesFragmentBinding.inflate(inflater)

        return _binding?.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.backRulesButton.setOnClickListener {
            callbacks?.backTo()
        }
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if(context is CallbacksRulesFragment) callbacks = context
    }
}
