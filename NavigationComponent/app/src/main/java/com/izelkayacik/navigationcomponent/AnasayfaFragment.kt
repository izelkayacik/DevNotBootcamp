package com.izelkayacik.navigationcomponent

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.google.android.material.snackbar.Snackbar
import com.izelkayacik.navigationcomponent.databinding.FragmentAnasayfaBinding

class AnasayfaFragment : Fragment() {

    private lateinit var tasarim:FragmentAnasayfaBinding
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        tasarim = FragmentAnasayfaBinding.inflate(inflater,container,false)

        tasarim.buttonBasla.setOnClickListener {
            val kisi = Kisiler("Mehmet", 34, 1.98f, false)
            val gecis = AnasayfaFragmentDirections.oyunEkraninaGecis("Ahmet", 18, 1.78f, true, kisi)
            Navigation.findNavController(it).navigate(gecis)
        }

        return tasarim.root
    }

}