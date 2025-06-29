package com.sergiocrespotoubesspotifyskeletonkmp.preferences.di

import com.sergiocrespotoubes.preferences.PreferencesManager
import com.sergiocrespotoubesspotifyskeletonkmp.preferences.PreferencesManagerImpl
import org.koin.dsl.module

val preferencesModule = module {
    single<PreferencesManager> {
        PreferencesManagerImpl()
    }
}