package net.dunice.advanced.server.controllers.dto

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class PageableResponse<T>(
    var data: T,
    var count: Int
) {

    companion object {
        fun <T> ok(data: T, count: Int) = PageableResponse(
            data = data,
            count = count
        )
    }
}