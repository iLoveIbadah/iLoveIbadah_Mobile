package com.programir.iloveibadah

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform