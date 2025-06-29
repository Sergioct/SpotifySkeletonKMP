package com.sergiocrespotoubesspotifyskeletonkmp.data.network.dto

import com.sergiocrespotoubesspotifyskeletonkmp.data.network.dto.TrackDto
import kotlinx.serialization.Serializable

@Serializable
data class ArtistTopTracksDto(
    val tracks: List<TrackDto>,
)
