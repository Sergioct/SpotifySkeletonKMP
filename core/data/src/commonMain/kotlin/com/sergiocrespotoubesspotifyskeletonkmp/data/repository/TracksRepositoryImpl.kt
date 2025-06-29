package com.sergiocrespotoubesspotifyskeletonkmp.data.repository

import com.sergiocrespotoubesspotifyskeletonkmp.domain.model.TrackModel
import com.sergiocrespotoubesspotifyskeletonkmp.domain.repository.TracksRepository
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class TracksRepositoryImpl(
    private val httpClient: HttpClient
) : TracksRepository {
        override suspend fun getTracksByArtistId(artistId: String): Flow<Result<List<TrackModel>>> =
            flow {
                val response = httpClient.get("/v1/artists/{id}/top-tracks")
                response.body()
            }

        override suspend fun getTrackById(trackId: String): Flow<Result<TrackModel>> = flow {
            val response = httpClient.get("/v1/tracks/{id}")
            response.body()
        }

        override suspend fun getTracksFromDb(): Flow<Result<List<TrackModel>>> = flow {

        }
    }

/*
@GET(value = "/v1/artists/{id}/top-tracks")
suspend fun getTracksByArtistId(
    @Path("id") artistId: String,
): Result<ArtistTopTracksDto>

@GET(value = "/v1/tracks/{id}")
suspend fun getTrackById(
    @Query("id") trackId: String,
): Result<TrackDto>*/
