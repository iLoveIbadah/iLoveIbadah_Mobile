package com.programir.iloveibadah.data.repository

import com.programir.iloveibadah.api.httpClient
import com.programir.iloveibadah.domain.model.LoginRequest
import com.programir.iloveibadah.domain.model.LoginResponse
import com.programir.iloveibadah.domain.model.RegisterRequest
import com.programir.iloveibadah.domain.models.UserAccount
import com.programir.iloveibadah.domain.remoteSource.IUserAccountRemoteSource
import io.ktor.client.HttpClient
import io.ktor.client.call.body
import io.ktor.client.request.get
import io.ktor.client.request.headers
import io.ktor.client.request.post
import io.ktor.client.request.setBody
import io.ktor.http.ContentType
import io.ktor.http.HttpHeaders
import io.ktor.http.contentType

class UserAccountRepository (private val httpClient: HttpClient) : IUserAccountRemoteSource {

    override suspend fun login(request: LoginRequest): LoginResponse {
        return httpClient.post("https://ibadahlover.azurewebsites.net/api/useraccounts/login") {
            contentType(ContentType.Application.Json)
            setBody(request)
        }.body()
    }

    override suspend fun register(request: RegisterRequest) {
        return httpClient.post("https://ibadahlover.azurewebsites.net/api/useraccounts/register") {
            contentType(ContentType.Application.Json)
            setBody(request)
        }.body()
    }

    override suspend fun getById(token: String): UserAccount {
        return httpClient.get("https://ibadahlover.azurewebsites.net/api/useraccounts/me") {
            headers {
                append(HttpHeaders.Authorization, "Bearer $token")
            }
        }.body()
//        val response = httpClient.get("https://ibadahlover.azurewebsites.net/api/useraccounts/getById")
//        return response.body()
    }

    override suspend fun getAll(token: String): List<UserAccount> {
        return httpClient.get("https://ibadahlover.azurewebsites.net/api/useraccounts/getAll") {
            headers {
                append(HttpHeaders.Authorization, "Bearer $token")
            }
        }.body()
    }
}