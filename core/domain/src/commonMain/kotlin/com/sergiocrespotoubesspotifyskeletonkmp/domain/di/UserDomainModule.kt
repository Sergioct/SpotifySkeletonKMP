package com.sergiocrespotoubesspotifyskeletonkmp.domain.di

import com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.user.GetAuthInfoUseCase
import com.sergiocrespotoubesspotifyskeletonkmp.domain.usecase.user.GetAuthInfoUseCaseImpl
import org.koin.dsl.module

val provideUserDomainModule = module {
    single<GetAuthInfoUseCase> {
        GetAuthInfoUseCaseImpl(get())
    }
}