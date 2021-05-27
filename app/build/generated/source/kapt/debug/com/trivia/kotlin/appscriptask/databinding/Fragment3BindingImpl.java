package com.trivia.kotlin.appscriptask.databinding;
import com.trivia.kotlin.appscriptask.R;
import com.trivia.kotlin.appscriptask.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class Fragment3BindingImpl extends Fragment3Binding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.answer_3_rg, 6);
        sViewsWithIds.put(R.id.next_3, 7);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public Fragment3BindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private Fragment3BindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.Button) bindings[7]
            , (android.widget.CheckBox) bindings[2]
            , (android.widget.CheckBox) bindings[3]
            , (android.widget.CheckBox) bindings[4]
            , (android.widget.CheckBox) bindings[5]
            , (android.widget.TextView) bindings[1]
            );
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.option1Ques3.setTag(null);
        this.option2Ques3.setTag(null);
        this.option3Ques3.setTag(null);
        this.option4Ques3.setTag(null);
        this.question3Text.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.question == variableId) {
            setQuestion((com.trivia.kotlin.appscriptask.modal.Question) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setQuestion(@Nullable com.trivia.kotlin.appscriptask.modal.Question Question) {
        this.mQuestion = Question;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.question);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String questionOption1 = null;
        java.lang.String questionOption2 = null;
        java.lang.String questionQuestion = null;
        java.lang.String questionOption3 = null;
        java.lang.String questionOption4 = null;
        com.trivia.kotlin.appscriptask.modal.Question question = mQuestion;

        if ((dirtyFlags & 0x3L) != 0) {



                if (question != null) {
                    // read question.option1
                    questionOption1 = question.getOption1();
                    // read question.option2
                    questionOption2 = question.getOption2();
                    // read question.question
                    questionQuestion = question.getQuestion();
                    // read question.option3
                    questionOption3 = question.getOption3();
                    // read question.option4
                    questionOption4 = question.getOption4();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.option1Ques3, questionOption1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.option2Ques3, questionOption2);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.option3Ques3, questionOption3);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.option4Ques3, questionOption4);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.question3Text, questionQuestion);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): question
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}