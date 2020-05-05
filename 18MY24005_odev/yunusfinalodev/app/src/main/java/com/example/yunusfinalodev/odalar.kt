package com.example.yunusfinalodev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_hizmetler.*
import kotlinx.android.synthetic.main.activity_odalar.*

class odalar : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_odalar)

        button6.setOnClickListener {
            val intent = Intent (this,odagors::class.java)

            startActivity(intent)
        }
    }
}
