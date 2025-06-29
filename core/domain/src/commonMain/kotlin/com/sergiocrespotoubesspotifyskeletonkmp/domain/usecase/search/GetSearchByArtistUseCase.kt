package com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.search

import com.sergiocrespotoubesspotifyskeletonkmp.domain.model.ArtistModel
import com.sergiocrespotoubesspotifyskeletonkmp.domain.repository.SearchRepository
import kotlinx.coroutines.flow.Flow

interface GetSearchByArtistUseCase {
    suspend fun execute(artist: String): Flow<Result<List<ArtistModel>>>
}

class GetSearchByArtistUseCaseImpl(
    private val searchRepository: SearchRepository,
) : GetSearchByArtistUseCase {
    override suspend fun execute(artist: String): Flow<Result<List<ArtistModel>>> {
        return searchRepository.getSearchByArtist(artist)
    }
}
