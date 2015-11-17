package no.lagos.boast.Models

/**
 * Created by Johannes D. Lagos $today
 */

data class Address (val street: String,
                    val streetNumber: Int?,
                    val city: String,
                    val zipCode: String,
                    val country: String)