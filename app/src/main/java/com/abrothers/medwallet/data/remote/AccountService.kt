package com.abrothers.medwallet.data.remote

import com.abrothers.medwallet.data.remote.dto.UserResponse

interface AccountService {

    suspend fun getUserInfo(): UserResponse?
}