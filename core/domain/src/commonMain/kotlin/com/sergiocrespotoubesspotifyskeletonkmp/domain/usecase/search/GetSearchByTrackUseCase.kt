package com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.search

import com.sergiocrespotoubesspotifyskeletonkmp.domain.model.TrackModel
import com.sergiocrespotoubesspotifyskeletonkmp.domain.repository.SearchRepository
import kotlinx.coroutines.flow.Flow

interface GetSearchByTrackUseCase {
    suspend fun execute(trackName: String): Flow<Result<List<TrackModel>>>
}

class GetSearchByTrackUseCaseImpl(
    private val searchRepository: SearchRepository,
) : GetSearchByTrackUseCase {
    override suspend fun execute(trackName: String): Flow<Result<List<TrackModel>>> {
        return searchRepository.getSearchByTrack(trackName)
    }
}
