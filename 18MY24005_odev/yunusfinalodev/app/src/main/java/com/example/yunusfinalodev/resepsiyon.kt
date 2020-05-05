package com.example.yunusfinalodev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_resepsiyon.*

class resepsiyon : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resepsiyon)

        button2.setOnClickListener {
            val intent = Intent (this,odalar::class.java)

            startActivity(intent)
        }
        button5.setOnClickListener {
            val intent = Intent (this,hakkimizda::class.java)

            startActivity(intent)
        }
        button3.setOnClickListener {
            val intent = Intent (this,hizmetler::class.java)

            startActivity(intent)
        }
        button4.setOnClickListener {
            val intent = Intent (this,iletisim::class.java)

            startActivity(intent)
        }
    }
}
