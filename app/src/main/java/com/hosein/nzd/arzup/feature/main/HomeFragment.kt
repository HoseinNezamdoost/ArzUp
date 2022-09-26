package com.hosein.nzd.arzup.feature.main

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.hosein.nzd.arzup.R
import com.hosein.nzd.arzup.common.TAG
import kotlinx.android.synthetic.main.fragment_home.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class HomeFragment : Fragment() {

    val viewModel : HomeViewModel by viewModel()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        viewModel.categoryLiveData.observe(viewLifecycleOwner){
            Log.i(TAG, "onViewCreated: ${it.data[0].id}")
        }

        viewModel.errorLiveData.observe(viewLifecycleOwner){
            Log.e(TAG, "onViewCreated: $it" )
        }

    }

}