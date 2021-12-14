package com.nishajain.kotinexamples

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class RecyclerViewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler_view)
        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)

        // Used for vertical linearlayout view
        recyclerview.layoutManager = LinearLayoutManager(this)

        // ArrayList of class RecyclerModel
        val data = ArrayList<RecyclerModel>()

        // This loop will create 12 Views containing
        // the image with the count of view
        for (i in 1..12) {
            data.add(RecyclerModel(R.drawable.android, "Android" + i))
        }

        // This will pass the ArrayList to our Adapter
        val adapter = RecyclerAdapter(data)

        // Setting the Adapter with the recyclerview
        recyclerview.adapter = adapter

    }
}