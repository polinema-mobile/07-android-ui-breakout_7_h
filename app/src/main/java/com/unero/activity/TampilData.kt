package com.unero.activity

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class TampilData : AppCompatActivity() {

    private lateinit var nim: TextView
    private lateinit var nama: TextView
    private lateinit var birth: TextView
    private lateinit var gender: TextView
    private lateinit var jurusan: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tampil_data)

        initViews()
        getSet()
    }

    private fun initViews(){
        nim = findViewById(R.id.txtNIM)
        nama = findViewById(R.id.txtNama)
        birth = findViewById(R.id.txtTgl)
        gender = findViewById(R.id.txtGender)
        jurusan = findViewById(R.id.txtJurusan)
    }

    private fun getSet() {
        val mahasiswa = intent.extras?.getParcelable<Mahasiswa>("MHS")
        val vnim: String = mahasiswa!!.nim.toString()
        val vnama: String = mahasiswa.nama
        val vbirth: String = mahasiswa.date
        val vgender: String = mahasiswa.gender
        val vjurusan: String = mahasiswa.jurusan

        nim.text = vnim
        nama.text = vnama
        birth.text = vbirth
        gender.text = vgender
        jurusan.text = vjurusan
    }
}