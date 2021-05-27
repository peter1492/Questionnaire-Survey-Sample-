package com.trivia.kotlin.appscriptask.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.trivia.kotlin.appscriptask.databinding.HistoryItemBinding
import com.trivia.kotlin.appscriptask.modal.Summary


//Adapter for displaying the history data
class HistoryAdapter :
    androidx.recyclerview.widget.ListAdapter<Summary, HistoryAdapter.SummaryViewHolder>(
        DiffUtilCallback()
    ) {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SummaryViewHolder {
        return SummaryViewHolder(
            HistoryItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    //binder
    override fun onBindViewHolder(holder: SummaryViewHolder, position: Int) {
        getItem(position)?.let {
            holder.bind(getItem(position),position)
        }
    }

    //view holder for data binding
    class SummaryViewHolder(private val historyItemBinding: HistoryItemBinding) :
        RecyclerView.ViewHolder(historyItemBinding.root) {

            fun bind(summary: Summary,position: Int){
                historyItemBinding.heading.text = "Game ${position+1}: ${summary.startDateFormatted}"
                historyItemBinding.name.text = "Hello: ${summary.name}"
                historyItemBinding.summary.text = summary.summary
            }
    }
}

//to refresh items in list in a optimized manner
class DiffUtilCallback : DiffUtil.ItemCallback<Summary>() {
    override fun areItemsTheSame(oldItem: Summary, newItem: Summary) =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: Summary, newItem: Summary) =
        oldItem == newItem

}