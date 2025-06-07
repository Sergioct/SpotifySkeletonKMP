package com.sergiocrespotoubesspotifyskeletonkmp.features

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.sergiocrespotoubesspotifyskeletonkmp.theme.SpotifyDimen
import com.sergiocrespotoubesspotifyskeletonkmp.theme.SpotifyTheme
import com.sergiocrespotoubesspotifyskeletonkmp.ui.image.SpotifyImage
import org.jetbrains.compose.resources.painterResource
import org.jetbrains.compose.resources.stringResource
import org.jetbrains.compose.ui.tooling.preview.Preview
import spotifyskeletonkmp.composeapp.generated.resources.Res
import spotifyskeletonkmp.composeapp.generated.resources.splash_name
import spotifyskeletonkmp.composeapp.generated.resources.splash_spotify

@Composable
fun SplashScreen(
    //splashViewModel: SplashViewModel = hiltViewModel(),
    navigateToArtistSearch: () -> Unit,
) {
    //val context = LocalContext.current
    //val state = splashViewModel.state.collectAsState().value
    Design(
        /*context,
        state = state,
        onRetryClick = { splashViewModel.onRetryClick() },*/
    )
    /*ReadEvents(
        splashViewModel = splashViewModel,
        navigateToArtistSearch = navigateToArtistSearch,
    )*/
}

@Composable
private fun Design(
    //context: Context,
    //state: SplashViewModel.State,
    //onRetryClick: () -> Unit,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Column(
            modifier =
                Modifier
                    .align(Alignment.Center)
                    .padding(horizontal = SpotifyDimen.spaceBig()),
        ) {
            SpotifyImage(
                painter = painterResource(Res.drawable.splash_spotify),
                contentDescription = stringResource(Res.string.splash_name),
            )
            /*SpotifyTextTitleBold(
                modifier =
                    Modifier
                        .align(Alignment.CenterHorizontally)
                        .padding(top = SpotifyDimen.spaceMedium()),
                text = getString(context, R.string.app_name),
            )
            if (state == SplashViewModel.State.Error) {
                SpotifyButton(
                    modifier =
                        Modifier
                            .align(Alignment.CenterHorizontally)
                            .padding(top = SpotifyDimen.spaceBig())
                            .wrapContentSize(),
                    text = stringResource(R.string.splash_retry_button),
                    onClick = { onRetryClick() },
                )
            }*/
        }
    }
}

/*@Composable
fun ReadEvents(
    splashViewModel: SplashViewModel,
    navigateToArtistSearch: () -> Unit,
) {
    val context = LocalContext.current
    LaunchedEffect(Unit) {
        splashViewModel.event.collect { event ->
            when (event) {
                is SplashViewModel.Event.NavigateToArtistSearch -> {
                    navigateToArtistSearch()
                }
                SplashViewModel.Event.ShowError ->
                    showToastError(context)
            }
        }
    }
}

private fun showToastError(context: Context) {
    Toast.makeText(
        context,
        context.getString(R.string.splash_error_message),
        Toast.LENGTH_LONG,
    ).show()
}*/

@Preview
@Composable
fun SplashScreenPreview() {
    SpotifyTheme {
        SplashScreen(
            navigateToArtistSearch = {},
        )
    }
}
