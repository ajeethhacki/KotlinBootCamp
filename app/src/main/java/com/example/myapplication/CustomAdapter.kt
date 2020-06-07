package com.example.myapplication

import android.annotation.SuppressLint
import android.app.Activity
import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.ahmadrosid.svgloader.SvgLoader

class CustomAdapter(private val currencyDetailList: List<CurrencyDetail>, private val activity: Activity) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {

    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomAdapter.ViewHolder {
        val v =
            LayoutInflater.from(parent.context).inflate(R.layout.rc_currency_detail, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: CustomAdapter.ViewHolder, position: Int) {
        holder.bindItems(currencyDetailList[position],activity)
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return currencyDetailList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        @SuppressLint("SetTextI18n")
        fun bindItems(currencyDetail: CurrencyDetail,activity : Activity) {
            val ivCurrencyLogo =
                itemView.findViewById(R.id.iv_currency_icon) as ImageView
            val tvSymbol = itemView.findViewById(R.id.tv_currency_symbol) as TextView
            val tvName = itemView.findViewById(R.id.tv_currency_name) as TextView
            val tvPrice = itemView.findViewById(R.id.tv_currency_price) as TextView
            val tvCCValue = itemView.findViewById(R.id.tv_currency_cc_value) as TextView

            tvSymbol.text = currencyDetail.symbol
            tvName.text = currencyDetail.name
            tvPrice.text = "$ " + String.format("%.2f", currencyDetail.price.toDouble())
            tvCCValue.text = "$ " + String.format("%.2f", currencyDetail.high.toDouble()) + " B"

            val uri = Uri.parse(currencyDetail.logo_url)
            SvgLoader.pluck()
                .with(activity)
                .setPlaceHolder(R.mipmap.ic_launcher, R.mipmap.ic_launcher)
                .load(uri, ivCurrencyLogo)
        }
    }
}