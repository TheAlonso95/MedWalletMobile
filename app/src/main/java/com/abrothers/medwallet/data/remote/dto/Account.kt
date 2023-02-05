package com.abrothers.medwallet.data.remote.dto
import kotlinx.serialization.Serializable

@Serializable
data class Account(
    val name: String = "",
    val userId: Int = 0,
    val accounts: List<Account> = emptyList(),
    val imageUrl: String = ""
)
