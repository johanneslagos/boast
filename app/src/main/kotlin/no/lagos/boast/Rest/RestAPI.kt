package no.lagos.boast.Rest

import no.lagos.boast.Models.User
import retrofit.Call
import retrofit.http.*

/**
 * Created by Johannes D. Lagos $today
 */
interface RestAPI {

    @Headers(
            "X-Parse-Application-Id: dd6gnQ00Zav09LpwoLnMNRVHHBR7DgaBHBFepIcu",
            "X-Parse-REST-API-Key: Fnx8qKrNeUCIludGzyzFfZ8D2WTHZ3NMVfRY3Ksi",
            "X-Parse-Revocable-Session: 1"
    )
    @GET("Login")
    fun login(@Query("username",encoded = true) username: String,
              @Query("password", encoded = true) password: String):Call<User>
}