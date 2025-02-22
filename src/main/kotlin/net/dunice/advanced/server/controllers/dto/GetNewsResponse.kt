package net.dunice.advanced.server.controllers.dto

import java.util.*

data class GetNewsResponse(
    val news: List<GetNewsResponseItem>
)

data class GetNewsResponseItem(
    val id: UUID,
    val description: String,
    val image: String,
    val title: String,
    val userId: UUID,
    val userName: String
)