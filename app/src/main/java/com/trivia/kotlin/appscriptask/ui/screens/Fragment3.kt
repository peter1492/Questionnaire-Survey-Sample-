package com.trivia.kotlin.appscriptask.ui.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.trivia.kotlin.appscriptask.util.Constants
import com.trivia.kotlin.appscriptask.databinding.Fragment3Binding
import com.trivia.kotlin.appscriptask.modal.Question


//screen to hold checkbox options
class Fragment3 : Fragment() {

    private lateinit var binding: Fragment3Binding
    private val args: Fragment3Args by navArgs()


    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        binding = Fragment3Binding.inflate(inflater)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val question = Constants.questionList[1]
        binding.question = question
        binding.next3.setOnClickListener { v ->

            //Getting the previous summary from the args
            val summary = args.summary

            //Get the list of selected answer
            val ans = getSelectedAnswer(question)

            //check if  answers are selected
            if (ans.isNullOrEmpty() || ans.isEmpty()) {
                Toast.makeText(context, "Must Select a option", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            //get the previous summary object and append  the argument (containing question  selected answer) and pass to the next navigation view
            val ansInString = ans.toString()
            summary.summary += "\n" + question.question + "\n" + ansInString.substring(1, ansInString.length - 1) + "\n"

            //Pass the data to GameOverScreen using SafeArgs
            val action = Fragment3Directions.actionFragment3ToFragmentGameOver(summary)
            findNavController().navigate(action)
        }

    }


    //Get the checked answers from the answer list
    private fun getSelectedAnswer(question: Question): ArrayList<String> {
        var ans = arrayListOf<String>()
        if (binding.option1Ques3.isChecked) {
            ans.add(question.option1)
        }

        if (binding.option2Ques3.isChecked) {
            ans.add(question.option2)
        }

        if (binding.option3Ques3.isChecked) {
            ans.add(question.option3)
        }

        if (binding.option4Ques3.isChecked) {
            ans.add(question.option4)
        }

        return ans
    }
}
