package com.example.tousnaapp.activity

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.tousnaapp.R
import com.example.tousnaapp.adapter.MyAdapter
import com.example.tousnaapp.model.News
import com.example.tousnaapp.databinding.ActivityItemPnhompenhBinding


class PnhomPenhActivity : AppCompatActivity() {
    private lateinit var binding: ActivityItemPnhompenhBinding

    private lateinit var newRecyclerView: RecyclerView
        private var mList = ArrayList<News>()
        private lateinit var adapter: MyAdapter


        override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
            super.onCreate(savedInstanceState, persistentState)

            binding = ActivityItemPnhompenhBinding.inflate(layoutInflater)
            setContentView(binding.root)

            newRecyclerView.setHasFixedSize(true)
            newRecyclerView.layoutManager = LinearLayoutManager(this)
            addDataToList()
            //
            adapter = MyAdapter(mList)
            newRecyclerView.adapter = adapter

    }

    private fun addDataToList() {
        mList.add(News(R.drawable.toulsleng))
        mList.add(News(R.drawable.royalpalace))
        mList.add(News(R.drawable.watphnom))
        mList.add(News(R.drawable.nationalmuseum))

    }

}