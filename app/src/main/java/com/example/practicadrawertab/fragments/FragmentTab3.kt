package com.example.practicadrawertab.fragments

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practicadrawertab.ActivityImagen
import com.example.practicadrawertab.R
import com.example.practicadrawertab.adapters.Fragment3.F3Adapter
import com.example.practicadrawertab.adapters.Fragment3.Tab3ViewModel

class FragmentTab3: Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_tab3,container,false)

        val recyclerView :RecyclerView = view.findViewById(R.id.recyclerTab3)
        val layoutManager = GridLayoutManager(context,2)
        recyclerView.layoutManager = layoutManager

        val modeCallBack:ActionMode.Callback = object :ActionMode.Callback{
            override fun onActionItemClicked(mode: ActionMode?, item: MenuItem?): Boolean {
                val id = item?.itemId
                when(id){
                    R.id.action_editar -> {
                        mode?.finish()
                    }
                    R.id.action_borrar -> {
                        mode?.finish()
                    }
                    R.id.action_compartir -> {
                        mode?.finish()
                    }
                    else -> return false

                }
                return true
            }

            override fun onPrepareActionMode(mode: ActionMode?, menu: Menu?): Boolean {
                return false
            }

            override fun onDestroyActionMode(mode: ActionMode?) {
                var mode = mode
                mode=null
            }

            override fun onCreateActionMode(mode: ActionMode?, menu: Menu?): Boolean {
                mode?.setTitle("Options")
                mode?.menuInflater?.inflate(R.menu.menu_context,menu)
                return true
            }
        }
        val tab3ViewModel = ViewModelProvider(this).get(Tab3ViewModel::class.java)
        tab3ViewModel.data.observe(viewLifecycleOwner, Observer { data ->
            val adapter = F3Adapter(context,data)
            recyclerView.adapter = adapter
            adapter.onLongClick ={ it ->
                it.startActionMode(modeCallBack)
            }

            adapter.onClick = {_,card ->
                val foto = card.foto
                val intent = Intent(context,ActivityImagen::class.java)
                intent.putExtra("Foto",foto)
                startActivity(intent)
            }
        })

        return view
    }
}