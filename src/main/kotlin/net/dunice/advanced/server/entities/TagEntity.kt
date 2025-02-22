package net.dunice.advanced.server.entities

import jakarta.persistence.*
import java.util.*

@Entity
@Table(name = "tags")
data class TagEntity(
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "tag_id")
    private var id: UUID? = null,
    @Column(name = "title")
    private var title: String,

//    @ManyToOne(cascade = [CascadeType.ALL], fetch = FetchType.EAGER)
//    @JoinColumn(name = "news_id", nullable = false)
//    private var news: NewsEntity
)