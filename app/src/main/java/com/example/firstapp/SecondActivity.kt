package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.view.View

class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var showtitle = findViewById<TextView>(R.id.showtitle)
        var showdesc = findViewById<TextView>(R.id.showDesc)
        var btn = findViewById<Button>(R.id.backBTN)

        var title = intent.getStringExtra("title")
        var desc = intent.getStringExtra("desc")

        showtitle.text = title
        showdesc.text = desc

        btn.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }

    }
}