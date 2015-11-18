package no.lagos.boast.Rest

import retrofit.http.GET

/**
 * Created by Johannes D. Lagos $today
 */
 interface RestAPI {
    @GET("1/Login")
    fun login(username: String, password: String)
}