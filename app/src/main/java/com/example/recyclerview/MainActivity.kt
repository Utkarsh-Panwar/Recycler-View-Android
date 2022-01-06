package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var recyclerView:RecyclerView
    var countryNameList=ArrayList<String>()
    var details=ArrayList<String>()
    var imageList=ArrayList<Int>()
    lateinit var adapter: CountriesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView=findViewById(R.id.recyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this@MainActivity)

        countryNameList.add("England")
        countryNameList.add("Germany")
        countryNameList.add("USA")
        details.add("This is England Flag")
        details.add("This is Germany Flag")
        details.add("This is USA Flag")
        imageList.add(R.drawable.eng)
        imageList.add(R.drawable.ger)
        imageList.add(R.drawable.usa)

        adapter=CountriesAdapter(countryNameList,details,imageList,this@MainActivity)
        recyclerView.adapter=adapter
    }
}