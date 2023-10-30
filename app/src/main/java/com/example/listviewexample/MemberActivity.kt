package com.example.listviewexample

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MemberActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_group)

        val startButton = findViewById<Button>(R.id.btn_start)

        startButton.setOnClickListener {
            val intent = Intent(this@MemberActivity, MainActivity::class.java)
            startActivity(intent)
            finish()  //
        }
    }
}
