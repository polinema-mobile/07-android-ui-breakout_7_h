package com.unero.pmbyarsimobile

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView

class DataPribadi : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_pribadi)

        val town = findViewById<AutoCompleteTextView>(R.id.acBirthPlace)
        val towns: Array<out String> = resources.getStringArray(R.array.town)
        ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, towns).also { adapter -> town.setAdapter(adapter) }
    }
}