package com.sergiocrespotoubesspotifyskeletonkmp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import com.sergiocrespotoubesspotifyskeletonkmp.navigation.navgraph.artistDetailScreen
import com.sergiocrespotoubesspotifyskeletonkmp.navigation.navgraph.artistSearchScreen
import com.sergiocrespotoubesspotifyskeletonkmp.navigation.navgraph.splashScreen
import com.sergiocrespotoubesspotifyskeletonkmp.navigation.navgraph.trackDetailScreen

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
