package net.dunice.advanced.server.services

import net.dunice.advanced.server.entities.UserEntity
import java.util.UUID

interface UserService {
    fun getCurrentUser(): UserEntity

    fun createDefaultUserIfNotExists()
}