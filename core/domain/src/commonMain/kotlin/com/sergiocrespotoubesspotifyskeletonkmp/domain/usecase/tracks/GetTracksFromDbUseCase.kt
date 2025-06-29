package com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.tracks

import com.sergiocrespotoubesspotifyskeletonkmp.domain.model.TrackModel
import com.sergiocrespotoubesspotifyskeletonkmp.domain.repository.TracksRepository
import kotlinx.coroutines.flow.Flow

interface GetTracksFromDbUseCase {
    suspend fun execute(): Flow<Result<List<TrackModel>>>
}

class GetTracksFromDbUseCaseImpl(
    private val tracksRepository: TracksRepository,
) : GetTracksFromDbUseCase {
    override suspend fun execute(): Flow<Result<List<TrackModel>>> {
        return tracksRepository.getTracksFromDb()
    }
}
