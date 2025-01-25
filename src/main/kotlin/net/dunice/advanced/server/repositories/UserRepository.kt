package net.dunice.advanced.server.repositories

import net.dunice.advanced.server.entities.UserEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.*

@Repository
interface UserRepository : JpaRepository<UserEntity, UUID> {

    @Query("SELECT u FROM UserEntity u WHERE u.id = :id")
    override fun findById(id: UUID): Optional<UserEntity>

    @Query("SELECT u FROM UserEntity u WHERE u.name = :name")
    fun findByUsername(@Param("name")username: String): Optional<UserEntity>
}