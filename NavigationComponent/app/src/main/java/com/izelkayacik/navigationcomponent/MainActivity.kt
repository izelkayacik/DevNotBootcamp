package com.izelkayacik.navigationcomponent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.izelkayacik.navigationcomponent.databinding.ActivityMainBinding
import com.izelkayacik.navigationcomponent.databinding.BottomNavAnasayfaBinding
import com.izelkayacik.navigationcomponent.databinding.NavDrawerAnasayfaBinding
import com.izelkayacik.navigationcomponent.databinding.NavigationBaslikBinding
import kotlinx.android.synthetic.main.navigation_baslik.view.*

class MainActivity : AppCompatActivity() {

    private lateinit var tasarim:NavDrawerAnasayfaBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main) Navigation Component dersi içindi
        tasarim = NavDrawerAnasayfaBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        //Bottom Navigation Kodlaması
        val nav_host_fragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        NavigationUI.setupWithNavController(tasarim.navigationView,nav_host_fragment.navController)

        tasarim.toolbar.title = "Başlık"

        val toggle = ActionBarDrawerToggle(this, tasarim.drawer, tasarim.toolbar,
            0,0)
        tasarim.drawer.addDrawerListener(toggle)
        toggle.syncState()

        val baslik = tasarim.navigationView.inflateHeaderView(R.layout.navigation_baslik)
        baslik.textViewBaslik.text = "Merhaba"

    }

    override fun onBackPressed() {
        if(tasarim.drawer.isDrawerOpen(GravityCompat.START)){
            tasarim.drawer.closeDrawer(GravityCompat.START)
        }else{
            super.onBackPressed()
        }
    }
}


/*
class MainActivity : AppCompatActivity() {

    private lateinit var tasarim:BottomNavAnasayfaBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main) Navigation Component dersi içindi
        tasarim = BottomNavAnasayfaBinding.inflate(layoutInflater)
        setContentView(tasarim.root)

        //Bottom Navigation Kodlaması
        val nav_host_fragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment) as NavHostFragment
        NavigationUI.setupWithNavController(tasarim.bottomNav,nav_host_fragment.navController)
    }
}
 */