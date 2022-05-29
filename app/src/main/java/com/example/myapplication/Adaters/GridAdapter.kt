package com.example.myapplication.Adaters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.R

class GridAdapter(
    private val context: Context,
    private val name: Array<String>,
    private val img: IntArray
) : BaseAdapter() {
    var layoutInflater: LayoutInflater? = null

    override fun getCount(): Int {
        return name.size
    }

    override fun getItem(p0: Int): Any? {
        return null
    }

    override fun getItemId(p0: Int): Long {
        return 0
    }

    override fun getView(postion: Int, convertView: View?, parent: ViewGroup?): View? {
        var myView = convertView

        if (layoutInflater == null) {
            layoutInflater =
                context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        }
        if (myView == null) {
            myView = layoutInflater!!.inflate(R.layout.row, null)
        }
        val imageView = myView?.findViewById<ImageView>(R.id.imageView)
        var textView = myView?.findViewById<TextView>(R.id.textView)
        imageView?.setImageResource(img[postion])
        textView?.text = name[postion]
        return myView
    }
}