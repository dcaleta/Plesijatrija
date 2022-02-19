package com.example.plesijatrija_dc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class jive_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jive)
        val actionBar=supportActionBar

        actionBar!!.title="Jive"
        actionBar.setDisplayHomeAsUpEnabled(true)
        val firstFragment=fragment_first_jive()
        val secondFragment=second_fragment_jive()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentJive,firstFragment)
            commit()
        }
        val fragment_first=findViewById<Button>(R.id.fragment1Jive)
        fragment_first.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentJive, firstFragment)
                commit()
            }
        }


        val fragment_second=findViewById<Button>(R.id.fragment2Jive)
        fragment_second.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentJive,secondFragment)
                commit()
            }
        }
    }
}