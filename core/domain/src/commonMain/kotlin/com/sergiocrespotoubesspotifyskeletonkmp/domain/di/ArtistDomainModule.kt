package com.sergiocrespotoubesspotifyskeletonkmp.domain.di

import com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.artist.GetArtistByArtistId
import com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.artist.GetArtistByArtistIdImpl
import com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.artist.GetArtistsFromDbUseCase
import com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.artist.GetArtistsFromDbUseCaseImpl
import org.koin.dsl.module

val provideArtistDomainModule = module {
    single<GetArtistsFromDbUseCase> {
        GetArtistsFromDbUseCaseImpl(get())
    }

    single<GetArtistByArtistId> {
        GetArtistByArtistIdImpl(get())
    }
}