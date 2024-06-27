package com.akirachix.blog

import android.media.Image
import java.sql.Date

data class Blog(
    var name: String,
    var date: String,
    var paragraph: String,
    var image: String,
    var title:String,
    var more: String
)
