package com.sergiocrespotoubesspotifyskeletonkmp.data.network.datasource

import com.sergiocrespotoubesspotifyskeletonkmp.data.network.dto.SearchDto
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

interface SearchNetworkDataSource {
    suspend fun getSearchArtists(artistName: String): Result<SearchDto>

    suspend fun getSearchTracks(trackName: String): Result<SearchDto>
}

class SearchNetworkDataSourceImpl(
    private val httpClient: HttpClient
) : SearchNetworkDataSource {
    override suspend fun getSearchArtists(artistName: String): Result<SearchDto> {
        val response = httpClient.get("/v1/search")
        return runCatching { response.body() }
    }

    override suspend fun getSearchTracks(trackName: String): Result<SearchDto> {
        val response = httpClient.get("/v1/search")
        return runCatching { response.body() }
    }
}

/*@GET(value = "/v1/search")
suspend fun getSearchArtists(
@Query("type") type: String = "artist",
@Query("limit") limit: Int = 20,
@Query("q") artistName: String,
): Result<SearchDto>

@GET(value = "/v1/search")
suspend fun getSearchTracks(
@Query("type") type: String = "track",
@Query("limit") limit: Int = 20,
@Query("q") trackName: String,
): Result<SearchDto>*/

