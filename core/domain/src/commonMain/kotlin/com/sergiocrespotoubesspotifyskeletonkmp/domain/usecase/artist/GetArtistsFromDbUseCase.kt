package com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.artist

import com.sergiocrespotoubesspotifyskeletonkmp.domain.model.ArtistModel
import com.sergiocrespotoubesspotifyskeletonkmp.domain.repository.ArtistRepository
import kotlinx.coroutines.flow.Flow

interface GetArtistsFromDbUseCase {
    suspend fun execute(): Flow<Result<List<ArtistModel>>>
}

class GetArtistsFromDbUseCaseImpl(
    private val artistRepository: ArtistRepository,
) : GetArtistsFromDbUseCase {
    override suspend fun execute(): Flow<Result<List<ArtistModel>>> {
        return artistRepository.getArtistsFromDb()
    }
}
