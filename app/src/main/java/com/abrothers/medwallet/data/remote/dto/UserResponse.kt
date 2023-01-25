package com.abrothers.medwallet.data.remote.dto
import com.abrothers.medwallet.models.Account
import kotlinx.serialization.Serializable

@Serializable
data class UserResponse(
    val name: String,
    val userId: Int,
    val accounts: List<Account>
)
