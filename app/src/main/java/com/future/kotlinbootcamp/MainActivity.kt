package com.future.kotlinbootcamp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.future.kotlinbootcamp.model.DistrictDetails
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

     private var districtDetailList: ArrayList<DistrictDetails> = ArrayList()
     var districtDetail: DistrictDetails = DistrictDetails()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart() {
        super.onStart()
        getList()
        id_district.layoutManager =
            LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        id_district.adapter =  DistrictAdapter(districtDetailList)
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        menuInflater.inflate(R.menu.main,menu)
        val searchItem = menu.findItem(R.id.menu_search)
        if(searchItem != null){
            val searchView = searchItem.actionView as SearchView
            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String?): Boolean {
                    return true
                }

                override fun onQueryTextChange(newText: String?): Boolean {
                    return true
                }






    private fun getList() {

        districtDetail.districtDetailId = 1
        districtDetail.districtDetailIdIsActive = true
        districtDetail.districtDetailIdName = "Coimbatore"
        districtDetail.districtCoronaPeople = 183;

        districtDetailList.add(districtDetail)
        districtDetail = DistrictDetails()

        districtDetail.districtDetailId = 2
        districtDetail.districtDetailIdIsActive = true
        districtDetail.districtDetailIdName = "Erode"
        districtDetail.districtCoronaPeople = 72;

        districtDetailList.add(districtDetail)
        districtDetail = DistrictDetails()

        districtDetail.districtDetailId = 3
        districtDetail.districtDetailIdIsActive = true
        districtDetail.districtDetailIdName = "Chennai"
        districtDetail.districtCoronaPeople = 19809;

        districtDetailList.add(districtDetail)
        districtDetail = DistrictDetails()

        districtDetail.districtDetailId = 4
        districtDetail.districtDetailIdIsActive = true
        districtDetail.districtDetailIdName = "Trichurappalli"
        districtDetail.districtCoronaPeople = 112;

        districtDetailList.add(districtDetail)
        districtDetail = DistrictDetails()

        districtDetail.districtDetailId = 5
        districtDetail.districtDetailIdIsActive = true
        districtDetail.districtDetailIdName = "Madurai"
        districtDetail.districtCoronaPeople = 292;

        districtDetailList.add(districtDetail)
        districtDetail = DistrictDetails()

        districtDetail.districtDetailId = 6
        districtDetail.districtDetailIdIsActive = true
        districtDetail.districtDetailIdName = "Salem"
        districtDetail.districtCoronaPeople = 216;

        districtDetailList.add(districtDetail)
        districtDetail = DistrictDetails()

        districtDetail.districtDetailId = 7
        districtDetail.districtDetailIdIsActive = true
        districtDetail.districtDetailIdName = "Theni"
        districtDetail.districtCoronaPeople = 121;

        districtDetailList.add(districtDetail)
        districtDetail = DistrictDetails()

        districtDetail.districtDetailId = 8
        districtDetail.districtDetailIdIsActive = true
        districtDetail.districtDetailIdName = "Karur"
        districtDetail.districtCoronaPeople = 83;

        districtDetailList.add(districtDetail)
        districtDetail = DistrictDetails()

        districtDetail.districtDetailId = 9
        districtDetail.districtDetailIdIsActive = true
        districtDetail.districtDetailIdName = "Vellore"
        districtDetail.districtCoronaPeople = 55;

        districtDetailList.add(districtDetail)
        districtDetail = DistrictDetails()

        districtDetail.districtDetailId = 10
        districtDetail.districtDetailIdIsActive = true
        districtDetail.districtDetailIdName = "Namakkal"
        districtDetail.districtCoronaPeople = 85;

        districtDetailList.add(districtDetail)
        districtDetail = DistrictDetails()
    }
}

