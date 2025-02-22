package net.dunice.advanced.server.entities

import jakarta.persistence.*
import java.util.UUID

@Table(name = "news")
@Entity
data class NewsEntity (
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "news_id")
    var id: UUID? = null,

    @Column(name = "image")
    var image: String,
    @Column(nullable = false, name = "title")
    var title: String,
    @Column(name = "description")
    var description: String,

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id", nullable = false)
    var user: UserEntity? = null,

//    @OneToMany(mappedBy = "news", cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
//    var tags: MutableList<TagEntity>? = null
)