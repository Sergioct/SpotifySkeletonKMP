package com.sergiocrespotoubesspotifyskeletonkmp.data.network.datasource

import com.sergiocrespotoubesspotifyskeletonkmp.data.network.dto.TrackDto
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get

interface TracksNetworkDataSource {
    suspend fun getTracks(): Result<List<TrackDto>>
}

class TracksNetworkDataSourceImpl(
    private val httpClient: HttpClient
) : TracksNetworkDataSource {
    override suspend fun getTracks(): Result<List<TrackDto>> {
        val response = httpClient.get("/v1/search")
        return runCatching { response.body() }
    }
}
