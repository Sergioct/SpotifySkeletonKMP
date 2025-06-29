package com.sergiocrespotoubesspotifyskeletonkmp.data.db.datasource

/*import com.sergiocrespotoubesspotifyskeletonkmp.data.db.dao.TrackDao
import com.sergiocrespotoubesspotifyskeletonkmp.data.db.entities.TrackEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject
import javax.inject.Singleton

interface TracksDbDataSource {
    suspend fun getTracks(): Flow<List<TrackEntity>>

    suspend fun saveTracks(tracks: List<TrackEntity>)

    suspend fun clearAll()
}

@Singleton
class TracksDbDataSourceImpl
    @Inject
    constructor(
        private val tracksDao: TrackDao,
    ) : TracksDbDataSource {
        override suspend fun getTracks(): Flow<List<TrackEntity>> {
            return tracksDao.getTracks()
        }

        override suspend fun saveTracks(tracks: List<TrackEntity>) {
            tracksDao.insertTracks(tracks)
        }

        override suspend fun clearAll() {
            tracksDao.clearAll()
        }
    }*/
