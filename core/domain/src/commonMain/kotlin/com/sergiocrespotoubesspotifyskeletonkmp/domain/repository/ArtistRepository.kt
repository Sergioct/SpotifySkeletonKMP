package com.sergiocrespotoubesspotifyskeletonkmp.domain.repository

import com.sergiocrespotoubesspotifyskeletonkmp.domain.model.ArtistModel
import kotlinx.coroutines.flow.Flow

interface ArtistRepository {
    suspend fun getArtistsFromDb(): Flow<Result<List<ArtistModel>>>

    suspend fun getArtistByArtistId(artistId: String): Flow<Result<ArtistModel>>
}
