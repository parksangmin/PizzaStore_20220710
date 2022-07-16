package com.sangmin.pizzastore_20220710.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.sangmin.pizzastore_20220710.Fragments.ChickenFragment
import com.sangmin.pizzastore_20220710.Fragments.PizzaFragment
import com.sangmin.pizzastore_20220710.Fragments.ProfileFragment

class MainViewPagerAdapter(
    fm :FragmentManager
) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 3

    }

    override fun getItem(position: Int): Fragment {
        when(position) {
            0 -> {
               return PizzaFragment()
            }
            1 -> {
                return ChickenFragment()
            }
            else -> {
                return  ProfileFragment()
            }
        }

    }

//    제목을 나타내기 위해서
    override fun getPageTitle(position: Int): CharSequence? {
        when(position) {
            0 -> {
                return "피자 가게"
            }
            1 -> {
                return "치킨 가게"
            }
            else -> {
                return "내 정보 설정"
            }
        }
    }

}