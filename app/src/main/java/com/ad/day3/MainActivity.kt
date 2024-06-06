package com.ad.day3

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    var name: EditText?=null
    var city: EditText?= null
    var collegename: EditText?=null
    var check: Button?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        name=findViewById(R.id.name)
        city=findViewById(R.id.city)
        collegename=findViewById(R.id.collegename)
        check=findViewById(R.id.check)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main))
        { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        check?.setOnClickListener {

            Toast.makeText(this,"Value Entered ${name?.text} ${city?.text} ${collegename?.text}", Toast.LENGTH_SHORT).show()
        }
    }
}