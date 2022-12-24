package com.example.venodrapp.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.venodrapp.R
import com.example.venodrapp.model.Visitor
import com.example.venodrapp.ui.VisitorInfoActivity

class VisitorAdapter(var visitorList : ArrayList<Visitor>) : RecyclerView.Adapter<VisitorAdapter.viewHolder>() {


    class viewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): viewHolder {
        return viewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_visitors,parent,false))
    }

    override fun onBindViewHolder(holder: viewHolder, position: Int) {

        holder.itemView.setOnClickListener{
            holder.itemView.context.startActivity(Intent(holder.itemView.context,VisitorInfoActivity::class.java))
        }
    }

    override fun getItemCount(): Int {
        return visitorList.size
    }

}