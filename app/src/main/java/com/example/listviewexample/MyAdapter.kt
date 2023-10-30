package com.example.listviewexample

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView

class MyAdapter (var mCtx: Context, var resources: Int,
                 var items: List<Model>) : ArrayAdapter<Model>(mCtx, resources, items)
{
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layoutInflater:LayoutInflater = LayoutInflater.from(mCtx)
        val view:View = layoutInflater.inflate(resources, null)

        val imageView:ImageView = view.findViewById(R.id.imageView1ID)
        val nameTextView:TextView = view.findViewById(R.id.nameTextViewID)
        val descTextView:TextView = view.findViewById(R.id.infoTextViewID)

        var mItem:Model = items[position]
        imageView.setImageDrawable(mCtx.resources.getDrawable(mItem.image))
        nameTextView.text = mItem.name
        descTextView.text = mItem.desc

        return view
    }
}