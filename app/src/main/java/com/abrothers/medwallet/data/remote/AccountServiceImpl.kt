package com.abrothers.medwallet.data.remote

import com.abrothers.medwallet.data.remote.dto.UserResponse
import io.ktor.client.*
import io.ktor.client.features.*
import io.ktor.client.request.*

class AccountServiceImpl(private val client: HttpClient) : AccountService {

    override suspend fun getUserInfo(): UserResponse? {
        return try {
            client.get {
                url("")
            }
        } catch (e: RedirectResponseException) {
            null
        }
    }
}