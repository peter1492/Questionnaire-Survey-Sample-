package com.trivia.kotlin.appscriptask.ui.screens

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import androidx.recyclerview.widget.DividerItemDecoration
import com.trivia.kotlin.appscriptask.view_models.HistoryViewModel
import com.trivia.kotlin.appscriptask.adapter.HistoryAdapter
import com.trivia.kotlin.appscriptask.databinding.FragmentHistoryBinding
import dagger.hilt.android.AndroidEntryPoint

//view all q/a sessions
@AndroidEntryPoint
class FragmentHistory : Fragment() {

    private lateinit var binding : FragmentHistoryBinding
    private val viewModel : HistoryViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHistoryBinding.inflate(layoutInflater)
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val summaryAdapter = HistoryAdapter()

        binding.historyRecyclerView.apply {
            setHasFixedSize(true)
            adapter = summaryAdapter
            addItemDecoration(DividerItemDecoration(context,LinearLayout.VERTICAL))
        }

        viewModel.summaryList.observe(viewLifecycleOwner){
            summaryAdapter.submitList(it)
            if (summaryAdapter.itemCount == 0 ){
                binding.empty.visibility = View.VISIBLE
            }else{
                binding.empty.visibility = View.GONE
            }
        }

    }
}