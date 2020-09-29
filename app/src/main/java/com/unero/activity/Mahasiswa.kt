package com.unero.activity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Mahasiswa(
        var nim: Int,
        var nama: String,
        var date: String,
        var gender: String,
        var jurusan: String
) : Parcelable