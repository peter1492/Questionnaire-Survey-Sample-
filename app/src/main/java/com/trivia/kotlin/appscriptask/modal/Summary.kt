package com.trivia.kotlin.appscriptask.modal

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.android.parcel.Parcelize
import java.text.DateFormat


//table to hold name, time -> question/answers
@Parcelize
@Entity(tableName = "summary_table")
data class Summary(

    @PrimaryKey(autoGenerate = true)
    var id : Int = 0,
    val name: String,
    val startDate : Long,
    var summary : String? = null
):Parcelable {
    val startDateFormatted : String
        get() = DateFormat.getDateTimeInstance().format(startDate)
}


//data class for question/ answer holder
data class Question(
    val question: String,
    val option1: String,
    val option2: String,
    val option3: String,
    val option4: String,
    val answer: String? = null
)