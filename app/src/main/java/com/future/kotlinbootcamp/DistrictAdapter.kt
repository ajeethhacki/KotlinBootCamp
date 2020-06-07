package com.future.kotlinbootcamp


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.future.kotlinbootcamp.model.DistrictDetails
import kotlinx.android.synthetic.main.layout_single_card_for_district_detail.view.*

class DistrictAdapter(
    private var districtDetailList: ArrayList<DistrictDetails>?
) : RecyclerView.Adapter<DistrictAdapter.ViewHolder>() {

    lateinit var view: View
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_single_card_for_district_detail, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return districtDetailList!!.size
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.onBindItem(districtDetailList!![position], position)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun onBindItem(item: DistrictDetails, position: Int) {

            itemView.id_district_name.text = item.districtDetailIdName
            itemView.id_district_affected_people.text = item.districtCoronaPeople.toString()



//            if (position == 0) {
//                itemView.id_img_smiley.setImageResource(R.drawable.verygood)
//            }
//            if (position == 1) {
//                itemView.id_img_smiley.setImageResource(R.drawable.good)
//            }
//            if (position == 2) {
//                itemView.id_img_smiley.setImageResource(R.drawable.acceptable)
//            }
//            if (position == 3) {
//                itemView.id_img_smiley.setImageResource(R.drawable.unacceptable)
//            }
//            itemView.id_tv_smiley.text = item.ratingTableCategoryName
        }
    }
}