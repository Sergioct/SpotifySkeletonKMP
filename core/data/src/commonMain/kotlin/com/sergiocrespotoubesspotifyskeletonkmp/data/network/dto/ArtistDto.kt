package com.sergiocrespotoubesspotifyskeletonkmp.data.network.dto

import com.sergiocrespotoubesspotifyskeletonkmp.data.network.dto.ImageDto
import kotlinx.serialization.Serializable

@Serializable
data class ArtistDto(
    val id: String,
    val name: String,
    val popularity: Int,
    val images: List<ImageDto> = emptyList(),
)
