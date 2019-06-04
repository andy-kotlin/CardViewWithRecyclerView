package com.cootnet.cardviewwithrecyclerview

class Card(thumbnail:String, title:String, subtitle:String) {
   private val thumnail:String
   private val title:String
   private val subtitle:String

    init {
        this.thumnail = thumbnail
        this.title = title
        this.subtitle = subtitle
    }

    fun getThumbnial():String{
        return this.thumnail
    }
    fun getTitle():String{
        return this.title
    }
    fun getSubtitle():String{
        return this.subtitle
    }


}