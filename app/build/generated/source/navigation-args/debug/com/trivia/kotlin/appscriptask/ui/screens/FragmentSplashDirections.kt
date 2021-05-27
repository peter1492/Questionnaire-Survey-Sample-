package com.trivia.kotlin.appscriptask.ui.screens

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.trivia.kotlin.appscriptask.R

public class FragmentSplashDirections private constructor() {
  public companion object {
    public fun actionFragmentSplashToFragment12(): NavDirections =
        ActionOnlyNavDirections(R.id.action_fragmentSplash_to_fragment12)

    public fun actionFragmentSplashToFragmentHistory(): NavDirections =
        ActionOnlyNavDirections(R.id.action_fragmentSplash_to_fragmentHistory)
  }
}
