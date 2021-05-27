package com.trivia.kotlin.appscriptask.ui.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.trivia.kotlin.appscriptask.databinding.Fragment1Binding
import com.trivia.kotlin.appscriptask.modal.Summary


//screen to holder name of the user
class Fragment1 : Fragment() {
    private lateinit var binding : Fragment1Binding
    private lateinit var name : String

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //view binder
        binding = Fragment1Binding.inflate(layoutInflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.next1.setOnClickListener { v->
            name = binding.answer1Et.text.toString()

            //check if name is present
            if (name.isEmpty()){
                Toast.makeText(context,"Name cannot be empty",Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            //pass the argument (containing name) to the next navigation view
            val summary = Summary(name = name,startDate = System.currentTimeMillis())
            val action = Fragment1Directions.actionFragment12ToFragment2(summary)
            findNavController().navigate(action)
        }
    }

}