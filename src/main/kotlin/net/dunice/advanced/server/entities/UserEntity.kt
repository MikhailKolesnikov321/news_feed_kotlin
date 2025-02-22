package net.dunice.advanced.server.entities

import jakarta.persistence.*
import java.util.UUID

@Table(name = "users")
@Entity
data class UserEntity(
    @Id
    @GeneratedValue(generator = "UUID")
    @Column(name = "user_id", nullable = false)
    var id: UUID? = null,

    @Column(nullable = false, name = "name")
    var name: String,
    @Column(nullable = false, name = "email")
    var email: String,
    @Column(name = "avatar")
    var avatar: String,
    @Column(nullable = false, name = "password")
    var password: String,
    @Column(name = "role")
    var role: String,

    @OneToMany(mappedBy = "user", cascade = [CascadeType.ALL])
    var news: MutableList<NewsEntity> = mutableListOf()
)