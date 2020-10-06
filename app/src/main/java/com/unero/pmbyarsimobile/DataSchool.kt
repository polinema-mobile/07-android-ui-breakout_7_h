package com.unero.pmbyarsimobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DataSchool : AppCompatActivity() {

    private lateinit var btnNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_school)
        btnNext = findViewById(R.id.btnNextThird)
        lanjut()
    }

    fun lanjut(){
        btnNext.setOnClickListener {
//            val intent = Intent(this, final::class.java)
            startActivity(intent)
        }
    }
}