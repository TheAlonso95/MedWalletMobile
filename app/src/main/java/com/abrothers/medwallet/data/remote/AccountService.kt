package com.abrothers.medwallet.data.remote

import com.abrothers.medwallet.data.remote.dto.Account
import io.ktor.client.*
import io.ktor.client.engine.android.*
import io.ktor.client.plugins.contentnegotiation.*
import io.ktor.client.plugins.logging.*
import io.ktor.serialization.kotlinx.json.*

interface AccountService {
    suspend fun getUserInfo(): Account?

    companion object {
        fun create(): AccountService {
            return AccountServiceImpl(
                client = HttpClient(Android) {
                    install(Logging) {
                        level = LogLevel.ALL
                    }
                    install(ContentNegotiation) {
                        json()
                    }
                }
            )
        }
    }
}