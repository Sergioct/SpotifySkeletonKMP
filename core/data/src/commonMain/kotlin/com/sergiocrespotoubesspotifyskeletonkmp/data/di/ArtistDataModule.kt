package com.sergiocrespotoubesspotifyskeletonkmp.data.di

import com.sergiocrespotoubesspotifyskeletonkmp.data.repository.ArtistRepositoryImpl
import org.koin.dsl.module

val provideArtistDataModule = module {
    single {
        ArtistRepositoryImpl(get())
    }
}