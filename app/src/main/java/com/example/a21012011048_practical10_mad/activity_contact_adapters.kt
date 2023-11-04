package com.example.a21012011048_practical10_mad

import android.database.DataSetObserver
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.ViewGroup
import android.widget.ListAdapter

class activity_contact_adapters(mainActivity: MainActivity, listitems: ArrayList<Contact>) : AppCompatActivity(),
    ListAdapter {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_adapters)
    }

    override fun registerDataSetObserver(p0: DataSetObserver?) {
        TODO("Not yet implemented")
    }

    override fun unregisterDataSetObserver(p0: DataSetObserver?) {
        TODO("Not yet implemented")
    }

    override fun getCount(): Int {
        TODO("Not yet implemented")
    }

    override fun getItem(p0: Int): Any {
        TODO("Not yet implemented")
    }

    override fun getItemId(p0: Int): Long {
        TODO("Not yet implemented")
    }

    override fun hasStableIds(): Boolean {
        TODO("Not yet implemented")
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        TODO("Not yet implemented")
    }

    override fun getItemViewType(p0: Int): Int {
        TODO("Not yet implemented")
    }

    override fun getViewTypeCount(): Int {
        TODO("Not yet implemented")
    }

    override fun isEmpty(): Boolean {
        TODO("Not yet implemented")
    }

    override fun areAllItemsEnabled(): Boolean {
        TODO("Not yet implemented")
    }

    override fun isEnabled(p0: Int): Boolean {
        TODO("Not yet implemented")
    }
}