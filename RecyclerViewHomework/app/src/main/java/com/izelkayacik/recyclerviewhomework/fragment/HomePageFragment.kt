package com.izelkayacik.recyclerviewhomework.fragment

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.izelkayacik.recyclerviewhomework.data.Cheapness
import com.izelkayacik.recyclerviewhomework.data.Products
import com.izelkayacik.recyclerviewhomework.R
import com.izelkayacik.recyclerviewhomework.adapter.CheapnessAdapter
import com.izelkayacik.recyclerviewhomework.adapter.ProductsAdapter
import com.izelkayacik.recyclerviewhomework.databinding.FragmentHomePageBinding

class HomePageFragment : Fragment(), SearchView.OnQueryTextListener {
    private lateinit var binding: FragmentHomePageBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding = FragmentHomePageBinding.inflate(inflater, container, false)

        binding.toolbar.title = "Amazon.com.tr'de Ara"
        (activity as AppCompatActivity).setSupportActionBar(binding.toolbar)

        val layoutManager = LinearLayoutManager(requireContext())
        layoutManager.orientation = LinearLayoutManager.HORIZONTAL
        binding.cheapnessRecView.layoutManager = layoutManager

        val cheapnessList = ArrayList<Cheapness>()
        val offer1 = Cheapness("Kalem")
        val offer2 = Cheapness("Prime")
        val offer3 = Cheapness("Oyuncak")
        val offer4 = Cheapness("Macbook")
        val offer5 = Cheapness("Outlet")

        cheapnessList.add(offer1)
        cheapnessList.add(offer2)
        cheapnessList.add(offer3)
        cheapnessList.add(offer4)
        cheapnessList.add(offer5)

        val adapter = CheapnessAdapter(requireContext(), cheapnessList)
        binding.cheapnessRecView.adapter = adapter

        val productsList = ArrayList<Products>()
        val product1 = Products("kadin_ayakkabi", 99.99, 499.99, "Ayakkabılarda %20 indirim!")
        val product2 = Products("ev_aletleri", 954.99, 4598.99, "Ev Aletlerinde %5 indirim!")
        val product3 = Products("gida_ve_icecek", 9.99, 49.99, "Gıda ve İçeceklerde %20 indirim!")
        val product4 = Products("evcil_hayvanlar", 99.99, 1500.52, "Evcil Hayvan Kategorisinde %15 indirim!")
        val product5 = Products("table", 149.99, 499.99, "Masalarda %30 indirim!")
        val product6 = Products("sapka", 39.99, 100.99, "Sapkalarda %15 indirim!")

        productsList.add(product1)
        productsList.add(product2)
        productsList.add(product3)
        productsList.add(product4)
        productsList.add(product5)
        productsList.add(product6)

        val layouttManager = StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        val productsAdapter = ProductsAdapter(requireContext(), productsList)
        binding.productsRecView.layoutManager = layouttManager
        binding.productsRecView.adapter = productsAdapter

        return binding.root
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(true)
    }


    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.toolbar_menu, menu)

        val item = menu.findItem(R.id.action_search)
        val searchView = item.actionView as SearchView
        searchView.setOnQueryTextListener(this)

        super.onCreateOptionsMenu(menu, inflater)
    }

    override fun onQueryTextSubmit(p0: String?): Boolean {
        return true
    }

    override fun onQueryTextChange(p0: String?): Boolean {
        return true
    }
}