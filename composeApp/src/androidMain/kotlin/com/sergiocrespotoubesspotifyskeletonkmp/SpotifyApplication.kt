package com.sergiocrespotoubesspotifyskeletonkmp

import android.app.Application
import com.sergiocrespotoubesspotifyskeletonkmp.data.di.provideUserDataModule
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin

class SpotifyAndroidApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin {
            androidContext(this@SpotifyAndroidApplication)
            modules(
                provideUserDataModule,
                provideRepositoryModule,
                provideViewModelModule,
                platformDataModule,
                provideDocumentDownloaderModule
            )
        }
    }
}
