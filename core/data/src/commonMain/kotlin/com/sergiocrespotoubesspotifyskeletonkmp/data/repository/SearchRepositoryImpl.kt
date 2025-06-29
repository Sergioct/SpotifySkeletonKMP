package com.sergiocrespotoubesspotifyskeletonkmp.data.repository

import com.sergiocrespotoubesspotifyskeletonkmp.data.mapper.toArtistEntity
import com.sergiocrespotoubesspotifyskeletonkmp.data.mapper.toArtistModel
import com.sergiocrespotoubesspotifyskeletonkmp.data.mapper.toTrackEntity
import com.sergiocrespotoubesspotifyskeletonkmp.data.mapper.toTrackModel
import com.sergiocrespotoubesspotifyskeletonkmp.data.network.datasource.SearchNetworkDataSource
import com.sergiocrespotoubesspotifyskeletonkmp.domain.model.ArtistModel
import com.sergiocrespotoubesspotifyskeletonkmp.domain.model.TrackModel
import com.sergiocrespotoubesspotifyskeletonkmp.domain.repository.SearchRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class SearchRepositoryImpl(
        //private val artistsDbDatasource: ArtistsDbDatasource,
        //private val tracksDbDatasource: TracksDbDataSource,
        private val searchNetworkDataSource: SearchNetworkDataSource,
) : SearchRepository {
        override suspend fun getSearchByArtist(artistName: String): Flow<Result<List<ArtistModel>>> =
            flow {
               /* merge(
                    readArtistsFromDb(),
                    readArtistsFromNetwork(artistName),
                ).collect { result ->
                    emit(result)
                }*/
                readArtistsFromNetwork(artistName)
            }

        private fun readArtistsFromNetwork(artistName: String) =
            flow {
                emit(searchNetworkDataSource.getSearchArtists(artistName)
                    .map { searchDto ->
                        searchDto.artists?.items?.map { artistDto ->
                            artistDto.toArtistModel()
                        }
                    }
                )/*.map { artistsEntity ->
                        artistsEntity?.let {
                            artistsDbDatasource.clearAll()
                            artistsDbDatasource.saveArtists(artistsEntity)
                        }
                        emitAll(readArtistsFromDb())
                    }*/
            }.flowOn(Dispatchers.IO)

        /*private fun readArtistsFromDb() =
            flow {
                val artistsFlow =
                    artistsDbDatasource.getArtists().map {
                        Result.success(
                            it.map { artistsEntity ->
                                artistsEntity.toTrackModel()
                            },
                        )
                    }
                emitAll(artistsFlow)
            }.flowOn(Dispatchers.IO)*/

        override suspend fun getSearchByTrack(trackName: String): Flow<Result<List<TrackModel>>> =
            flow {
                /*merge(
                    readTracksFromDb(),
                    readTracksFromNetwork(trackName),
                ).collect { result ->
                    emit(result)
                }*/
                readTracksFromNetwork(trackName)
            }

        private fun readTracksFromNetwork(tracksName: String) =
            flow {
                emit(
                    searchNetworkDataSource.getSearchTracks(tracksName)
                    .map { searchDto ->
                        searchDto.tracks?.items?.map { trackDto ->
                            trackDto.toTrackModel()
                        }
                    }
                )/*.map { tracksEntity ->
                        tracksEntity?.let {
                            tracksDbDatasource.clearAll()
                            tracksDbDatasource.saveTracks(tracksEntity)
                        }
                        emitAll(readTracksFromDb())
                    }*/
            }.flowOn(Dispatchers.IO)

        /*private fun readTracksFromDb() =
            flow {
                val tracksFlow =
                    tracksDbDatasource.getTracks().map {
                        Result.success(
                            it.map { tracksEntity ->
                                tracksEntity.toTrackModel()
                            },
                        )
                    }
                emitAll(tracksFlow)
            }.flowOn(Dispatchers.IO)*/
    }

/*@GET(value = "/v1/search")
suspend fun getSearchArtists(
    @Query("type") type: String = "artist",
    @Query("limit") limit: Int = 20,
    @Query("q") artistName: String,
): Result<SearchDto>

@GET(value = "/v1/search")
suspend fun getSearchTracks(
    @Query("type") type: String = "track",
    @Query("limit") limit: Int = 20,
    @Query("q") trackName: String,
): Result<SearchDto>*/
