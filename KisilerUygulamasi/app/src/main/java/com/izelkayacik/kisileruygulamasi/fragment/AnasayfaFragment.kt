package com.izelkayacik.kisileruygulamasi.fragment

import android.os.Bundle
import android.util.Log
import android.view.*
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.viewModels
import androidx.navigation.Navigation
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.izelkayacik.kisileruygulamasi.R
import com.izelkayacik.kisileruygulamasi.adapter.KisilerAdapter
import com.izelkayacik.kisileruygulamasi.databinding.FragmentAnasayfaBinding
import com.izelkayacik.kisileruygulamasi.entity.Kisiler
import com.izelkayacik.kisileruygulamasi.viewmodel.AnasayfaFragmentViewModel
import com.izelkayacik.kisileruygulamasi.viewmodel.AnasayfaVMF

class AnasayfaFragment : Fragment(), SearchView.OnQueryTextListener {
    private lateinit var tasarim: FragmentAnasayfaBinding
    private lateinit var adapter: KisilerAdapter
    private lateinit var viewModel: AnasayfaFragmentViewModel
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        tasarim = DataBindingUtil.inflate(inflater, R.layout.fragment_anasayfa, container, false)
        tasarim.anasayfaFragment = this
        tasarim.anasayfaToolbarBaslik = "Kişiler"
        (activity as AppCompatActivity).setSupportActionBar(tasarim.toolbarAnasayfa)

        viewModel.kisilerListesi.observe(viewLifecycleOwner, {
            adapter = KisilerAdapter(requireContext(), it, viewModel)
            tasarim.kisilerAdapter = adapter
        })

        return tasarim.root
    }
    fun fabTikla(v: View) {
        Navigation.findNavController(v).navigate(R.id.kisiKayitGecis)

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
        val tempViewModel: AnasayfaFragmentViewModel by viewModels() {
            AnasayfaVMF(requireActivity().application)
        }
        viewModel = tempViewModel
    }
    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.toolbar_menu, menu)

        val item = menu.findItem(R.id.action_ara)
        var searchView = item.actionView as SearchView
        searchView.setOnQueryTextListener(this)

        super.onCreateOptionsMenu(menu, inflater)
    }
    /*override fun onOptionsItemSelected(item: MenuItem): Boolean {
     when(item.itemId){
         R.id.action_ara -> {
             Toast.makeText(requireContext(), "Ara seçildi", Toast.LENGTH_SHORT).show()
             return true
         }
         else -> return super.onOptionsItemSelected(item)
     }
 }*/
    //Arama iconu tıklanıldığında
    override fun onQueryTextSubmit(query: String): Boolean {
        viewModel.ara(query)
        return true
    }
    //Her harf girdikçe ve sildikçe çalışır
    override fun onQueryTextChange(newText: String): Boolean {
        viewModel.ara(newText)
        return true
    }
}