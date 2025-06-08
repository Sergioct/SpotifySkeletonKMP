package com.sergiocrespotoubesspotifyskeletonkmp.navigation.navgraph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.sergiocrespotoubesspotifyskeletonkmp.artistdetail.ArtistDetailScreen
import com.sergiocrespotoubesspotifyskeletonkmp.navigation.Routes

fun NavGraphBuilder.artistDetailScreen(onBackClick: () -> Unit) {
    composable<Routes.ArtistDetail> {
        val args = it.toRoute<Routes.ArtistDetail>()
        ArtistDetailScreen(
            args.artistId,
            onBackClick = onBackClick,
        )
    }
}
