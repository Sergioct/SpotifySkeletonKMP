package com.sergiocrespotoubesspotifyskeletonkmp.navigation.navgraph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.sergiocrespotoubesspotifyskeletonkmp.features.SplashScreen
import com.sergiocrespotoubesspotifyskeletonkmp.navigation.Routes

fun NavGraphBuilder.splashScreen(navigateToArtistSearch: () -> Unit) {
    composable<Routes.Splash> {
        SplashScreen(
            navigateToArtistSearch = navigateToArtistSearch,
        )
    }
}
