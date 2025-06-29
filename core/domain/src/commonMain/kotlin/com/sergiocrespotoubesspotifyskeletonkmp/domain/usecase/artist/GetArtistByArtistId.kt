package com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.artist

import com.sergiocrespotoubesspotifyskeletonkmp.domain.model.ArtistModel
import com.sergiocrespotoubesspotifyskeletonkmp.domain.repository.ArtistRepository
import kotlinx.coroutines.flow.Flow

interface GetArtistByArtistId {
    suspend fun execute(artistId: String): Flow<Result<ArtistModel>>
}

class GetArtistByArtistIdImpl(
    private val artistRepository: ArtistRepository,
) : GetArtistByArtistId {
    override suspend fun execute(artistId: String): Flow<Result<ArtistModel>> {
        return artistRepository.getArtistByArtistId(artistId)
    }
}
