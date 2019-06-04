package com.cootnet.cardviewwithrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView =  findViewById<RecyclerView>(R.id.recylerView)

        val lm:RecyclerView.LayoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = lm

        val data =
            arrayOf(
                Card("one", "two", "three"),
                Card("xyz", "usd", "sdhf")
            )

        recyclerView.adapter = MyAdapter(this)



    }
}
