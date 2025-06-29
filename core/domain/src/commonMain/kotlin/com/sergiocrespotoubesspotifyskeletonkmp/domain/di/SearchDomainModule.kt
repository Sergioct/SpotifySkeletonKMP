package com.sergiocrespotoubesspotifyskeletonkmp.domain.di

import com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.search.GetSearchByArtistUseCase
import com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.search.GetSearchByArtistUseCaseImpl
import com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.search.GetSearchByTrackUseCase
import com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.search.GetSearchByTrackUseCaseImpl
import org.koin.dsl.module

val provideSearchDomainModule = module {
    single<GetSearchByArtistUseCase> {
        GetSearchByArtistUseCaseImpl(get())
    }

    single<GetSearchByTrackUseCase> {
        GetSearchByTrackUseCaseImpl(get())
    }
}