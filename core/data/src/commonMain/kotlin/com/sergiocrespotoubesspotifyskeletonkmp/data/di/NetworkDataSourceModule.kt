package com.sergiocrespotoubesspotifyskeletonkmp.data.di

import com.sergiocrespotoubesspotifyskeletonkmp.data.network.datasource.ArtistNetworkDataSourceImpl
import com.sergiocrespotoubesspotifyskeletonkmp.data.network.datasource.SearchNetworkDataSourceImpl
import com.sergiocrespotoubesspotifyskeletonkmp.data.network.datasource.TracksNetworkDataSourceImpl
import org.koin.dsl.module

val provideNetworkDataSourceModule = module {
    single {
        ArtistNetworkDataSourceImpl(get())
    }
    single {
        SearchNetworkDataSourceImpl(get())
    }
    single {
        TracksNetworkDataSourceImpl(get())
    }
}