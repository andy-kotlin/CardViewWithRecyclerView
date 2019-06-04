package com.cootnet.cardviewwithrecyclerview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup

class MyAdapter(conText: Context) : RecyclerView.Adapter<RecyclerView.Adapter.MyViewHolder>() {

    override fun onBindViewHolder(p0: RecyclerView.Adapter.MyViewHolder, p1: Int) {

    }

    private val mContext:Context

    init {
        this.mContext = conText

    }

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): MyViewHolder {

    }

    override fun getItemCount(): Int {

    }



    class MyViewHolder {

    }
}