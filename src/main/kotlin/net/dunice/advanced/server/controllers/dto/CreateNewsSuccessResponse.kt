package net.dunice.advanced.server.controllers.dto

data class CreateNewsSuccessResponse(
    private var data: Any,
    private var statusCode: Int = 0,
    private var success: Boolean = true,
) {
    companion object {
        fun ok(data: Any) = CreateNewsSuccessResponse(
            data = data,
            statusCode = 0,
            success = true
        )
    }
}