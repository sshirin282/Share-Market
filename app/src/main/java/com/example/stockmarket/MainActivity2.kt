package com.example.stockmarket

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity2 : AppCompatActivity() {
    lateinit var imageView1: ImageView
    lateinit var imageView2: ImageView
    lateinit var imageView3: ImageView
    lateinit var imageView4: ImageView
    lateinit var imageView5: ImageView
    lateinit var imageView6: ImageView
    lateinit var textView1: TextView
    lateinit var textView2: TextView
    lateinit var textView3: TextView
    lateinit var textView4: TextView
    lateinit var textView5: TextView
    lateinit var textView6: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        imageView1=findViewById(R.id.image1)
        imageView2=findViewById(R.id.image2)
        imageView3=findViewById(R.id.image3)
        imageView4=findViewById(R.id.image4)
        imageView5=findViewById(R.id.image5)
        imageView6=findViewById(R.id.image6)
        textView1=findViewById(R.id.text1)
        textView2=findViewById(R.id.text2)
        textView3=findViewById(R.id.text3)
        textView4=findViewById(R.id.text4)
        textView5=findViewById(R.id.text5)
        textView6=findViewById(R.id.text6)


        imageView1.setOnClickListener {
            Toast.makeText(this, "You clicked on Intraday.", Toast.LENGTH_LONG).show()
            val intent= Intent(this,MainActivity3::class.java)
            startActivity(intent)
//            val fragment = FirstFragment()
//            supportFragmentManager.beginTransaction().replace(R.id.frame, fragment).commit()
//            true
        }
        imageView2.setOnClickListener {
            Toast.makeText(this, "You clicked on Short Term.", Toast.LENGTH_LONG).show()
            val intent= Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
        imageView3.setOnClickListener {
            Toast.makeText(this,"You clicked on Long Term.",Toast.LENGTH_LONG).show()
            val intent= Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
        imageView4.setOnClickListener {
            Toast.makeText(this,"You clicked on Details.",Toast.LENGTH_LONG).show()
            val intent= Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
        imageView5.setOnClickListener {
            Toast.makeText(this,"You clicked on Contest.",Toast.LENGTH_LONG).show()
            val intent= Intent(this,MainActivity3::class.java)
            startActivity(intent)
        }
        imageView6.setOnClickListener {
            Toast.makeText(this,"You clicked on Share.",Toast.LENGTH_LONG).show()
            val intent= Intent(this,MainActivity3::class.java)
            startActivity(intent)}

    }
}