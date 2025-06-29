package com.sergiocrespotoubesspotifyskeletonkmp.navigation

sealed class Routes {
    object Splash
    object ArtistSearch
    data class TrackDetail(
        val trackId: String,
    )
    data class ArtistDetail(
        val artistId: String,
    )
}
