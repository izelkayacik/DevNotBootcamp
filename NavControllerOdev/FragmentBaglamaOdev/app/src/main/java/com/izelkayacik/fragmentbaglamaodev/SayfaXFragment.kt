package com.izelkayacik.fragmentbaglamaodev

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import kotlinx.android.synthetic.main.fragment_anasayfa.view.*
import kotlinx.android.synthetic.main.fragment_sayfa_b.view.*
import kotlinx.android.synthetic.main.fragment_sayfa_x.view.*


class SayfaXFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        val tasarim = inflater.inflate(R.layout.fragment_sayfa_x, container, false)
        tasarim.btnXtoY.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_sayfaXFragment_to_sayfaYFragment)
        }
        return tasarim
    }
}