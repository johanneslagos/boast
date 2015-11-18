package no.lagos.boast.Models

import java.util.*

/**
 * Created by Johannes D. Lagos $today
 */
data class Bike(val bikeId: String,
                val name: String,
                val brand: String?,
                val model: String,
                val productionYear: String?,
                val frameId: String? = null,
                val acquisitionDate: Date?,
                val likes: Long,
                val nickName: String,
                val bikeType: BIKE_TYPE?,
                val owner: User,
                val images: List<String>)

