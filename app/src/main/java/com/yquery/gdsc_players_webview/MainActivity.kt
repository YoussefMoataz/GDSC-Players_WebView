package com.yquery.gdsc_players_webview

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.yquery.gdsc_players_webview.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.webViewButton.setOnClickListener {
            if (!binding.searchInput.text.isNullOrBlank()){
                val intent = Intent(this, WebViewActivity::class.java)

                intent.putExtra("link", binding.searchInput.text)

                startActivity(intent)
            }
        }

        binding.playAudioButton.setOnClickListener {
            startActivity(Intent(this, AudioPlayerActivity::class.java))
        }

        binding.playVideoButton.setOnClickListener {
            startActivity(Intent(this, VideoPlayerActivity::class.java))
        }

    }



}