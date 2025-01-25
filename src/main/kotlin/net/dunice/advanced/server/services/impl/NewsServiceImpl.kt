package net.dunice.advanced.server.services.impl

import net.dunice.advanced.server.controllers.dto.NewsRequest
import net.dunice.advanced.server.services.NewsService
import org.springframework.stereotype.Service
import java.util.*

@Service
class NewsServiceImpl : NewsService {
    override fun createNews(newsRequest: NewsRequest): UUID {
        return UUID.randomUUID()
    }
}