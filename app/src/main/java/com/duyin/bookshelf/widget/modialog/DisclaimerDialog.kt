package com.duyin.bookshelf.widget.modialog

import android.content.Context
import android.widget.TextView
import com.duyin.bookshelf.R

/**
created by edison 2020-02-23
 */
class DisclaimerDialog(dialogCallBack: DisclaimerDialogCallBack,context: Context) : BaseDialog(context) {

    public interface DisclaimerDialogCallBack{
        fun onAccessClick()

        fun onNotAccessClick()
    }

    init {
        setContentView(R.layout.dialog_disclaimer)

        findViewById<TextView>(R.id.tv_no_access).setOnClickListener {
            dialogCallBack.onNotAccessClick()
        }

        findViewById<TextView>(R.id.tv_access).setOnClickListener {
            dialogCallBack.onAccessClick()
        }
    }





}