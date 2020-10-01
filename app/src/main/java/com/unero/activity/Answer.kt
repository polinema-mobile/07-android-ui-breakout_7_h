package com.unero.activity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Answer(
        var question1: Int,
        var question2: String,
        var question3: String,
        var question4: String,
        var question5: String,
        var question6: String,
        var question7: Int,
        var question8: String,
        var question9: String,
        var question10: String,
        var question11: String
) : Parcelable