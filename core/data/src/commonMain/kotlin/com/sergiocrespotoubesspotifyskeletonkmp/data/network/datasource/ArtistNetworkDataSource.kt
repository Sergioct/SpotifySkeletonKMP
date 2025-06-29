package com.sergiocrespotoubesspotifyskeletonkmp.data.network.datasource

import com.sergiocrespotoubesspotifyskeletonkmp.data.network.dto.ArtistDto
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

interface ArtistNetworkDataSource {
    suspend fun getArtistByArtistId(artistId: String): Result<ArtistDto>
}

class ArtistNetworkDataSourceImpl(
    private val httpClient: HttpClient
) : ArtistNetworkDataSource {
    override suspend fun getArtistByArtistId(artistId: String): Result<ArtistDto> {
        val response = httpClient.get("/v1/artists/{id}")
        return runCatching { response.body() }
    }
}

/*
@GET(value = "/v1/artists/{id}")
suspend fun getArtistByArtistId(
    @Path("id") artistId: String,
): Result<ArtistDto>*/
