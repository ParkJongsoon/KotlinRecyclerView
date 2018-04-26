package com.example.a1a1a1214.kotlinrecyclerview.com.example.a1a1a1214.kotlinrecyclerview.recycler

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.ViewGroup
import com.example.a1a1a1214.kotlinrecyclerview.com.example.a1a1a1214.kotlinrecyclerview.recycler.Holder.SImpleViewHolder

/**
 * Created by a1a1a1214 on 2018-04-26.
 */

class RecyclerViewSimpleAdapter (val context: Context) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){

    private val list = mutableListOf<String>()

    //ViewHolder를 생성하는 메소드
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerView.ViewHolder {
        return SImpleViewHolder(context, parent)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder?, position: Int) {
        (holder as? SImpleViewHolder)?.bindView(list[position])
    }

    override fun getItemCount(): Int = list.size

    //외부에서 아이템을 넣기위하여
    fun addItem(item : String) {
        list.add(item)
    }
}