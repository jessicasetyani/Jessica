package com.example.jessicaSW.data.remote

import com.example.jessicaSW.model.SearchResult
import com.example.jessicaSW.model.UnsplashImage
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface UnsplashApi {

    //    @GET("/photos")
//    suspend fun getAllImages(
//        @Header("Authorization") token: String,
//        @Query("page") page: Int,
//        @Query("per_page") perPage: Int
//    ): List<UnsplashImage>
  //  @Headers("Authorization: Client-ID Dr0hMhvlXePXalRVj8L7oEJbsw3grkMgm0W8kh_5FH0")
    @GET("/photos")
    suspend fun getAllImages(
        @Header("Authorization") token: String,
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): List<UnsplashImage>


    @Headers("Authorization: Client-ID Dr0hMhvlXePXalRVj8L7oEJbsw3grkMgm0W8kh_5FH0")
    @GET("/search/photos")
    suspend fun searchImages(
        @Query("query") query: String,
        @Query("per_page") perPage: Int
    ): SearchResult

}