package net.dunice.advanced.server.repositories

import net.dunice.advanced.server.entities.NewsEntity
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository
import java.util.UUID

@Repository
interface NewsRepository : JpaRepository<NewsEntity, UUID> {
}