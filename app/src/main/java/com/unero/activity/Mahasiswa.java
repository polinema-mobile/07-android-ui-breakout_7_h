package com.unero.activity;

public class Mahasiswa {
    private long nim;
    private String nama, gender, jurusan, tglLahir;

    public Mahasiswa(long nim, String nama, String gender, String jurusan, String tglLahir) {
        this.nim = nim;
        this.nama = nama;
        this.gender = gender;
        this.jurusan = jurusan;
        this.tglLahir = tglLahir;
    }

    public long getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public String getGender() {
        return gender;
    }

    public String getJurusan() {
        return jurusan;
    }

    public String getTglLahir() {
        return tglLahir;
    }
}
