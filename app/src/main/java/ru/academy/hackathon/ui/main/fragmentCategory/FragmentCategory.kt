package ru.academy.hackathon.ui.main.fragmentCategory

import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.PagerTabStrip
import androidx.viewpager.widget.ViewPager
import ru.academy.hackathon.R

class FragmentCategory () : Fragment(), View.OnClickListener   {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View = inflater.inflate(R.layout.fragment_category, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val viewPager: ViewPager = view.findViewById(R.id.viewpager)
        viewPager.adapter =
            FragmentPageAdapterTab(
                getChildFragmentManager()
            )
        viewPager.currentItem = 0
        val pagerTabStrip: PagerTabStrip = view.findViewById(R.id.pagerTabStrip)
        pagerTabStrip.drawFullUnderline = false
        pagerTabStrip.setTabIndicatorColorResource(R.color.design_default_color_primary)
    }

    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.toGameButton -> {

                // переход на игру

            }
        }

    }


//    toGameButton

}