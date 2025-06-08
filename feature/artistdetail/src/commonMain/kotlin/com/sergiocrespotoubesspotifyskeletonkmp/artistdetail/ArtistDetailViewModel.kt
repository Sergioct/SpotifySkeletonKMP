package com.sergiocrespotoubesspotifyskeletonkmp.artistdetail

/*
@HiltViewModel
class ArtistDetailViewModel
    @Inject
    constructor(
        private val getArtistByArtistId: GetArtistByArtistId,
        private val getTracksByArtistIdUseCase: GetTracksByArtistIdUseCase,
    ) : ViewModel() {
        private val _state: MutableStateFlow<State> = MutableStateFlow(State())
        val state: StateFlow<State>
            get() = _state.asStateFlow()

        private val _event: MutableSharedFlow<Event> = MutableSharedFlow()
        val event: SharedFlow<Event>
            get() = _event.asSharedFlow()

        fun getArtist(artistId: String) =
            viewModelScope.launch {
                getArtistByArtistId.execute(artistId).collect { result ->
                    result.onSuccess { artist ->
                        _state.value =
                            state.value.copy(
                                artist = artist,
                            )
                    }.onFailure {
                        _event.emit(Event.ShowError)
                    }
                }
            }

        fun getArtistTracks(artistId: String) =
            viewModelScope.launch {
                getTracksByArtistIdUseCase.execute(artistId).collect { result ->
                    result.onSuccess { tracks ->
                        _state.value =
                            state.value.copy(
                                tracksState = TracksState.Success(tracks),
                            )
                    }.onFailure {
                        _event.emit(Event.ShowError)
                        _state.value =
                            state.value.copy(
                                tracksState = TracksState.Error,
                            )
                    }
                }
            }

        sealed class Event {
            data object ShowError : Event()
        }

        data class State(
            val artist: ArtistModel? = null,
            val tracksState: TracksState = TracksState.Loading,
        )

        sealed class TracksState {
            data class Success(
                val tracks: List<TrackModel>,
            ) : TracksState()

            data object Error : TracksState()

            data object Loading : TracksState()
        }
    }
*/
