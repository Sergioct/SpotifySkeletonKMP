package com.sergiocrespotoubesspotifyskeletonkmp.data.di

import com.sergiocrespotoubesspotifyskeletonkmp.data.repository.UserRepositoryImpl
import org.koin.dsl.module

val provideUserDataModule = module {
    single {
        UserRepositoryImpl(get())
    }
}