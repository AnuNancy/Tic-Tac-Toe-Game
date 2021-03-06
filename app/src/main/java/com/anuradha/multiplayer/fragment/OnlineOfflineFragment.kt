package com.anuradha.multiplayer.fragment

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import com.anuradha.multiplayer.R
import com.anuradha.multiplayer.activity.MainActivity
import com.anuradha.multiplayer.activity.OfflineActivity
import com.anuradha.multiplayer.activity.OnlineActivity

class OnlineOfflineFragment : Fragment() {

    private lateinit var btnOffline: Button
    private lateinit var btnOnline: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view =  inflater.inflate(R.layout.fragment_online_offline, container, false)
        init(view)
        btnOffline.setOnClickListener {
            startActivity(Intent(activity, OfflineActivity::class.java))
        }
        btnOnline.setOnClickListener {
            startActivity(Intent(activity, OnlineActivity::class.java))
        }
        return view
    }

    private fun init(view: View) {
        btnOffline = view.findViewById(R.id.btnOffline)
        btnOnline = view.findViewById(R.id.btnOnline)
        (activity as MainActivity).supportActionBar?.title = "Multi Player Mode"
    }
}