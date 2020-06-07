package com.example.myapplication

import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val loader: ProgressBar = findViewById(R.id.p_loader)
        linearLayoutManager = LinearLayoutManager(this)
        recyclerView = findViewById(R.id.rc_currency_list)
        recyclerView.layoutManager = linearLayoutManager

        val request = ServiceBuilder.buildService(ApiService::class.java).getCurrencyList()
        loader.visibility = View.VISIBLE
        request.enqueue(object : Callback<List<CurrencyDetail>> {
            override fun onResponse(
                call: Call<List<CurrencyDetail>>,
                response: Response<List<CurrencyDetail>>
            ) {
                loader.visibility = View.GONE
                if (response.isSuccessful) {
                    recyclerView.apply {
                        setHasFixedSize(true)
                        var result=response.body()!!
                        layoutManager = LinearLayoutManager(this@MainActivity)
                        adapter = CustomAdapter(result,this@MainActivity)
                    }
                }
            }

            override fun onFailure(call: Call<List<CurrencyDetail>>, t: Throwable) {
                loader.visibility = View.GONE
                Toast.makeText(this@MainActivity, "${t.message}", Toast.LENGTH_SHORT).show()
            }
        })

    }
}