package com.unero.activity

import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var txtNIM: EditText
    private lateinit var txtNama: EditText
    private lateinit var txtBirth: TextView
    private lateinit var rgGender: RadioGroup
    private lateinit var spnJurusan: Spinner
    private lateinit var btnSave: Button
    private lateinit var selectedRadio: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initViews()
        birthdate()
        save()
    }

    private fun initViews(){
        txtNIM = findViewById(R.id.txtNIM)
        txtNama = findViewById(R.id.txtNama)
        txtBirth = findViewById(R.id.txtBirthday)
        rgGender = findViewById(R.id.rgGender)
        spnJurusan = findViewById(R.id.spnJurusan)
        btnSave = findViewById(R.id.btnSave)
    }

    private fun birthdate() {
        txtBirth.setOnClickListener {
            val cal = Calendar.getInstance()
            val year = cal.get(Calendar.YEAR)
            val month = cal.get(Calendar.MONTH)
            val day = cal.get(Calendar.DAY_OF_MONTH)


            val dpd = DatePickerDialog(
                    this,
                    { _, year, monthOfYear, dayOfMonth ->
                        val bulan = monthOfYear + 1
                        txtBirth.setText("$dayOfMonth/$bulan/$year")
                    },
                    year, month, day
            )
            dpd.show()
        }
    }

    private fun findRadio(): String {
        val foundID: Int = rgGender.checkedRadioButtonId
        if (foundID == -1)
            return ""
        else
            selectedRadio = findViewById(foundID)
            return selectedRadio.text.toString()
    }

    private fun save() {
        btnSave.setOnClickListener {
            val nim: String = txtNIM.text.toString()
            val nama: String = txtNama.text.toString()
            val birth: String = txtBirth.text.toString()
            val gender: String = findRadio()
            val jurusan: String = spnJurusan.selectedItem.toString()

            if (nim.isEmpty() || nama.isEmpty() || birth.isEmpty() || gender.isEmpty())
                Toast.makeText(applicationContext, "Form tidak boleh kosong", Toast.LENGTH_LONG).show()
            else{
                val mahasiswa = Mahasiswa(nim.toInt(), nama, birth, gender, jurusan)
                val intent = Intent(this, TampilData::class.java).apply {
                    putExtra("MHS", mahasiswa)
                }
                startActivity(intent)
            }
        }
    }
}