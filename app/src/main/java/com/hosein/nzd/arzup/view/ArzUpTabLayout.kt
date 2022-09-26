package com.hosein.nzd.arzup.view

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.util.AttributeSet
import android.widget.FrameLayout
import android.widget.TextView
import com.hosein.nzd.arzup.R

class ArzUpTabLayout(context: Context, attr: AttributeSet)
    : FrameLayout(context, attr){

    val onClickItemTabLayout : OnClickItemTabLayout? = null

        init {
            inflate(context , R.layout.item_tab_layout , this )
            val saved = findViewById<TextView>(R.id.saved)
            val cryptoCurrency = findViewById<TextView>(R.id.cryptoCurrency)
            val select = findViewById<TextView>(R.id.select)

            val def : ColorStateList = saved.textColors

            cryptoCurrency.setOnClickListener {
                select.animate().x(0f).setDuration(100)
                cryptoCurrency.setTextColor(Color.WHITE)
                saved.setTextColor(def)
                onClickItemTabLayout?.onSaved()
            }
            saved.setOnClickListener {
                cryptoCurrency.setTextColor(def)
                saved.setTextColor(Color.WHITE)
                val size = saved.width
                select.animate().x(size.toFloat()).setDuration(100)
                onClickItemTabLayout?.onCryptoCurrency()
            }
        }
}

interface OnClickItemTabLayout{
    fun onSaved()
    fun onCryptoCurrency()
}