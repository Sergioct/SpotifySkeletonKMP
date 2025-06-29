package com.sergiocrespotoubesspotifyskeletonkmp.data.mapper

import com.sergiocrespotoubesspotifyskeletonkmp.data.network.dto.ArtistDto
import com.sergiocrespotoubesspotifyskeletonkmp.data.db.entities.ArtistEntity
import com.sergiocrespotoubesspotifyskeletonkmp.domain.model.ArtistModel

fun ArtistDto.toArtistEntity(): ArtistEntity {
    return ArtistEntity(
        id = this.id,
        name = this.name,
        image = this.images.firstOrNull()?.url ?: "",
        popularity = this.popularity,
    )
}

fun ArtistDto.toArtistModel(): ArtistModel {
    return ArtistModel(
        id = this.id,
        name = this.name,
        urlPicture = this.images.firstOrNull()?.url ?: "",
        popularity = this.popularity,
    )
}

fun ArtistEntity.toTrackModel(): ArtistModel {
    return ArtistModel(
        id = this.id,
        name = this.name,
        urlPicture = this.image,
        popularity = this.popularity,
    )
}

fun ArtistDto.toTrackModel(): ArtistModel {
    return ArtistModel(
        id = this.id,
        name = this.name,
        urlPicture = this.images.firstOrNull()?.url ?: "",
        popularity = this.popularity,
    )
}
