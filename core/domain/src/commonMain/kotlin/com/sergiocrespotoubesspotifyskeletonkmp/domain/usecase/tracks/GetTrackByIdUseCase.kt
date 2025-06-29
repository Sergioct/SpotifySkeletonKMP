package com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.tracks

import com.sergiocrespotoubesspotifyskeletonkmp.domain.model.TrackModel
import com.sergiocrespotoubesspotifyskeletonkmp.domain.repository.TracksRepository
import kotlinx.coroutines.flow.Flow

interface GetTrackByIdUseCase {
    suspend fun execute(trackId: String): Flow<Result<TrackModel>>
}

class GetTrackByIdUseCaseImpl(
    private val tracksRepository: TracksRepository,
) : GetTrackByIdUseCase {
    override suspend fun execute(trackId: String): Flow<Result<TrackModel>> {
        return tracksRepository.getTrackById(trackId)
    }
}
