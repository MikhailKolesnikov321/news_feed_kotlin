package net.dunice.advanced.server.controllers.dto

data class CreateNewsSuccessResponse<T>(
    var data: T,
    var statusCode: Int = 0,
    var success: Boolean = true,
) {
    companion object {
        fun <T> ok(data: T) = CreateNewsSuccessResponse(
            data = data,
            statusCode = 0,
            success = true
        )
    }
}