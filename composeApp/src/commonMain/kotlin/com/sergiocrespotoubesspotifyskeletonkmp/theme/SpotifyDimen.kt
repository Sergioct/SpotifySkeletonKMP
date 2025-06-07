package com.sergiocrespotoubesspotifyskeletonkmp.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.unit.dp

object SpotifyDimen {
    @Composable
    @ReadOnlyComposable
    fun spaceSmall() = 8.dp //dimensionResource(R.dimen.space_small)

    @Composable
    @ReadOnlyComposable
    fun spaceMedium() = 16.dp

    @Composable
    @ReadOnlyComposable
    fun spaceBig() = 32.dp//dimensionResource(R.dimen.space_big)
}
