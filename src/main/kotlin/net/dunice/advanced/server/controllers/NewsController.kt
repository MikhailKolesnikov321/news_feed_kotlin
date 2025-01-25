package net.dunice.advanced.server.controllers

import jakarta.validation.Valid
import net.dunice.advanced.server.controllers.dto.CreateNewsSuccessResponse
import net.dunice.advanced.server.controllers.dto.NewsRequest
import net.dunice.advanced.server.services.NewsService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/v1/news")
@Validated
class NewsController(private val newsService: NewsService) {

    @PostMapping("/create")
    fun createNews(@Valid @RequestBody newsRequest: NewsRequest): ResponseEntity<*> {
        val response = CreateNewsSuccessResponse.ok(newsService.createNews(newsRequest))
        return ResponseEntity(response, HttpStatus.OK)
    }
}