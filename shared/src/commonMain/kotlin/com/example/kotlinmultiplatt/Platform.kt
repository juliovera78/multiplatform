package com.example.kotlinmultiplatt

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform