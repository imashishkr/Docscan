package com.lensscan.core.utils

import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

object DateUtils {

    private val formatter = SimpleDateFormat("dd MMM yyyy HH:mm", Locale.getDefault())

    fun format(timestamp: Long): String {
        return formatter.format(Date(timestamp))
    }

}
