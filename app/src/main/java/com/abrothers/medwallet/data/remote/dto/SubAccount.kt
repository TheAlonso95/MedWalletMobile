package com.abrothers.medwallet.data.remote.dto

import kotlinx.serialization.Serializable

@Serializable
data class SubAccount(
    val name: String = "",
    val subAccountId: Int = 0,
    val imageUrl: String = ""
)
