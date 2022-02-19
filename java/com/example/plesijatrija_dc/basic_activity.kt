package com.example.plesijatrija_dc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.MediaController
import android.widget.VideoView

class basic_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(com.example.plesijatrija_dc.R.layout.activity_basic)
        val actionBar=supportActionBar

        actionBar!!.title="Osnove"
        actionBar.setDisplayHomeAsUpEnabled(true)

        val videoView = findViewById<VideoView>(com.example.plesijatrija_dc.R.id.video_View)
        videoView.setVideoPath("android.resource://" + packageName + "/" + com.example.plesijatrija_dc.R.raw.osnove)
        val mediaController = MediaController(this)
        mediaController.setAnchorView(videoView)
        videoView.setMediaController(mediaController)


    }
}