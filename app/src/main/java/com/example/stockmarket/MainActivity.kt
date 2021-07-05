package com.example.stockmarket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ImageView



class MainActivity : AppCompatActivity() {
    lateinit var imageView: ImageView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        imageView=findViewById(R.id.image)

        Handler().postDelayed({
            val intent = Intent(this, MainActivity2::class.java)
            startActivity(intent)
            finish()
        }, 3000)



        
    }
}