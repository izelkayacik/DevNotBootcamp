package com.izelkayacik.kisileruygulamasi.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.izelkayacik.kisileruygulamasi.R
import com.izelkayacik.kisileruygulamasi.databinding.FragmentAnasayfaBinding
import com.izelkayacik.kisileruygulamasi.entity.Kisiler


class AnasayfaFragment : Fragment() {
    private lateinit var tasarim:FragmentAnasayfaBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater, container, false)

        tasarim.fab.setOnClickListener{
            //Navigation.findNavController(it).navigate(R.id.kisiKayitGecis)

            val kisi = Kisiler(1, "Ahmet", "11111")
            val gecis = AnasayfaFragmentDirections.kisiDetayGecis(kisi)
            Navigation.findNavController(it).navigate(gecis)
        }

        return tasarim.root
    }
}