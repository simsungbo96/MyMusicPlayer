package com.sbsj.mymusicplayer.service

import retrofit2.Call
import retrofit2.http.GET

interface MusicService {

    @GET("/v3/24fc2cad-e3bc-49ec-9543-3ef78f3557f3")
    fun listMusics() : Call<MusicDto>
}