package com.example.customlistview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter (var mctx:Context,var resources:Int,var items:List<Model>):ArrayAdapter<Model>(mctx,resources,items) {


    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater=LayoutInflater.from(mctx)
        val view:View=layoutInflater.inflate(resources,null)

        val image_view:ImageView=view.findViewById(R.id.imageView)
        val title_Text:TextView=view.findViewById(R.id.txt_title)
        val description_text:TextView=view.findViewById(R.id.txt_description)

        var  myitems:Model=items[position]
        image_view.setImageDrawable(mctx.resources.getDrawable(myitems.img))
        title_Text.text=myitems.title
        description_text.text=myitems.Description

        return view
    }
}