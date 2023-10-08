package com.abrothers.medwallet.data.remote.dto
import kotlinx.serialization.Serializable

@Serializable
data class MedInfo(
    val id: String = "",
    val name: String = "",
    val expirationDate: String = "",
    val imageUrl: String? = "",
)
