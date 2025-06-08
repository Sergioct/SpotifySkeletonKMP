package com.sergiocrespotoubesspotifyskeletonkmp.splash

private const val NUMBER_OF_TASKS = 2

/*
@HiltViewModel
class SplashViewModel
    @Inject
    constructor(
        private val getAuthInfoUseCase: GetAuthInfoUseCase,
        private val preferencesManager: PreferencesManager,
    ) : ViewModel() {
        private val _state = MutableStateFlow<State>(State.Idle)
        val state: StateFlow<State> = _state

        private val _event: MutableSharedFlow<Event> = MutableSharedFlow()
        val event: SharedFlow<Event>
            get() = _event.asSharedFlow()

        private var tasksCompleted = 0

        init {
            initSplashCountDown()
            getAuthInfo()
        }

        private fun initSplashCountDown() =
            viewModelScope.launch {
                delay(2000)
                tasksCompleted++
                checkAllTasksAreCompleted()
            }

        private fun getAuthInfo() =
            viewModelScope.launch {
                getAuthInfoUseCase.execute().collect {
                    it.onSuccess { authInfo ->
                        preferencesManager.setAuthToken(authInfo.accessToken)
                        tasksCompleted++
                        checkAllTasksAreCompleted()
                    }
                        .onFailure {
                            _event.emit(Event.ShowError)
                            _state.value = State.Error
                        }
                }
            }

        fun onRetryClick() {
            _state.value = State.Idle
            getAuthInfo()
        }

        private fun checkAllTasksAreCompleted() =
            viewModelScope.launch {
                if (tasksCompleted >= NUMBER_OF_TASKS) {
                    _event.emit(Event.NavigateToArtistSearch)
                }
            }

        sealed interface State {
            data object Idle : State

            data object Error : State
        }

        sealed interface Event {
            data object NavigateToArtistSearch : Event

            data object ShowError : Event
        }
    }
*/
