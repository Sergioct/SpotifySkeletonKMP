package com.sergiocrespotoubesspotifyskeletonkmp.domain

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.sergiocrespotoubesspotifyskeletonkmp.domain.navgraph.artistDetailScreen
import com.sergiocrespotoubesspotifyskeletonkmp.domain.navgraph.artistSearchScreen
import com.sergiocrespotoubesspotifyskeletonkmp.domain.navgraph.splashScreen
import com.sergiocrespotoubesspotifyskeletonkmp.domain.navgraph.trackDetailScreen
import com.sergiocrespotoubesspotifyskeletonkmp.navigation.Routes

@Composable
fun SpotifyNavHost() {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = Routes.Splash,
    ) {
        splashScreen(
            navigateToArtistSearch = {
                navController.navigate(Routes.ArtistSearch) {
                    popUpTo(Routes.Splash) { inclusive = true }
                }
            },
        )
        artistSearchScreen(
            navigateToArtistDetail = { artistId ->
                navController.navigate(Routes.ArtistDetail(artistId = artistId))
            },
            navigateToTrackDetail = { trackId ->
                navController.navigate(Routes.TrackDetail(trackId = trackId))
            },
        )
        artistDetailScreen(onBackClick = {
            navController.popBackStack()
        })
        trackDetailScreen()
    }
}
