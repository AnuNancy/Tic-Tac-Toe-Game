package com.anuradha.multiplayer.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.anuradha.multiplayer.R
import com.anuradha.multiplayer.activity.MainActivity

class AboutFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        (activity as MainActivity).supportActionBar?.title = "About"
        return inflater.inflate(R.layout.fragment_about, container, false)
    }
}