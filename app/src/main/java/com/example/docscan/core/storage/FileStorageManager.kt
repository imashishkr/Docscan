package com.lensscan.core.storage

import android.content.Context
import android.net.Uri
import com.lensscan.core.constants.AppConstants
import java.io.File

class FileStorageManager(private val context: Context) {

    fun savePdf(uri: Uri, fileName: String): String {

        val dir = File(context.filesDir, AppConstants.DOCUMENT_FOLDER)

        if (!dir.exists()) {
            dir.mkdirs()
        }

        val file = File(dir, "$fileName.pdf")

        context.contentResolver.openInputStream(uri)?.use { input ->
            file.outputStream().use { output ->
                input.copyTo(output)
            }
        }

        return file.absolutePath
    }

}
