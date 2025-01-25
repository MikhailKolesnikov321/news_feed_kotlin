package net.dunice.advanced.server.services.impl

import net.dunice.advanced.server.entities.UserEntity
import net.dunice.advanced.server.repositories.UserRepository
import net.dunice.advanced.server.services.UserService
import org.springframework.boot.context.event.ApplicationReadyEvent
import org.springframework.context.event.EventListener
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(private val userRepository: UserRepository) : UserService {
    override fun getCurrentUser(): UserEntity = userRepository.findByUsername("admin").get()

    @EventListener(ApplicationReadyEvent::class)
    override fun createDefaultUserIfNotExists() {
        val defaultUsername = "admin"
        if (userRepository.findByUsername(defaultUsername).isEmpty) {
            val defaultUser = UserEntity(
                name = defaultUsername,
                email = "admin@example.com",
                password = "admin",
                avatar = "avatar",
                role = "role",
            )
            userRepository.save(defaultUser)
            println("Дефолтный пользователь создан: $defaultUser")
        } else {
            println("Дефолтный пользователь уже существует.")
        }
    }
}