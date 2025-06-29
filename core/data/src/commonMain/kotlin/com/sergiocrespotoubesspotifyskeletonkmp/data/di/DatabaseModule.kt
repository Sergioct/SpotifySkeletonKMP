package com.sergiocrespotoubesspotifyskeletonkmp.data.di

import org.koin.dsl.module

val provideDatabaseModule = module {

}

/*
object DatabaseModule {
    @Provides
    fun provideArtistDao(spotifyDatabase: SpotifyDatabase): ArtistDao {
        return spotifyDatabase.artistDao()
    }

    @Provides
    fun provideTrackDao(spotifyDatabase: SpotifyDatabase): TrackDao {
        return spotifyDatabase.trackDao()
    }

    @Provides
    @Singleton
    fun provideSpotifyDatabase(
        @ApplicationContext appContext: Context,
    ): SpotifyDatabase {
        return Room.databaseBuilder(
            appContext,
            SpotifyDatabase::class.java,
            "spotify_skeleton.db",
        ).build()
    }
}
*/
