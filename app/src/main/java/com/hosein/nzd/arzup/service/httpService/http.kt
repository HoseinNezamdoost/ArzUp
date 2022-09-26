package com.hosein.nzd.arzup.service.httpService

import com.hosein.nzd.arzup.data.dataClass.categories.Categories
import com.hosein.nzd.arzup.data.dataClass.category.Category
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("category")
    suspend fun category(
        @Query("id") id: String,
        @Query("start") start: Int,
        @Query("limit") limit: Int,
        @Query("convert") convert: String,
    ): Category

    @GET("categories")
    suspend fun categories(
        @Query("start") start: Int,
        @Query("limit") limit: Int,
        @Query("symbol") symbol: String,
    ):Categories
}

fun createInstanceApiService(): ApiService {

    val http = OkHttpClient.Builder().addInterceptor {
        val oldRequest = it.request()
        val newRequest = oldRequest.newBuilder()
        newRequest.addHeader("X-CMC_PRO_API_KEY", "a603104f-609e-4f48-97d5-719ab2df88d0")
        newRequest.method(oldRequest.method(), oldRequest.body())
        return@addInterceptor it.proceed(newRequest.build())
    }.build()

    val retrofit = Retrofit.Builder()
        .baseUrl("https://pro-api.coinmarketcap.com/v1/cryptocurrency/")
        .addConverterFactory(GsonConverterFactory.create())
        .client(http)
        .build()

    return retrofit.create(ApiService::class.java)
}
