package com.sergiocrespotoubesspotifyskeletonkmp.domain.repository

import com.sergiocrespotoubesspotifyskeletonkmp.domain.model.ArtistModel
import com.sergiocrespotoubesspotifyskeletonkmp.domain.model.TrackModel
import kotlinx.coroutines.flow.Flow

interface SearchRepository {
    suspend fun getSearchByArtist(artistName: String): Flow<Result<List<ArtistModel>>>

    suspend fun getSearchByTrack(trackName: String): Flow<Result<List<TrackModel>>>
}
