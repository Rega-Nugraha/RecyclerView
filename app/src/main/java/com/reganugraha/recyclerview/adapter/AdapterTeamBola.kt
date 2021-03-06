package com.reganugraha.recyclerview.adapter

import android.content.Context
import android.text.Layout
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.reganugraha.recyclerview.databinding.ListItemPemainBinding
import com.reganugraha.recyclerview.model.pemain

class AdapterTeamBola (
    private val context : Context,
    private var data : List<pemain>?,
private val itemClick : OnClickListener)
    : RecyclerView.Adapter<AdapterTeamBola.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType : Int): ViewHolder{
        val binding = ListItemPemainBinding.inflate(LayoutInflater.from(parent.context), parent, : false)
        return ViewHolder(binding)
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = data?.get(position)
        holder.foto.setImageResource(item?. ?:0)
        holder.nama.text = item?.nama

        holder.itemView.setOnClickListener{
            itemClick.detailData(item)
        }
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int = data?.size ?:0

    inner class ViewHolder(var binding : ListItemPemainBinding) : RecyclerView.ViewHolder(binding.root){
        var foto = binding.image
        var nama = binding.txtnama
    }
    interface  OnClickListener {
        fun detailData(item : pemain?)
    }
}