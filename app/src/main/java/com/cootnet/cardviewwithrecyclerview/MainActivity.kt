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

       // val lm:RecyclerView.LayoutManager = LinearLayoutManager(this)
        val lm: RecyclerView.LayoutManager = GridLayoutManager(this,2)
        recyclerView.layoutManager = lm
         val c1 = Card("https://upload.wikimedia.org/wikipedia/commons/thumb/a/a1/PM_Modi_Portrait%28cropped%29.jpg/200px-PM_Modi_Portrait%28cropped%29.jpg",
             "PM Modi",
             "Tea Man")
        val c2 = Card("https://img.etimg.com/thumb/height-480,width-640,msid-67413262,imgsize-130018/dhoni.jpg",
            "Ms Dhoni",
            "Sports Man")


        val dataset = arrayOf(c1, c2)

        recyclerView.adapter =  MyAdapter(this, dataset)



    }
}
