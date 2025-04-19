package com.programir.iloveibadah

import io.ktor.client.*
import io.ktor.client.request.*
import io.ktor.client.statement.*

class Greeting {
    private val platform = getPlatform()

    fun greet(): String {
        return "Hello, ${platform.name}!"
    }

//KTOR Exemple
//    private val client = HttpClient()
//
//    suspend fun greet(): String {
//        val response = client.get("https://ktor.io/docs/")
//        return response.bodyAsText()
//    }
}