package com.abrothers.medwallet.di
import com.abrothers.medwallet.data.remote.AccountService
import org.koin.dsl.module

val AppModule = module {
    //single { HttpClient() }
    single { AccountService.create() }
}