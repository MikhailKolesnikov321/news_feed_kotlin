package net.dunice.advanced.server.services

import net.dunice.advanced.server.controllers.dto.NewsRequest
import java.util.UUID

interface NewsService {
    fun createNews(newsRequest: NewsRequest, userId: UUID): UUID
}