package com.sergiocrespotoubesspotifyskeletonkmp.data.repository

import com.sergiocrespotoubesspotifyskeletonkmp.domain.model.AuthInfoModel
import com.sergiocrespotoubesspotifyskeletonkmp.domain.repository.UserRepository
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

class UserRepositoryImpl(
    private val httpClient: HttpClient
) : UserRepository {
    override suspend fun getAuthInfo(): Flow<Result<AuthInfoModel>> = flow {
        val response = httpClient.get("/api/token")
        response.body()
    }
}

/*
@POST(value = "/api/token")
suspend fun getAuthInfo(
    @Query("grant_type") granType: String = "client_credentials",
    @Query("client_id") clientId: String = "e57a98d00b934c499c102ddfaeafb045",
    @Query("client_secret") clientSecret: String = "c561334da94040b28a5831d2d211855a",
    @Header("Content-Type") contentType: String = "application/x-www-form-urlencoded",
): Result<AuthInfoDto>*/
