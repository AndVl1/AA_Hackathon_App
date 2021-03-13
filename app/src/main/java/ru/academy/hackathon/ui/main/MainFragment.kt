package ru.academy.hackathon.ui.main

import android.animation.AnimatorInflater
import android.animation.AnimatorSet
import android.content.Context
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.animation.addListener
import androidx.core.os.postDelayed
import ru.academy.hackathon.R
import ru.academy.hackathon.databinding.MainFragmentBinding
import ru.academy.hackathon.databinding.UsersFragmentBinding

interface CallbacksMainFragment {
    fun openSettings()
    fun openRules()
    fun openAddUsers()
}

class MainFragment : Fragment() {

    private var _binding: MainFragmentBinding? = null
    private val binding get() = _binding!!

    private var callback: CallbacksMainFragment? = null

    private val animator = AnimatorSet()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = MainFragmentBinding.inflate(inflater)
        return _binding?.root
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        if (context is CallbacksMainFragment) callback = context
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.gameRuler.setOnClickListener {
            startAnimation()
            Handler().postDelayed(1500){
                callback?.openRules()
            }
        }

        binding.gameSettings.setOnClickListener {
            startAnimation()
            Handler().postDelayed(1500){
                callback?.openSettings()
            }
        }

        binding.gameStart.setOnClickListener {
            startAnimation()
            Handler().postDelayed(1500){
                callback?.openAddUsers()
            }
        }
    }

    private fun startAnimation() {
        val smileAnimator =
            AnimatorInflater.loadAnimator(requireContext(), R.animator.smile_animation)
        val smileAnimator2 =
            AnimatorInflater.loadAnimator(requireContext(), R.animator.smile_animation)
        val smileAnimator3 =
            AnimatorInflater.loadAnimator(requireContext(), R.animator.smile_animation)
        val smileAnimator4 =
            AnimatorInflater.loadAnimator(requireContext(), R.animator.smile_animation)
        val smileAnimator5 =
            AnimatorInflater.loadAnimator(requireContext(), R.animator.smile_animation)
        smileAnimator.setTarget(binding.smile1)
        smileAnimator2.setTarget(binding.smile2)
        smileAnimator3.setTarget(binding.smile3)
        smileAnimator4.setTarget(binding.smile4)
        smileAnimator5.setTarget(binding.smile5)

        animator.playTogether(
            smileAnimator,
            smileAnimator2,
            smileAnimator3,
            smileAnimator4,
            smileAnimator5
        )

        animator.start()
    }
}

enum class Action {
    ADDUSERS, SETTINGS, RULERS
}
