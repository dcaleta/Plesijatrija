package com.example.plesijatrija_dc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val osnove = findViewById<Button>(R.id.osnove_btn)
        osnove.setOnClickListener{
            val intent= Intent(this, basic_activity::class.java)
            startActivity(intent)
        }
        val samba=findViewById<Button>(R.id.samba_btn)
        samba.setOnClickListener{
            val intent= Intent(this, samba_activity::class.java)
            startActivity(intent)
        }
        val rumba=findViewById<Button>(R.id.rumba_btn)
        rumba.setOnClickListener{
            val intent= Intent(this, rumba_activity::class.java)
            startActivity(intent)
        }
        val jive=findViewById<Button>(R.id.jive_btn)
        jive.setOnClickListener{
            val intent= Intent(this, jive_activity::class.java)
            startActivity(intent)
        }
    }
}