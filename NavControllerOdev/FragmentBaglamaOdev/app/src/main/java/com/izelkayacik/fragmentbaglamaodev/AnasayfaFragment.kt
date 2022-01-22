package com.izelkayacik.fragmentbaglamaodev

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_anasayfa.view.*


class AnasayfaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val tasarim = inflater.inflate(R.layout.fragment_anasayfa, container, false)

        tasarim.btnA.setOnClickListener {
            findNavController().navigate(R.id.action_anasayfaFragment_to_sayfaAFragment)
        }
        tasarim.btnX.setOnClickListener {
            findNavController().navigate(R.id.action_anasayfaFragment_to_sayfaXFragment)
        }
        return tasarim
    }
}