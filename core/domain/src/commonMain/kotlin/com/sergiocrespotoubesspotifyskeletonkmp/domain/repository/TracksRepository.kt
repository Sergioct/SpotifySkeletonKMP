package com.sergiocrespotoubesspotifyskeletonkmp.domain.repository

import com.sergiocrespotoubesspotifyskeletonkmp.domain.model.TrackModel
import kotlinx.coroutines.flow.Flow

interface TracksRepository {
    suspend fun getTracksByArtistId(artistId: String): Flow<Result<List<TrackModel>>>

    suspend fun getTrackById(trackId: String): Flow<Result<TrackModel>>

    suspend fun getTracksFromDb(): Flow<Result<List<TrackModel>>>
}
