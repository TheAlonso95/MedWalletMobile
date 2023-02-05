package com.abrothers.medwallet.di
import com.abrothers.medwallet.data.remote.AccountService
import com.abrothers.medwallet.data.remote.AccountServiceImpl
import io.ktor.client.*
import org.koin.dsl.module

val KoinModule = module {
    single { HttpClient() }
    single<AccountService> { AccountServiceImpl(get()) }
}