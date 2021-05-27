package com.trivia.kotlin.appscriptask.ui.screens

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.trivia.kotlin.appscriptask.R
import com.trivia.kotlin.appscriptask.modal.Summary
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class Fragment3Directions private constructor() {
  private data class ActionFragment3ToFragmentGameOver(
    public val summary: Summary
  ) : NavDirections {
    public override fun getActionId(): Int = R.id.action_fragment3_to_fragmentGameOver

    @Suppress("CAST_NEVER_SUCCEEDS")
    public override fun getArguments(): Bundle {
      val result = Bundle()
      if (Parcelable::class.java.isAssignableFrom(Summary::class.java)) {
        result.putParcelable("summary", this.summary as Parcelable)
      } else if (Serializable::class.java.isAssignableFrom(Summary::class.java)) {
        result.putSerializable("summary", this.summary as Serializable)
      } else {
        throw UnsupportedOperationException(Summary::class.java.name +
            " must implement Parcelable or Serializable or must be an Enum.")
      }
      return result
    }
  }

  public companion object {
    public fun actionFragment3ToFragmentGameOver(summary: Summary): NavDirections =
        ActionFragment3ToFragmentGameOver(summary)
  }
}
