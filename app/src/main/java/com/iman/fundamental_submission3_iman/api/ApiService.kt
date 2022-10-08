package com.iman.fundamental_submission3_iman.api

import com.iman.fundamental_submission3_iman.model.DetailuserModel
import com.iman.fundamental_submission3_iman.model.User
import com.iman.fundamental_submission3_iman.model.UserModel
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("search/users")
    @Headers("Authorization: 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")
    fun getUser(
        @Query("q") query: String
    ): Call<UserModel>


    @GET("users/{username}")
    @Headers("Authorization: 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")
    fun getUserDetail(
        @Path("username") username: String
    ): Call<DetailuserModel>


    @GET("users/{username}/followers")
    @Headers("Authorization: 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")
    fun getUserFollowers(
        @Path("username") username: String
    ): Call<ArrayList<User>>


    @GET("users/{username}/following")
    @Headers("Authorization: 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")
    fun getUserFollowing(
        @Path("username") username: String
    ): Call<ArrayList<User>>

}