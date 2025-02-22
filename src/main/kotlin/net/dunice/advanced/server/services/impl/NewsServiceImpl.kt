package net.dunice.advanced.server.services.impl

import net.dunice.advanced.server.controllers.dto.GetNewsResponse
import net.dunice.advanced.server.controllers.dto.NewsRequest
import net.dunice.advanced.server.controllers.dto.PageableResponse
import net.dunice.advanced.server.mappers.NewsMapper
import net.dunice.advanced.server.repositories.NewsRepository
import net.dunice.advanced.server.repositories.UserRepository
import net.dunice.advanced.server.services.NewsService
import org.springframework.data.domain.PageRequest
import org.springframework.stereotype.Service
import java.util.*

@Service
class NewsServiceImpl(
    private val userRepo: UserRepository,
    private val newsRepo: NewsRepository,
    private val newsMapper: NewsMapper
) : NewsService {
    override fun createNews(newsRequest: NewsRequest, userId: UUID): UUID {
        val user = userRepo.findByUsername("admin").get()
        val newsEntity = newsMapper.toNewsEntity(newsRequest)
        newsEntity.user = user
        val saved = newsRepo.save(newsEntity)
        return saved.id!!
    }

    override fun getNews(page: Int, perPage: Int): PageableResponse<*> {
        val newsPage = newsRepo.findAll(PageRequest.of(page - 1, perPage))
        val response = GetNewsResponse(
            newsPage.content.map {
                newsMapper.toResponse(it)
            }
        )
        return PageableResponse.ok(response, newsPage.numberOfElements)
    }
}