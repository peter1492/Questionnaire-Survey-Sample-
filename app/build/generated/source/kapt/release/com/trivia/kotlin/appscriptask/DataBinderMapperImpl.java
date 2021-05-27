package com.trivia.kotlin.appscriptask;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.trivia.kotlin.appscriptask.databinding.Fragment1BindingImpl;
import com.trivia.kotlin.appscriptask.databinding.Fragment2BindingImpl;
import com.trivia.kotlin.appscriptask.databinding.Fragment3BindingImpl;
import com.trivia.kotlin.appscriptask.databinding.FragmentGameOverBindingImpl;
import com.trivia.kotlin.appscriptask.databinding.FragmentHistoryBindingImpl;
import com.trivia.kotlin.appscriptask.databinding.HistoryItemBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_FRAGMENT1 = 1;

  private static final int LAYOUT_FRAGMENT2 = 2;

  private static final int LAYOUT_FRAGMENT3 = 3;

  private static final int LAYOUT_FRAGMENTGAMEOVER = 4;

  private static final int LAYOUT_FRAGMENTHISTORY = 5;

  private static final int LAYOUT_HISTORYITEM = 6;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(6);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.trivia.kotlin.appscriptask.R.layout.fragment_1, LAYOUT_FRAGMENT1);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.trivia.kotlin.appscriptask.R.layout.fragment_2, LAYOUT_FRAGMENT2);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.trivia.kotlin.appscriptask.R.layout.fragment_3, LAYOUT_FRAGMENT3);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.trivia.kotlin.appscriptask.R.layout.fragment_game_over, LAYOUT_FRAGMENTGAMEOVER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.trivia.kotlin.appscriptask.R.layout.fragment_history, LAYOUT_FRAGMENTHISTORY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.trivia.kotlin.appscriptask.R.layout.history_item, LAYOUT_HISTORYITEM);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_FRAGMENT1: {
          if ("layout/fragment_1_0".equals(tag)) {
            return new Fragment1BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_1 is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENT2: {
          if ("layout/fragment_2_0".equals(tag)) {
            return new Fragment2BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_2 is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENT3: {
          if ("layout/fragment_3_0".equals(tag)) {
            return new Fragment3BindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_3 is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTGAMEOVER: {
          if ("layout/fragment_game_over_0".equals(tag)) {
            return new FragmentGameOverBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_game_over is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTHISTORY: {
          if ("layout/fragment_history_0".equals(tag)) {
            return new FragmentHistoryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_history is invalid. Received: " + tag);
        }
        case  LAYOUT_HISTORYITEM: {
          if ("layout/history_item_0".equals(tag)) {
            return new HistoryItemBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for history_item is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(1);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(6);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "greet");
      sKeys.put(2, "history");
      sKeys.put(3, "question");
      sKeys.put(4, "restart");
      sKeys.put(5, "summary");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(6);

    static {
      sKeys.put("layout/fragment_1_0", com.trivia.kotlin.appscriptask.R.layout.fragment_1);
      sKeys.put("layout/fragment_2_0", com.trivia.kotlin.appscriptask.R.layout.fragment_2);
      sKeys.put("layout/fragment_3_0", com.trivia.kotlin.appscriptask.R.layout.fragment_3);
      sKeys.put("layout/fragment_game_over_0", com.trivia.kotlin.appscriptask.R.layout.fragment_game_over);
      sKeys.put("layout/fragment_history_0", com.trivia.kotlin.appscriptask.R.layout.fragment_history);
      sKeys.put("layout/history_item_0", com.trivia.kotlin.appscriptask.R.layout.history_item);
    }
  }
}
