package com.asianaidt.orderapp.Adatpers

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.asianaidt.orderapp.Fragments.MyProfileFragment
import com.asianaidt.orderapp.Fragments.PizzaOrderFragment

class MainViewPagerAdapter(fm : FragmentManager) : FragmentStatePagerAdapter(fm) {

    override fun getCount() = 2

    override fun getItem(position: Int): Fragment {

        return when(position){
            0 -> PizzaOrderFragment()
            else -> MyProfileFragment()
        }

    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "피자 주문"
            else -> "내정보 설정"
        }
    }


}