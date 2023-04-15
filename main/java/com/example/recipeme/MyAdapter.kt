package com.example.recipeme

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val groupDetails: ArrayList<RecipeCardData>) :
    RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    interface OnItemClickListener {
        fun onItemClick(position: Int)
    }
    private var mlistener: OnItemClickListener? = null
    fun setOnItemClickListener(listener: OnItemClickListener) {
        mlistener = listener
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val ItemView = LayoutInflater.from(parent.context).inflate(R.layout.cardview,parent,false)
        return MyViewHolder(ItemView,mlistener)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val currentItem = groupDetails[position]
        holder.heading.text = currentItem.title
        holder.noi.text = currentItem.noi
        holder.noi1.text = currentItem.noi1
        holder.cd.text = currentItem.cd
        holder.cd1.text = currentItem.cd1
        holder.status.text = currentItem.status
        holder.stat1.text = currentItem.status1


    }

    override fun getItemCount(): Int {
        return groupDetails.size

    }


    class MyViewHolder(ItemView:View, listener: OnItemClickListener?):RecyclerView.ViewHolder(ItemView) {

        var cd: TextView = ItemView.findViewById(R.id.cd)
        val heading: TextView = ItemView.findViewById(R.id.title)
        val noi: TextView = ItemView.findViewById(R.id.noi)
        val noi1: TextView = ItemView.findViewById(R.id.noi1)
        val cd1: TextView = ItemView.findViewById(R.id.cd1)
        val status: TextView = ItemView.findViewById(R.id.status)
        val stat1: TextView = ItemView.findViewById(R.id.status1)
        init {
            itemView.setOnClickListener {
                listener?.onItemClick(adapterPosition)
            }
        }

    }

    }