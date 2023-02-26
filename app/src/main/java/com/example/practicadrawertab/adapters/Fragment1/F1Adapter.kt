package com.example.practicadrawertab.adapters.Fragment1

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.practicadrawertab.MyData
import com.example.practicadrawertab.R

class F1Adapter(
    var context: Context?,
    var data: List<MyData>
) :
    RecyclerView.Adapter<F1Adapter.MyViewHolder?>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val v: View =
            LayoutInflater.from(parent.context).inflate(R.layout.items_f1, parent, false)
        return MyViewHolder(v)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val myData = data[position]
        holder.name.text = myData.title

    }


    override fun getItemCount(): Int {
        return data.size
    }

    inner class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var name: TextView
        init {
            name = itemView.findViewById(R.id.textoF1)

        }
    }

}
