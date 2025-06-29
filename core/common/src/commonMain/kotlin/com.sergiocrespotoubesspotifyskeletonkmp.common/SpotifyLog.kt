package com.sergiocrespotoubesspotifyskeletonkmp.common

import io.github.aakira.napier.Napier

object SpotifyLog {
    fun i(text: String) {
        //if (BuildConfig.DEBUG) {
            Napier.i(text, tag = "SpotifySkeletonLog")
        //}
    }
}
