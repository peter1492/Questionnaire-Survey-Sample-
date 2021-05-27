package com.trivia.kotlin.appscriptask.ui.screens

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavArgs
import com.trivia.kotlin.appscriptask.modal.Summary
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class Fragment3Args(
  public val summary: Summary
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
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

  public companion object {
    @JvmStatic
    public fun fromBundle(bundle: Bundle): Fragment3Args {
      bundle.setClassLoader(Fragment3Args::class.java.classLoader)
      val __summary : Summary?
      if (bundle.containsKey("summary")) {
        if (Parcelable::class.java.isAssignableFrom(Summary::class.java) ||
            Serializable::class.java.isAssignableFrom(Summary::class.java)) {
          __summary = bundle.get("summary") as Summary?
        } else {
          throw UnsupportedOperationException(Summary::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__summary == null) {
          throw IllegalArgumentException("Argument \"summary\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"summary\" is missing and does not have an android:defaultValue")
      }
      return Fragment3Args(__summary)
    }
  }
}
