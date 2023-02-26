package com.example.practicadrawertab.adapters.Fragment3

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.practicadrawertab.R

class F3Adapter(var context:Context?, var items: List<ItemsF3>) : RecyclerView.Adapter<F3Adapter.Tab3ViewHolder>() {
    var onClick: (View, ItemsF3) -> Unit = { _, _->}
    var onLongClick: (View) -> Unit = {}

    init {
        this.items = items
    }

    class Tab3ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        var imag : ImageView

        init {
            imag = itemView.findViewById(R.id.imagenF3)
        }

        fun bindTarjeta(t: ItemsF3, onClick: (View, ItemsF3) -> Unit, onLongclick: (View) -> Unit) = with(itemView) {
            imag.setImageResource(t.foto)
            setOnClickListener{ onClick(itemView,t) }
            setOnLongClickListener {
                onLongclick(it)
                true
            }
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): Tab3ViewHolder {
        val itemView = LayoutInflater.from(viewGroup.context).inflate(R.layout.items_f3, viewGroup, false)
        return Tab3ViewHolder(itemView)
    }

    override fun onBindViewHolder(viewHolder: Tab3ViewHolder, pos: Int) {
        var itemCard = items[pos]
        viewHolder.bindTarjeta(itemCard,onClick,onLongClick)
    }

    override fun getItemCount(): Int {
        return items.size
    }
}