package com.nielsen.nextmeter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerViewkotlin.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var adapter : RecyclerAdapter
    private  lateinit var  arrayList:ArrayList<ODMViewModels>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        arrayList = ArrayList()
        arrayList.add(ODMViewModels("Avengers: Endgame","April 26, 2019"))
        arrayList.add(ODMViewModels("Star Wars: The Rise Of Skywalker","20 December 2019"))
        arrayList.add(ODMViewModels("It: Chapter 2","6 September 2019"))
        arrayList.add(ODMViewModels("Frozen 2","22 November 2019"))
        arrayList.add(ODMViewModels("Pokemon: Detective Pikachu","May 2019"))
        arrayList.add(ODMViewModels("Wonder Woman: 1984","1 November 2019"))
        arrayList.add(ODMViewModels("Rocketman","May 31, 2019"))
        arrayList.add(ODMViewModels("The Lion King","July 18, 2019"))
        arrayList.add(ODMViewModels("Aladdin","July 18, 2019"))
        arrayList.add(ODMViewModels("The Lion King","July 18, 2019"))

        var linearLayoutManager = LinearLayoutManager(this)
        recyclerListActions.layoutManager = linearLayoutManager
        adapter = RecyclerAdapter(arrayList);
        recyclerListActions.adapter = adapter
    }
}
