package net.dunice.advanced.server.controllers

import jakarta.validation.Valid
import net.dunice.advanced.server.controllers.dto.BaseSuccessResponse
import net.dunice.advanced.server.controllers.dto.NewsRequest
import net.dunice.advanced.server.services.NewsService

import org.springframework.http.ResponseEntity
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/v1/news")
@Validated
class NewsController(private val newsService: NewsService) {

    @PostMapping("/create")
    fun createNews(@Valid @RequestBody newsRequest: NewsRequest): ResponseEntity<*> {
        return ResponseEntity.ok(BaseSuccessResponse.ok(newsService.createNews(newsRequest, UUID.randomUUID())))
    }

    @GetMapping
    fun getNews(@RequestParam page: Int, @RequestParam perPage: Int): ResponseEntity<*> {
        return ResponseEntity.ok(BaseSuccessResponse.ok(newsService.getNews(page, perPage)))
    }
}