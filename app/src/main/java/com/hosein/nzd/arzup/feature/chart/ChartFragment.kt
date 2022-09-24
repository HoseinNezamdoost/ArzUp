package com.hosein.nzd.arzup.feature.chart

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hosein.nzd.arzup.R
import kotlinx.android.synthetic.main.fragment_chart.*

class ChartFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_chart, container, false)
    }

}