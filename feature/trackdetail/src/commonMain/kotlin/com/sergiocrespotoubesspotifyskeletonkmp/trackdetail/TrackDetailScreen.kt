package com.sergiocrespotoubesspotifyskeletonkmp.trackdetail

import androidx.compose.runtime.Composable

@Composable
fun TrackDetailScreen(
    trackId: String,
    //trackDetailViewModel: TrackDetailViewModel = hiltViewModel(),
) {
    //Design(trackDetailViewModel)
    //ReadEvents(trackDetailViewModel)
}

/*
@Composable
private fun Design(trackDetailViewModel: TrackDetailViewModel) {
    Column(
        modifier =
            Modifier
                .fillMaxSize(),
    ) {
        // SpotifyToolbar(stringResource(R.string.app_name))
        Column {
        }
    }
}

@Composable
fun ReadEvents(trackDetailViewModel: TrackDetailViewModel) {
    val context = LocalContext.current
    // LaunchedEffect(Unit) {
    //    trackDetailViewModel.event.collect { event ->
    //        when(event) {
    //            is SearchViewModel.Event.NavigateToArtistSearch -> {}
    //            is SearchViewModel.Event.ShowError -> {
    //                showToastError(context)
    //            }
    //        }
    //    }
    // }
}

@Preview(showBackground = true)
@Composable
fun TrackDetailScreenPreview() {
    SpotifyTheme {
        TrackDetailScreen("trackId")
    }
}
*/
