package com.unero.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class TampilData extends AppCompatActivity {
    TextView tnim, tnama, tgender, tjurusan, ttglLahir;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tampil_data);

        tnim = findViewById(R.id.txtNIM);
        tnama = findViewById(R.id.txtNama);
        tgender = findViewById(R.id.txtGender);
        tjurusan = findViewById(R.id.txtJurusan);
        ttglLahir = findViewById(R.id.txtTglLahir);

        // Get Data
        Long NIM = getIntent().getLongExtra("NIM", 1L);
        String nama = getIntent().getStringExtra("nama");
        String gender = getIntent().getStringExtra("gender");
        String jurusan = getIntent().getStringExtra("jurusan");
        String tglLahir = getIntent().getStringExtra("tglLahir");

        tnim.setText(String.valueOf(NIM));
        tnama.setText(nama);
        tgender.setText(gender);
        tjurusan.setText(jurusan);
        ttglLahir.setText(tglLahir);

    }
}