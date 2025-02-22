package net.dunice.advanced.server.mappers

import net.dunice.advanced.server.controllers.dto.GetNewsResponseItem
import net.dunice.advanced.server.controllers.dto.NewsRequest
import net.dunice.advanced.server.entities.NewsEntity
import org.mapstruct.Mapper
import org.mapstruct.Mapping
import org.mapstruct.MappingConstants

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
interface NewsMapper {

    @Mapping(target = "id", ignore = true)
    // @Mapping(target = "tags", ignore = true)
    @Mapping(target = "user", ignore = true)
    fun toNewsEntity(newsRequest: NewsRequest): NewsEntity

    @Mapping(target = "userId", source = "user.id")
    @Mapping(target = "userName", source = "user.name")
    fun toResponse(newsEntity: NewsEntity): GetNewsResponseItem
}