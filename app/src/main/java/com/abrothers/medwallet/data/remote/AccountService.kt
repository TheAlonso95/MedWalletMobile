package com.abrothers.medwallet.data.remote

import com.abrothers.medwallet.data.remote.dto.Account

interface AccountService {
    suspend fun getUserInfo(): Account?

}