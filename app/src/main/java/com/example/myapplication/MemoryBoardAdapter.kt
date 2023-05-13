package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import kotlin.math.min

class MemoryBoardAdapter(private val context: Context, private val numPieces: Int) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val cardWidth : Int = parent.width / 2
        val cardHeight : Int = parent.height / 2

        val cardSideLength= min(cardWidth,cardHeight)
        val view = LayoutInflater.from(context).inflate(R.layout.memory_card, parent, false)
        val layoutParams = view.findViewById<CardView>(R.id.cardView).layoutParams
        layoutParams.width = cardSideLength
        layoutParams.height = cardSideLength

        return ViewHolder(view)
    }

    override fun getItemCount() = numPieces

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
       holder.bind(position)
    }
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        
    }

}

private fun RecyclerView.ViewHolder.bind(position: Int) {

}





