package com.example.myapplication

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridLayout
import android.widget.GridView
import android.widget.Toast
import com.example.myapplication.Adaters.GridAdapter
import com.google.android.material.snackbar.Snackbar

@SuppressLint("StaticFieldLeak")
lateinit var gridView : GridView
lateinit var img :IntArray
lateinit var playerName:Array<String>
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        bindViews()
        val gridAdapter = GridAdapter(this, playerName, img)
        gridView.adapter = gridAdapter
        gridView.setOnItemClickListener{ _, view, position, _ ->
            val snack = Snackbar.make(view,"you clicked on ${playerName[position]}",Snackbar.LENGTH_LONG)
        snack.show()
        }
    }

    private fun bindViews() {
        gridView = findViewById(R.id.grid_view)
        playerName = arrayOf("Messi","Ronaldo","de bruyne","Salah")
        img = intArrayOf(R.mipmap.messi,R.mipmap.ronaldo,R.mipmap.debruyne,R.mipmap.salahhh)
    }

//    override fun onItemClick(p0: AdapterView<*>?, p1: View, p2: Int, p3: Long) {
////        Toast.makeText(applicationContext, "You CLicked " + playerName[p2],
////            Toast.LENGTH_SHORT).show()
//        val snack = Snackbar.make(p1,"you clicked on ${playerName[p2]}",Snackbar.LENGTH_LONG)
//        snack.show()
//    }
}