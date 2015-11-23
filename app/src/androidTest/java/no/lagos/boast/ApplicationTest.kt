package no.lagos.boast

import android.app.Application
import android.test.ApplicationTestCase
import android.util.Log
import no.lagos.boast.Models.User
import no.lagos.boast.Rest.RestAPI
import retrofit.*

/**
 * [Testing Fundamentals](http://d.android.com/tools/testing/testing_android.html)
 */
class ApplicationTest : ApplicationTestCase<Application>(Application::class.java) {

    var service: RestAPI? = null

    protected override fun setUp(){
         var retrofit = Retrofit.Builder()
                 .baseUrl("https://api.parse.com/1/")
                 .addConverterFactory(GsonConverterFactory.create())
                 .build()
          service = retrofit.create(RestAPI::class.java)
    }

    fun testCapital() {
        assertEquals("Hello world!", "hello world!".capitalize())
    }


    fun testLogin() {

        val call : Call<User> = service!!.login("johanneslagos@gmail.com", "1")
        call.enqueue(object: Callback<User>{
            override fun onResponse(response: Response<User>?, retrofit: Retrofit?) {

                Log.d("TEST", "Response from server $response")

                assertNotNull(response)
            }

            override fun onFailure(t: Throwable?) {
                throw UnsupportedOperationException()
            }

        })

    }


}