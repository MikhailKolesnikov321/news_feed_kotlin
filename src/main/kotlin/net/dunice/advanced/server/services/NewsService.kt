package net.dunice.advanced.server.services

import net.dunice.advanced.server.controllers.dto.NewsRequest
import net.dunice.advanced.server.controllers.dto.PageableResponse
import java.util.UUID

interface NewsService {
    fun createNews(newsRequest: NewsRequest, userId: UUID): UUID

    fun getNews(page: Int, perPage: Int): PageableResponse<*>
}