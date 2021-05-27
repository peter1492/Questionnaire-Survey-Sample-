package com.trivia.kotlin.appscriptask.ui.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.google.gson.Gson
import com.trivia.kotlin.appscriptask.databinding.FragmentGameOverBinding
import com.trivia.kotlin.appscriptask.modal.Summary
import com.trivia.kotlin.appscriptask.view_models.GameOverViewModel
import dagger.hilt.android.AndroidEntryPoint


//save the final q/a session
@AndroidEntryPoint
class FragmentGameOver : Fragment(){

    private val viewModel : GameOverViewModel by viewModels()
    private lateinit var binding : FragmentGameOverBinding
    private val args: FragmentGameOverArgs by navArgs()
    private var finalSummary: Summary? = null


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentGameOverBinding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        if (savedInstanceState == null){
            //get the argument value
            finalSummary = args.summary
        }else{
            //in state of orientation/ state change get the save state
            finalSummary = Gson().fromJson(savedInstanceState.getString("finalSummary"),Summary::class.java)
        }

        //Binding the views with the data
        binding.greet = "Hello ${finalSummary?.name}"
        binding.summary = "${finalSummary?.summary}"

        if (savedInstanceState == null){
            //store the final argument value to db
            viewModel.insertSummaryData(finalSummary)
        }
        arguments?.clear()

        binding.restart.setOnClickListener {
            findNavController().navigateUp()
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
            //save the state of the object
        outState.putString("finalSummary",Gson().toJson(finalSummary))
    }

    override fun onDestroyView() {
        super.onDestroyView()
        arguments?.clear()
    }
}