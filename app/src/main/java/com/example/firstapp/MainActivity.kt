package com.example.firstapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var usertitleEdit = findViewById<EditText>(R.id.userTitle)
        var userDescEdit = findViewById<EditText>(R.id.userDescription)
        var submit  = findViewById<Button>(R.id.submit)

        submit.setOnClickListener{

            var title = usertitleEdit.text.toString()
            var desc = userDescEdit.text.toString()


            var intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("title" , title)
            intent.putExtra("desc" , desc)
            startActivity(intent)
        }

    }
}