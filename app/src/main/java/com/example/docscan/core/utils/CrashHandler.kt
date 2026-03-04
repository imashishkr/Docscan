package com.lensscan.core.utils

import android.util.Log

object CrashHandler {

    fun recordException(e: Throwable) {
        Log.e("LensScanCrash", "Crash captured", e)

        // Future integration
        // FirebaseCrashlytics.getInstance().recordException(e)
    }

}
