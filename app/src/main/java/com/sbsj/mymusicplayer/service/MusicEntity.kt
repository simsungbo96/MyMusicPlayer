package com.sbsj.mymusicplayer.service

import com.google.gson.annotations.SerializedName
import com.sbsj.mymusicplayer.MusicModel
import com.sbsj.mymusicplayer.PlayerModel

data class MusicEntity(
    @SerializedName("track")
    val track: String,
    @SerializedName("streamUrl")
    val streamUrl: String,
    @SerializedName("artist")
    val artist: String,
    @SerializedName("coverUrl")
    val coverUrl: String

)

fun MusicEntity.mapper(id:Long):MusicModel = MusicModel(
    id = id,
    streamUrl = this.streamUrl,
    coverUrl = this.coverUrl,
    track = this.track,
    artist = this.artist
)
fun MusicDto.mapper():PlayerModel =
    PlayerModel(
        playMusicList =  this.musics.mapIndexed { index, musicEntity ->
            musicEntity.mapper(index.toLong())
        }

    )
