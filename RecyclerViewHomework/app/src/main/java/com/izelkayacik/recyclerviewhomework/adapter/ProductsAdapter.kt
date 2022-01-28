package com.izelkayacik.recyclerviewhomework.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.izelkayacik.recyclerviewhomework.data.Products
import com.izelkayacik.recyclerviewhomework.R

class ProductsAdapter(var mContext: Context, var productsList: List<Products>) :
    RecyclerView.Adapter<ProductsAdapter.ProductsViewHolder>() {

    inner class ProductsViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var productImageView: ImageView
        var pricingTextView: TextView
        var captionTextView: TextView

        init {
            productImageView = view.findViewById(R.id.productImageView)
            pricingTextView = view.findViewById(R.id.pricingTextView)
            captionTextView = view.findViewById(R.id.captionTextView)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductsViewHolder {
        val binding =
            LayoutInflater.from(mContext).inflate(R.layout.products_card_design, parent, false)
        return ProductsViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ProductsViewHolder, position: Int) {
        val product = productsList[position]
        holder.apply {
            productImageView.setImageResource(
                mContext.resources.getIdentifier(
                    product.productImage,
                    "drawable",
                    mContext.packageName
                )
            )
            pricingTextView.text = "₺ ${product.minPrice} - ₺ ${product.maxPrice}"
            captionTextView.text = product.caption
        }
    }

    override fun getItemCount(): Int {
        return productsList.size
    }
}