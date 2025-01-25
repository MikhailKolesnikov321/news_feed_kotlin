package net.dunice.advanced.server.repositories

import net.dunice.advanced.server.entities.NewsEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.Query
import org.springframework.data.repository.query.Param
import org.springframework.stereotype.Repository
import java.util.Optional
import java.util.UUID

@Repository
interface NewsRepository : JpaRepository<NewsEntity, UUID> {

    @Query
    override fun findById(@Param("id") id: UUID): Optional<NewsEntity>
}