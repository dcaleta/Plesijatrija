package com.example.plesijatrija_dc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class samba_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_samba)
        val actionBar=supportActionBar

        actionBar!!.title="Samba"
        actionBar.setDisplayHomeAsUpEnabled(true)
        val firstFragment=FirstFragment()
        val secondFragment=SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragment,firstFragment)
            commit()
        }
        val fragment_first=findViewById<Button>(R.id.fragment1)
        fragment_first.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment, firstFragment)
                commit()
            }
        }


        val fragment_second=findViewById<Button>(R.id.fragment2)
        fragment_second.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragment,secondFragment)
                commit()
            }
        }

    }
}