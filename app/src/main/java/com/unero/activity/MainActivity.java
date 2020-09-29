package com.unero.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    // Views & Object
    final Calendar calendar = Calendar.getInstance();
    EditText edtTanggal, edtNama, edtNIM;
    Button btnSimpan;
    Spinner spnrJurusan;

    private String nama, nim, tglLahir, jurusan;

    DatePickerDialog.OnDateSetListener date = new DatePickerDialog.OnDateSetListener() {
        @Override
        public void onDateSet(DatePicker datePicker, int year, int monthOfYear, int dayOfMonth) {
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, monthOfYear);
            calendar.set(Calendar.DAY_OF_MONTH, dayOfMonth);
            update_edtTanggal();
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Inisialisasi Views
        edtTanggal = (EditText) findViewById(R.id.edtTglLahir);
        btnSimpan = (Button) findViewById(R.id.btnSubmit);
        edtNama = (EditText) findViewById(R.id.edtNama);
        edtNIM = (EditText) findViewById(R.id.edtNIM);
        spnrJurusan = (Spinner) findViewById(R.id.spnrJurusan);

        // Edit Text Click
        edtTanggal.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                new DatePickerDialog(MainActivity.this, date, calendar.get(Calendar.YEAR),
                        calendar.get(Calendar.MONTH), calendar.get(Calendar.DAY_OF_MONTH)).show();
            }
        });

        // Button Click
        btnSimpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getAll();
            }
        });
    }

    private void update_edtTanggal() {
        String formatCalendar = "dd/MM/YYYY"; //In which you need put here
        SimpleDateFormat sdf = new SimpleDateFormat(formatCalendar, Locale.US);
        edtTanggal.setText(sdf.format(calendar.getTime()));
    }

    private void getAll(){
        nama = edtNama.getText().toString();
        nim = edtNIM.getText().toString();
        tglLahir = edtTanggal.getText().toString();
    }
}