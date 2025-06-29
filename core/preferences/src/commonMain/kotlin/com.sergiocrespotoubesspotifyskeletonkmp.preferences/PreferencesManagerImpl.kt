package com.sergiocrespotoubesspotifyskeletonkmp.preferences

import com.sergiocrespotoubes.preferences.PreferencesManager

const val SHARED_PREFERENCES_FILE = "com.sergiocrespotoubesspotifyskeletonkmp.spotify.preferences"

class PreferencesManagerImpl(

) : PreferencesManager {
    //private val sharedPreferences = context.getSharedPreferences(SHARED_PREFERENCES_FILE, Context.MODE_PRIVATE)

    override fun getAuthToken(): String {
        return ""//sharedPreferences.getString(PreferenceKeys.AUTH_TOKEN.key, "") ?: ""
    }

    override fun setAuthToken(authToken: String) {
        //sharedPreferences.edit().putString(PreferenceKeys.AUTH_TOKEN.key, authToken).apply()
    }
}
