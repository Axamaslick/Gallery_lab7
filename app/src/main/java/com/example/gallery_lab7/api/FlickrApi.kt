package com.example.gallery_lab7.api

import retrofit2.Call
import retrofit2.http.GET

interface FlickrApi {
    @GET("services/rest/?method=flickr.interestingness.getList" + "&api_key=858ef0a6ed868feebcbadf152781b635" + "&format=json" + "&nojsoncallback=1" + "&extras=url_s"
    )
    fun fetchPhotos(): Call<String>
}