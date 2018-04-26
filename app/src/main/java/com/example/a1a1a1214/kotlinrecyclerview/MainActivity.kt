package com.example.a1a1a1214.kotlinrecyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.widget.LinearLayout
import com.example.a1a1a1214.kotlinrecyclerview.com.example.a1a1a1214.kotlinrecyclerview.recycler.RecyclerViewSimpleAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val recyclerAdapter : RecyclerViewSimpleAdapter by lazy {
        RecyclerViewSimpleAdapter(this@MainActivity)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        MainActivity_RecyclerView.run {
            layoutManager = LinearLayoutManager(this@MainActivity)
            adapter = recyclerAdapter
        }

        getList().forEach{
            recyclerAdapter.addItem(it)
        }

        recyclerAdapter.notifyDataSetChanged()
    }

    private fun getList() : List<String> {
        return (0..100).map { "Index $it" }
    }
}
