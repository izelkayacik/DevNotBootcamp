package com.izelkayacik.kisileruygulamasi.adapter

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.navigation.Navigation
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar
import com.izelkayacik.kisileruygulamasi.R
import com.izelkayacik.kisileruygulamasi.entity.Kisiler
import com.izelkayacik.kisileruygulamasi.fragment.AnasayfaFragmentDirections

class KisilerAdapter(var mContext:Context,
                     var kisilerListesi:List<Kisiler>) : RecyclerView.Adapter<KisilerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(view: View) : RecyclerView.ViewHolder(view){
        var satir_card:CardView
        var textViewKisiBilgi:TextView
        var imageViewSilResim:ImageView

        init{
            satir_card = view.findViewById(R.id.satir_card)
            textViewKisiBilgi = view.findViewById(R.id.textViewKisiBilgi)
            imageViewSilResim = view.findViewById(R.id.imageViewSilResim)
        }
    }

    //Tasarımı Aktarma
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val tasarim = LayoutInflater.from(mContext).inflate(R.layout.card_tasarim, parent, false)
        return  CardTasarimTutucu(tasarim)
    }

    //Position bilgisi ile kaç tane
    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val kisi = kisilerListesi.get(position)

        holder.textViewKisiBilgi.text = "${kisi.kisi_ad} - ${kisi.kisi_tel}"

        holder.satir_card.setOnClickListener{
            val gecis = AnasayfaFragmentDirections.kisiDetayGecis(kisi)
            Navigation.findNavController(it).navigate(gecis)
        }

        holder.imageViewSilResim.setOnClickListener{
            Snackbar.make(it, "${kisi.kisi_ad} silinsin mi?", Snackbar.LENGTH_LONG)
                .setAction("EVET"){
                    Log.e("Kişi Sil", kisi.kisi_id.toString())
                }.show()
        }
    }

    //Kaç tane
    override fun getItemCount(): Int {
        return kisilerListesi.size
    }
}