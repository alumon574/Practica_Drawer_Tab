package com.example.practicadrawertab.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.practicadrawertab.R
import com.example.practicadrawertab.adapters.Fragment1.F1Adapter
import com.example.practicadrawertab.adapters.Fragment1.Fragment1ViewModel

class FragmentTab1 : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_tab1,container,false)
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerTab1)
        val divider = DividerItemDecoration(this.context,DividerItemDecoration.VERTICAL)

        val contactsViewModel = ViewModelProvider(this).get(Fragment1ViewModel::class.java)
        contactsViewModel.data.observe(viewLifecycleOwner, Observer { data ->
            val adapter = F1Adapter(context,data)
            recyclerView.layoutManager = LinearLayoutManager(this.context,RecyclerView.VERTICAL,false)
            recyclerView.adapter = adapter
            recyclerView.addItemDecoration(divider)
        })
    return view
    }
}