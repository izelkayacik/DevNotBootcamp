package com.izelkayacik.kisileruygulamasi.viewmodel

import androidx.lifecycle.ViewModel
import com.izelkayacik.kisileruygulamasi.repo.KisilerDaoRepository

class KisiDetayFragmentViewModel : ViewModel() {

    val krepo = KisilerDaoRepository()

    fun guncelle(kisi_id:Int, kisi_ad:String, kisi_tel:String){
        krepo.kisiGuncelle(kisi_id,kisi_ad,kisi_tel)
    }
}