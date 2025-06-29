package com.sergiocrespotoubesspotifyskeletonkmp.data.repository

import com.sergiocrespotoubesspotifyskeletonkmp.data.mapper.toArtistEntity
import com.sergiocrespotoubesspotifyskeletonkmp.data.mapper.toTrackModel
import com.sergiocrespotoubesspotifyskeletonkmp.data.network.datasource.ArtistNetworkDataSource
import com.sergiocrespotoubesspotifyskeletonkmp.domain.model.ArtistModel
import com.sergiocrespotoubesspotifyskeletonkmp.domain.repository.ArtistRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.IO
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.emitAll
import kotlinx.coroutines.flow.emptyFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class ArtistRepositoryImpl(
        //private val artistsDbDatasource: ArtistsDbDatasource,
        private val artistNetworkDataSource: ArtistNetworkDataSource,
    ) : ArtistRepository {
        override suspend fun getArtistsFromDb(): Flow<Result<List<ArtistModel>>> =
            flow {
                /*val artistsFlow =
                    artistsDbDatasource.getArtists().map { artists ->
                        Result.success(artists.map { it.toTrackModel() })
                    }
                emitAll(artistsFlow)*/
                emitAll(emptyFlow())
            }

        override suspend fun getArtistByArtistId(artistId: String): Flow<Result<ArtistModel>> =
            flow {
                artistNetworkDataSource.getArtistByArtistId(artistId)
                    .map { artistDto ->
                        artistDto.toArtistEntity()
                    }.map { artistsEntity ->
                        //artistsDbDatasource.insertArtist(artistsEntity)
                        emit(Result.success(artistsEntity.toTrackModel()))
                    }
            }.flowOn(Dispatchers.IO)
    }

/*
@GET(value = "/v1/artists/{id}")
suspend fun getArtistByArtistId(
    @Path("id") artistId: String,
): Result<ArtistDto>*/
