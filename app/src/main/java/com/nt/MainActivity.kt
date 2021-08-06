package com.nt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    var tv:TextView
    init {
        tv=findViewById(R.id.tv1)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tv.text="prashant"
        val btn=findViewById<Button>(R.id.btn)
        btn.setOnClickListener{
            Toast.makeText(this,"hello world",Toast.LENGTH_SHORT).show()
        }
    }
}