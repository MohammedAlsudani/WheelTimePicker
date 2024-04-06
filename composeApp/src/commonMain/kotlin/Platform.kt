interface Platform {
    val name: String
    val randomUUID : String
}

expect fun getPlatform(): Platform
