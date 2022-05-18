package com.asianaidt.orderapp.Fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.asianaidt.orderapp.R

class PizzaOrderFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza_order,container,false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {



        super.onActivityCreated(savedInstanceState)
    }

}