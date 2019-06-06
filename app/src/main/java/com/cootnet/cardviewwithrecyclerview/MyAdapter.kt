package com.cootnet.cardviewwithrecyclerview

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide

class MyAdapter(context:Context, dataset:Array<Card>) : RecyclerView.Adapter<MyAdapter. MyViewHolder>(){
    private  val mContext:Context
    private  val dataset:Array<Card>
    init {
        this.mContext = context
        this.dataset = dataset
    }

    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val thumbnail:ImageView
        val title:TextView
        val subtitle:TextView

        init {
            this.thumbnail = view.findViewById(R.id.thumbnail)
            this.title = view.findViewById(R.id.title)
            this.subtitle = view.findViewById(R.id.subtitle)
        }

    }


    override fun onCreateViewHolder(parent: ViewGroup, position: Int): MyAdapter.MyViewHolder {
         val rootView  = LayoutInflater.from(parent.context)
             .inflate(R.layout.album_card, parent, false)

         return MyViewHolder(rootView)
    }

    override fun getItemCount(): Int {
        return this.dataset.size

    }

    override fun onBindViewHolder(holder: MyAdapter.MyViewHolder, position: Int) {
       Glide.with(mContext).load(dataset[position].getThumbnial()).into(holder.thumbnail)
        holder.title.text  = dataset[position].getTitle()
        holder.subtitle.text = dataset[position].getSubtitle()

    }
}