package com.izelkayacik.fragmentbaglamaodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation

class SayfaYFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val tasarim = inflater.inflate(R.layout.fragment_sayfa_y, container, false)
        return tasarim
    }
}