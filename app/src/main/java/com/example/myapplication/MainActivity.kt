package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private  lateinit var rvBoard:RecyclerView
    private  lateinit var tvMoves:TextView
    private  lateinit var tvPairs:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        rvBoard = findViewById(R.id.rvBoard)
        tvMoves = findViewById(R.id.tvNumMoves)
        tvPairs = findViewById(R.id.tvNumPairs)

//        rvBoard.adapter = MemoryBoardAdapter(this,8)
        
        rvBoard.layoutManager = GridLayoutManager(this,2)
    }
}