package com.sergiocrespotoubesspotifyskeletonkmp.search

import androidx.compose.runtime.Composable

@Composable
fun SearchScreen(
    //searchViewModel: SearchViewModel = hiltViewModel(),
    navigateToArtistDetail: (String) -> Unit,
    navigateToTrackDetail: (String) -> Unit,
) {
    /*Design(searchViewModel)
    ReadEvents(
        searchViewModel,
        navigateToArtistDetail = navigateToArtistDetail,
        navigateToTrackDetail = navigateToTrackDetail,
    )*/
}

/*
@Composable
private fun Design(searchViewModel: SearchViewModel) {
    Column(
        modifier =
            Modifier
                .fillMaxSize(),
    ) {
        SpotifyToolbar(stringResource(R.string.app_name))

        val state = searchViewModel.state.collectAsState().value
        SpotifyTextField(
            modifier =
                Modifier
                    .padding(top = SpotifyDimen.spaceBig())
                    .padding(horizontal = SpotifyDimen.spaceBig()),
            label = stringResource(R.string.search_filter_label),
            leadingIcon = Icons.Default.Search,
            text = state.inputText,
            onValueChange = {
                searchViewModel.onInputTextUpdate(it)
            },
        )
        val listState = rememberLazyListState()
        LazyColumn(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(vertical = SpotifyDimen.spaceMedium()),
            state = listState,
        ) {
            item {
                SpotifySpinnerLoading(state.artistLoading)
            }
            item {
                ArtistsList(
                    searchViewModel = searchViewModel,
                    state.artists,
                )
            }
            item {
                SpotifySpinnerLoading(state.trackLoading)
            }
            item {
                TracksList(state.tracks)
            }
            item {
                Spacer(modifier = Modifier.height(SpotifyDimen.spaceBig()))
            }
        }
    }
}

@Composable
fun ReadEvents(
    searchViewModel: SearchViewModel,
    navigateToArtistDetail: (String) -> Unit,
    navigateToTrackDetail: (String) -> Unit,
) {
    val context = LocalContext.current
    LaunchedEffect(Unit) {
        searchViewModel.event.collect { event ->
            when (event) {
                is SearchViewModel.Event.NavigateToArtistDetail -> {
                    navigateToArtistDetail(event.artistId)
                }
                is SearchViewModel.Event.NavigateToTrackDetail -> {
                    navigateToTrackDetail(event.trackId)
                }
                is SearchViewModel.Event.ShowError -> {
                    showToastError(context)
                }
            }
        }
    }
}

@Composable
fun ArtistsList(
    searchViewModel: SearchViewModel,
    artists: List<ArtistModel>,
) {
    if (artists.isNotEmpty()) {
        SpotifyTextMedium(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(all = SpotifyDimen.spaceMedium()),
            text = stringResource(R.string.search_subtitle_artists),
        )
        LazyRow {
            artists.forEach { artist ->
                item {
                    ArtistItem(searchViewModel, artist)
                }
            }
        }
    }
}

@Composable
private fun ArtistItem(
    searchViewModel: SearchViewModel,
    artist: ArtistModel,
) {
    Column(
        modifier =
            Modifier
                .padding(horizontal = SpotifyDimen.spaceMedium())
                .clickable {
                    searchViewModel.onArtistClick(artist.id)
                },
    ) {
        SpotifyAsyncImage(
            modifier =
                Modifier
                    .width(96.dp)
                    .height(96.dp)
                    .semantics {
                        invisibleToUser()
                    },
            model = artist.urlPicture,
            placeholder = painterResource(R.drawable.placeholder),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            error = painterResource(R.drawable.placeholder),
        )
        SpotifyTextSmall(
            modifier =
                Modifier
                    .width(96.dp)
                    .padding(top = SpotifyDimen.spaceSmall()),
            text = artist.name,
            maxLines = 1,
        )
    }
}

@Composable
fun TracksList(tracks: List<TrackModel>) {
    if (tracks.isNotEmpty()) {
        SpotifyTextMedium(
            modifier =
                Modifier
                    .fillMaxWidth()
                    .padding(all = SpotifyDimen.spaceMedium()),
            text = stringResource(R.string.search_subtitle_tracks),
        )
        tracks.forEach { track ->
            TrackItem(track)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SearchScreenPreview() {
    SpotifyTheme {
        SearchScreen(
            navigateToArtistDetail = {},
            navigateToTrackDetail = {},
        )
    }
}
*/
