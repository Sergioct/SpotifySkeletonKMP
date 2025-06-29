package com.sergiocrespotoubesspotifyskeletonkmp.domain.navgraph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.compose.composable
import androidx.navigation.toRoute
import com.sergiocrespotoubesspotifyskeletonkmp.navigation.Routes
import com.sergiocrespotoubesspotifyskeletonkmp.trackdetail.TrackDetailScreen

fun NavGraphBuilder.trackDetailScreen() {
    composable<Routes.TrackDetail> {
        val args = it.toRoute<Routes.TrackDetail>()
        TrackDetailScreen(args.trackId)
    }
}
