package com.example.listviewexample

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.widget.TextView

class DetailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val name = intent.getStringExtra("name")
        val desc = intent.getStringExtra("desc")
        val imageResource = intent.getIntExtra("image", 0)

        val titleText = findViewById<TextView>(R.id.textView)
//        val infoText = findViewById<TextView>(R.id.infoTextViewID)
        val imageView = findViewById<ImageView>(R.id.imageView)

        titleText.text = name
//        infoText.text = desc
        imageView.setImageResource(imageResource)

        val backButton = findViewById<Button>(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }

    }
}
