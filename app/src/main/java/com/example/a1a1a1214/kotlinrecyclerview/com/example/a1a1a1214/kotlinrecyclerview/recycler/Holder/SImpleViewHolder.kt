package com.example.a1a1a1214.kotlinrecyclerview.com.example.a1a1a1214.kotlinrecyclerview.recycler.Holder

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a1a1a1214.kotlinrecyclerview.R
import kotlinx.android.synthetic.main.item_list.view.*

/**
 * Created by a1a1a1214 on 2018-04-26.
 */

class SImpleViewHolder(context : Context, parent : ViewGroup?) :
        RecyclerView.ViewHolder(LayoutInflater.from(context).inflate(R.layout.item_list, parent, false))
{
    fun bindView(item : String?)
    {
        itemView.bindView(item)
    }

    fun View.bindView(item : String?) {
        tv_message.text = item ?: ""
    }
}