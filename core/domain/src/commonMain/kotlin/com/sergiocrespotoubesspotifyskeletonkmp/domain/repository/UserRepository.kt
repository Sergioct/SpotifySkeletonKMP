package com.sergiocrespotoubesspotifyskeletonkmp.domain.repository

import com.sergiocrespotoubesspotifyskeletonkmp.domain.model.AuthInfoModel
import kotlinx.coroutines.flow.Flow

interface UserRepository {
    suspend fun getAuthInfo(): Flow<Result<AuthInfoModel>>
}
