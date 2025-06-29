package com.sergiocrespotoubesspotifyskeletonkmp.domain.di

import com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.tracks.GetTrackByIdUseCase
import com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.tracks.GetTrackByIdUseCaseImpl
import com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.tracks.GetTracksByArtistIdUseCase
import com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.tracks.GetTracksByArtistIdUseCaseImpl
import com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.tracks.GetTracksFromDbUseCase
import com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.tracks.GetTracksFromDbUseCaseImpl
import org.koin.dsl.module

val provideTracksDomainModule = module {
    single<GetTrackByIdUseCase> {
        GetTrackByIdUseCaseImpl(get())
    }
    single<GetTracksByArtistIdUseCase> {
        GetTracksByArtistIdUseCaseImpl(get())
    }
    single<GetTracksFromDbUseCase> {
        GetTracksFromDbUseCaseImpl(get())
    }
}
