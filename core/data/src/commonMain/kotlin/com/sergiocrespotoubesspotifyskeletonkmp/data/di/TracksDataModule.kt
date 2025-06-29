package com.sergiocrespotoubesspotifyskeletonkmp.data.di

import com.sergiocrespotoubesspotifyskeletonkmp.data.repository.TracksRepositoryImpl
import com.sergiocrespotoubes.domain.repository.TracksRepository
import com.sergiocrespotoubesspotifyskeletonkmp.data.repository.UserRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import org.koin.dsl.module

val provideTracksDataModule = module {
    single {
        TracksRepositoryImpl(get())
    }
}

@Module
@InstallIn(SingletonComponent::class)
interface TracksDataModule {
    @Binds
    fun bindsTracksRepository(tracksRepositoryImpl: TracksRepositoryImpl): TracksRepository
}
