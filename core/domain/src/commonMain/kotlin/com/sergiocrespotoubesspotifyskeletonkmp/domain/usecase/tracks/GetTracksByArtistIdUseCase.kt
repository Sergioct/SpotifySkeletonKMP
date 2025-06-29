package com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.tracks

import com.sergiocrespotoubesspotifyskeletonkmp.domain.model.TrackModel
import com.sergiocrespotoubesspotifyskeletonkmp.domain.repository.TracksRepository
import kotlinx.coroutines.flow.Flow

interface GetTracksByArtistIdUseCase {
    suspend fun execute(artistId: String): Flow<Result<List<TrackModel>>>
}

class GetTracksByArtistIdUseCaseImpl(
    private val tracksRepository: TracksRepository,
) : GetTracksByArtistIdUseCase {
    override suspend fun execute(artistId: String): Flow<Result<List<TrackModel>>> {
        return tracksRepository.getTracksByArtistId(artistId)
    }
}
