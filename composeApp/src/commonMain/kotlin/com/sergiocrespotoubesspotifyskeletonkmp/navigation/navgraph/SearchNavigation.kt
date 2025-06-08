package com.sergiocrespotoubesspotifyskeletonkmp.navigation.navgraph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import com.sergiocrespotoubesspotifyskeletonkmp.navigation.Routes
import com.sergiocrespotoubesspotifyskeletonkmp.search.SearchScreen

fun NavGraphBuilder.artistSearchScreen(
    navigateToArtistDetail: (String) -> Unit,
    navigateToTrackDetail: (String) -> Unit,
) {
    composable<Routes.ArtistSearch> {
        SearchScreen(
            navigateToArtistDetail = navigateToArtistDetail,
            navigateToTrackDetail = navigateToTrackDetail,
        )
    }
}
