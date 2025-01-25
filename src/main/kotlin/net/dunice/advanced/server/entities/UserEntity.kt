package net.dunice.advanced.server.entities

import jakarta.persistence.*
import java.util.UUID

@Table(name = "users")
@Entity
data class UserEntity(
    @Id
    @GeneratedValue(generator = "UUID")
    private var id: UUID? = null,

    @Column(nullable = false)
    private var name: String,
    @Column(nullable = false)
    private var email: String,
    private var avatar: String,
    @Column(nullable = false)
    private var password: String,
    private var role: String,

    @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL])
    private var news: MutableList<NewsEntity> = mutableListOf()
)