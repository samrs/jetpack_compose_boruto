package com.example.borutoapp.data.remote

import com.example.borutoapp.domain.model.ApiResponse
import kotlinx.serialization.ExperimentalSerializationApi
import retrofit2.http.GET
import retrofit2.http.Query

interface BorutoApi {

    @OptIn(ExperimentalSerializationApi::class)
    @GET("/boruto/heroes")
    suspend fun getAllHeroes(
        @Query("page") page: Int = 1
    ): ApiResponse

    @OptIn(ExperimentalSerializationApi::class)
    @GET("/boruto/heroes/search")
    suspend fun searchHeroes(
        @Query("name") name: String
    ): ApiResponse

}