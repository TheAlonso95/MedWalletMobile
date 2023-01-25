package com.abrothers.medwallet.models
import kotlinx.serialization.Serializable

@Serializable
data class Account(val id: String, val name: String, val imageUrl: String)
