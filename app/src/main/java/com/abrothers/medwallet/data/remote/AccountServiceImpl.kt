package com.abrothers.medwallet.data.remote

import com.abrothers.medwallet.data.remote.dto.Account
import com.abrothers.medwallet.data.remote.dto.MedInfo
import com.abrothers.medwallet.data.remote.dto.SubAccount
import io.ktor.client.HttpClient
import io.ktor.client.plugins.RedirectResponseException

class AccountServiceImpl(private val client: HttpClient) : AccountService {

    override suspend fun getUserInfo(): Account? {
        return  try {
            /**client.get {
                url("")
            }*/
            Account(
                "Rafael",
                1,
                listOf(
                    SubAccount("Micaela", 0, ""),
                    SubAccount("Marco", 1, ""),

                    )
            )
        } catch (e: RedirectResponseException) {
            null
        }
    }

    override suspend fun getProfileMeds(profileId: String): List<MedInfo>? {
       // TODO: ("Not yet implemented")

        return try {
            listOf(MedInfo("1","Paracetamol", "20-10-2030"))
        } catch (e: RedirectResponseException) {
            null
        }

    }
}