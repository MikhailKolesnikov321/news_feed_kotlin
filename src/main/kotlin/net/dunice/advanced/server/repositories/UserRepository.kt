package net.dunice.advanced.server.repositories

import net.dunice.advanced.server.entities.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepository : JpaRepository<UserEntity, UUID> {

    @Query("")
    override fun findById(id: UUID): Optional<UserEntity>
}