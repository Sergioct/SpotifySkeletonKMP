package com.sergiocrespotoubesspotifyskeletonkmp.data.network.dto

import kotlinx.serialization.Serializable

@Serializable
data class ArtistsListDto(
    val items: List<ArtistDto> = emptyList(),
)
