package com.abrothers.medwallet.data.remote

import com.abrothers.medwallet.data.remote.dto.Account
import io.ktor.client.*
import io.ktor.client.plugins.*

class AccountServiceImpl(private val client: HttpClient) : AccountService {

    override suspend fun getUserInfo(): Account? {
        return try {
            /**client.get {
                url("")
            }*/
            Account("Test", 1, emptyList())
        } catch (e: RedirectResponseException) {
            null
        }
    }
}