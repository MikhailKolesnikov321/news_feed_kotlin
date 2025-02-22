package net.dunice.advanced.server.controllers.dto

data class BaseSuccessResponse<T>(
    var data: T,
    var statusCode: Int = 0,
    var success: Boolean = true,
) {
    companion object {
        fun <T> ok(data: T) = BaseSuccessResponse(
            data = data,
            statusCode = 0,
            success = true
        )
    }
}