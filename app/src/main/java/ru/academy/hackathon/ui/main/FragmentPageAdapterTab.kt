package ru.academy.hackathon.ui.main

import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class FragmentPageAdapterTab(val childFragmentManager: FragmentManager) : FragmentPagerAdapter(
    childFragmentManager,
    BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT
) {
    override fun getItem(position: Int): FragmentCategoryListPage =
        when (position) {
            0 -> FragmentCategoryListPage(CategoryFant.Category1)
            1 -> FragmentCategoryListPage(CategoryFant.Category2)
            2 -> FragmentCategoryListPage(CategoryFant.Category3)
            3 -> FragmentCategoryListPage(CategoryFant.Category4)
            else -> FragmentCategoryListPage(CategoryFant.Category1)
        }

    override fun getCount(): Int {
        return 4;
    }

    override fun getPageTitle(position: Int): CharSequence {
        return CategoryFant.values()[position].text;
    }
}