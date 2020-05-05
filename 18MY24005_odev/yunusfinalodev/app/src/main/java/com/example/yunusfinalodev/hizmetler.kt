package com.example.yunusfinalodev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hizmetler.*
import kotlinx.android.synthetic.main.activity_resepsiyon.*

class hizmetler : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hizmetler)

        button8.setOnClickListener {
            val intent = Intent (this,cafebar::class.java)

            startActivity(intent)
        }
        button9.setOnClickListener {
            val intent = Intent (this,spa::class.java)

            startActivity(intent)
        }
        button10.setOnClickListener {
            val intent = Intent (this,havuz::class.java)

            startActivity(intent)
        }

        button11.setOnClickListener {
            val intent = Intent (this,fitness::class.java)

            startActivity(intent)
        }

    }
}
