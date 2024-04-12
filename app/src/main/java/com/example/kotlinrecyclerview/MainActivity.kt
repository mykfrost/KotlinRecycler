package com.example.kotlinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.ArrayList

class MainActivity : AppCompatActivity() {

    private  lateinit var newRecycler : RecyclerView
    private lateinit var newArrayList : ArrayList<News>
    private lateinit var imageID : Array<Int>
    private lateinit var heading : Array<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageID = arrayOf(
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e
        )
        heading = arrayOf(
            "Omera fuck you nigga",
            "Omera uko na ufala",
            "Buana get going",
            "My peanuts are ready",
            "Buttercup is cute"
        )

        newRecycler = findViewById(R.id.recycler)
        newRecycler.layoutManager = LinearLayoutManager(this)
        newRecycler.setHasFixedSize(true)
        newArrayList  = arrayListOf<News>()
        getUserData()
    }

    private fun getUserData() {
        for (i in imageID.indices){
            val news = News(imageID[i], heading[i])
            newArrayList.add(news)
        }

        newRecycler.adapter = MyAdapter(newArrayList)
    }


}