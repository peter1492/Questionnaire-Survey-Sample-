package com.trivia.kotlin.appscriptask.ui.screens

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.trivia.kotlin.appscriptask.R

public class FragmentGameOverDirections private constructor() {
  public companion object {
    public fun actionFragmentGameOverToFragmentHistory(): NavDirections =
        ActionOnlyNavDirections(R.id.action_fragmentGameOver_to_fragmentHistory)
  }
}
