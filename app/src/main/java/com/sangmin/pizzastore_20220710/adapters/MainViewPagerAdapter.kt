package com.sangmin.pizzastore_20220710.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.sangmin.pizzastore_20220710.Fragments.PizzaFragment
import com.sangmin.pizzastore_20220710.Fragments.ProfileFragment

class MainViewPagerAdapter(
    fm :FragmentManager
) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 2

    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> {
               return PizzaFragment()
            }
            else -> {
                return ProfileFragment()
            }
        }

    }

    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {
                return "피자 가게"
            }
            else -> {
                return "내 정보 설정"
            }
        }
    }

}