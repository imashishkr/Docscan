package com.lensscan.core.utils

import android.content.Context
import java.io.File

object FileUtils {

    fun createDocumentDirectory(context: Context): File {

        val dir = File(context.filesDir, "documents")

        if (!dir.exists()) {
            dir.mkdirs()
        }

        return dir
    }

}
