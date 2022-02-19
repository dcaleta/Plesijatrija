package com.example.plesijatrija_dc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class rumba_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_rumba)
        val actionBar=supportActionBar

        actionBar!!.title="Rumba"
        actionBar.setDisplayHomeAsUpEnabled(true)


        val firstFragment=FirstFragmentRumba()
        val secondFragment=fragment_second_rumba()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.fragmentRumba,firstFragment)
            commit()
        }
        val fragment_first=findViewById<Button>(R.id.fragment1Rumba)
        fragment_first.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentRumba, firstFragment)
                commit()
            }
        }


        val fragment_second=findViewById<Button>(R.id.fragment2Rumba)
        fragment_second.setOnClickListener{
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.fragmentRumba,secondFragment)
                commit()
            }
        }

    }
}