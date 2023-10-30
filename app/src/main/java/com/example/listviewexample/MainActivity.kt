package com.example.listviewexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ListView
import android.widget.Toast

class MainActivity : AppCompatActivity()
{
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var listview = findViewById<ListView>(R.id.listView)

        var list = mutableListOf<Model>()

        list.add(Model("Octopus", "8 tentacled monster", R.drawable.icons8_octopus_96))
        list.add(Model("Pig", "Delicious in rolls", R.drawable.icons8_pig_96))
        list.add(Model("Sheep", "Great for jumpers", R.drawable.icons8_sheep_96))
        list.add(Model("Rabbit", "Nice in a stew", R.drawable.icons8_rabbit_96))
        list.add(Model("Snake", "Great for shoes", R.drawable.icons8_snake_96))
        list.add(Model("Spider", "scared", R.drawable.icons8_spider_96))

        listview.adapter = MyAdapter(this, R.layout.listview_row,list)


        listview.setOnItemClickListener { parent: AdapterView<*>, view: View, position: Int, id: Long ->
            val selectedItem = list[position]
            val intent = Intent(this@MainActivity, DetailActivity::class.java)
            intent.putExtra("name", selectedItem.name)
            intent.putExtra("desc", selectedItem.desc)
            intent.putExtra("image", selectedItem.image)
            startActivity(intent)
        }




    }
}