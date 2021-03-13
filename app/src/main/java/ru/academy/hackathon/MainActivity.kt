package ru.academy.hackathon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.NavController
import androidx.navigation.Navigation
import ru.academy.hackathon.ui.addusers.AddUserFragment
import ru.academy.hackathon.ui.Router
import ru.academy.hackathon.ui.addusers.CallbacksAddUserFragment
import ru.academy.hackathon.ui.main.CallbacksMainFragment
import ru.academy.hackathon.ui.rules.CallbacksRulesFragment

class MainActivity : AppCompatActivity(), Router  ,CallbacksAddUserFragment , CallbacksRulesFragment , CallbacksMainFragment {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        navController = Navigation.findNavController(this@MainActivity, R.id.nav_host_fragment)
    }

    override fun openRules() =
        navController.navigate(R.id.action_mainFragment_to_rulesFragment)


    override fun openSettings() {
        //TODO()
    }

    override fun openAddUsers() =
        navController.navigate(R.id.action_mainFragment_to_addUserFragment)


    override fun openGame() =
        navController.navigate(R.id.action_addUserFragment_to_gameFragment)


    override fun backTo() {
        navController.popBackStack()
    }

    override fun openEndGame() {
        TODO("Not yet implemented")
    }
}