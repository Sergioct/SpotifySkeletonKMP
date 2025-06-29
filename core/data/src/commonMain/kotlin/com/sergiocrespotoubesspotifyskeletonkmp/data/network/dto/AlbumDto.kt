package com.sergiocrespotoubesspotifyskeletonkmp.data.network.dto

import kotlinx.serialization.Serializable

@Serializable
data class AlbumDto(
    val images: List<ImageDto> = emptyList(),
)
