package com.izelkayacik.recyclerviewhomework.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.izelkayacik.recyclerviewhomework.data.Cheapness
import com.izelkayacik.recyclerviewhomework.R

class CheapnessAdapter(
    var mContext: Context,
    var cheapnessList: List<Cheapness>
) : RecyclerView.Adapter<CheapnessAdapter.CardViewHolder>() {

    inner class CardViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var offerImage: ImageView = view.findViewById(R.id.offerImage)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val binding =
            LayoutInflater.from(mContext).inflate(R.layout.cheapness_card_design, parent, false)
        return CardViewHolder(binding)
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        val offer = cheapnessList[position]
        holder.offerImage.setImageResource(
            mContext.resources.getIdentifier(
                offer.cheapnessPic,
                "drawable",
                mContext.packageName
            )
        )
    }

    override fun getItemCount(): Int {
        return cheapnessList.size
    }
}