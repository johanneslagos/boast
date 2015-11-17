package no.lagos.boast.Models

/**
 * Created by Johannes D. Lagos $today
 */
data class User(val userId: Long = 0,
                val firstName: String,
                val lastName: String? = null,
                val address: Address? = null,
                val bikes: List<Bike>? = null)


