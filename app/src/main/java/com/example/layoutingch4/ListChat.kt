package com.example.layoutingch4

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class ListChat(
    var photo: Int,
    var name: String,
    var status: String
): Parcelable
