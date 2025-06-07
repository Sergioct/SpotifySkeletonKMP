package com.sergiocrespotoubesspotifyskeletonkmp

import androidx.compose.runtime.*
import com.sergiocrespotoubesspotifyskeletonkmp.theme.SpotifyTheme
import com.sergiocrespotoubesspotifyskeletonkmp.theme.getColorsTheme
import com.sergiocrespotoubesspotifyskeletonkmp.features.SplashScreen
import moe.tlaster.precompose.PreComposeApp
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable
@Preview
fun App() {
    PreComposeApp {

        val colors = getColorsTheme()

        SpotifyTheme {
            SplashScreen {

            }
        }
    }
}