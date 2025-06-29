package com.sergiocrespotoubesspotifyskeletonkmp.data.mapper

import com.sergiocrespotoubesspotifyskeletonkmp.data.network.dto.AuthInfoDto
import com.sergiocrespotoubesspotifyskeletonkmp.domain.model.AuthInfoModel

fun AuthInfoDto.toModel(): AuthInfoModel {
    return AuthInfoModel(
        accessToken = this.accessToken,
    )
}
