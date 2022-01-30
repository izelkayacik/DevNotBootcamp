package com.izelkayacik.kisileruygulamasi.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.ViewModel
import com.izelkayacik.kisileruygulamasi.repo.KisilerDaoRepository

class KisiDetayFragmentViewModel(application: Application) : AndroidViewModel(application) {

    val krepo = KisilerDaoRepository(application)

    fun guncelle(kisi_id:Int, kisi_ad:String, kisi_tel:String){
        krepo.kisiGuncelle(kisi_id,kisi_ad,kisi_tel)
    }
}