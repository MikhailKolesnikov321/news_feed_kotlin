package net.dunice.advanced.server.entities

import jakarta.persistence.*
import java.util.UUID

@Table(name = "news")
@Entity
data class NewsEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private var id: UUID,

    private var image: String,
    @Column(nullable = false)
    private var title: String,
    private var description: String,

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    private var user: UserEntity
)