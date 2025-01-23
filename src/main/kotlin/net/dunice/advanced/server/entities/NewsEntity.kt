package net.dunice.advanced.server.entities

import jakarta.persistence.*
import java.util.UUID

@Table(name = "news")
@Entity
class NewsEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    var id: UUID = UUID.randomUUID()
    var image: String = ""
    var title: String = ""
    var description: String = ""
}