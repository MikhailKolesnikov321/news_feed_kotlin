package net.dunice.advanced.server.controllers.dto

import jakarta.validation.constraints.NotBlank
import net.dunice.advanced.server.validations.ValidationConstants.Companion.NEWS_DESCRIPTION_HAS_TO_BE_PRESENT
import net.dunice.advanced.server.validations.ValidationConstants.Companion.NEWS_IMAGE_HAS_TO_BE_PRESENT
import net.dunice.advanced.server.validations.ValidationConstants.Companion.NEWS_IMAGE_LENGTH_NOT_VALID
import net.dunice.advanced.server.validations.ValidationConstants.Companion.NEWS_TITLE_NOT_NULL
import net.dunice.advanced.server.validations.ValidationConstants.Companion.NEWS_TITLE_SIZE_NOT_VALID
import org.hibernate.validator.constraints.Length

data class NewsRequest(
    @NotBlank(message = NEWS_IMAGE_HAS_TO_BE_PRESENT)
    @Length(min = 3, max = 130, message = NEWS_IMAGE_LENGTH_NOT_VALID)
    var image: String,
    @NotBlank(message = NEWS_DESCRIPTION_HAS_TO_BE_PRESENT)
    @Length(min = 3, max = 160, message = NEWS_DESCRIPTION_HAS_TO_BE_PRESENT)
    var description: String,
    @NotBlank(message = NEWS_TITLE_NOT_NULL)
    @Length(min = 3, max = 160, message = NEWS_TITLE_SIZE_NOT_VALID)
    var title: String
)