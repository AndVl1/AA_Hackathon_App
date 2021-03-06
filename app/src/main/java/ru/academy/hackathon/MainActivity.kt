package ru.academy.hackathon

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.Navigation
import ru.academy.hackathon.ui.Router
import ru.academy.hackathon.ui.addusers.CallbacksAddUserFragment
import ru.academy.hackathon.ui.game.CallbacksGameFragment
import ru.academy.hackathon.ui.main.CallbacksMainFragment
import ru.academy.hackathon.ui.main.fragmentCategory.CallbacksFragmentCategory
import ru.academy.hackathon.ui.rules.CallbacksRulesFragment
import ru.academy.hackathon.ui.score.CallbacksScoreFragments

class MainActivity : AppCompatActivity(), Router, CallbacksAddUserFragment, CallbacksRulesFragment,
    CallbacksMainFragment, CallbacksFragmentCategory, CallbacksScoreFragments,
    CallbacksGameFragment {

    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        navController = Navigation.findNavController(this@MainActivity, R.id.nav_host_fragment)
    }

    override fun openRules() =
        navController.navigate(R.id.action_mainFragment_to_rulesFragment)


    override fun openSettings() {
        navController.navigate(R.id.action_mainFragment_to_fragmentCategory)
    }

    override fun openAddUsers(){
        navController?.navigateUp()
        navController.navigate(R.id.action_mainFragment_to_addUserFragment)
    }



    override fun openGame() =
        navController.navigate(R.id.action_addUserFragment_to_gameFragment)

    override fun backToMainFragmentWithAddUserFragment() {
        navController.navigate(R.id.action_addUserFragment_to_mainFragment)
    }


    override fun backTo() {
        navController.popBackStack()
    }

    override fun openEndGame() {
        navController.navigate(R.id.action_gameFragment_to_scoreFragments)
    }

    override fun openGameWithFragmentCategory() {
        navController.navigate(R.id.action_fragmentCategory_to_gameFragment)
    }

    override fun openMainFragmentWithScoreFragments() {
        navController.navigate(R.id.action_scoreFragments_to_mainFragment)
    }

    override fun openAddUserFragmentWithScoreFragments() {
        navController.navigate(R.id.action_scoreFragments_to_addUserFragment)
    }
}
