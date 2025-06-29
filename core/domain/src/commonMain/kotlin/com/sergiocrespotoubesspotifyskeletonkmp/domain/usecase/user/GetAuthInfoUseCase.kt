package com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.user

import com.sergiocrespotoubesspotifyskeletonkmp.domain.model.AuthInfoModel
import com.sergiocrespotoubesspotifyskeletonkmp.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow

interface GetAuthInfoUseCase {
    suspend fun execute(): Flow<Result<AuthInfoModel>>
}

class GetAuthInfoUseCaseImpl(
    private val userRepository: UserRepository,
) : GetAuthInfoUseCase {
    override suspend fun execute(): Flow<Result<AuthInfoModel>> {
        return userRepository.getAuthInfo()
    }
}
