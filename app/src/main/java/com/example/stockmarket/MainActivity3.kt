package com.example.stockmarket

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity3 : AppCompatActivity() {
    lateinit var bottomNavigationView: BottomNavigationView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        bottomNavigationView=findViewById(R.id.navigation)
      bottomNavigationView.setOnNavigationItemReselectedListener {
          when(it.itemId){
              R.id.intra->{
              }
              R.id.shortterm->{
              }
              R.id.longterm->{
              }
              R.id.IPO->{
              }
              R.id.context->{
              }
              R.id.share->{
              }
              else -> false

          }

      }
    }
}