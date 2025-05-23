package com.project.opportunities.domain.dto.news.request;

import jakarta.validation.constraints.NotBlank;
import org.hibernate.validator.constraints.Length;

public record NewsUpdateRequestDto(
        @NotBlank
        @Length(min = 10, max = 100)
        String title,
        @NotBlank
        @Length(min = 10)
        String content
) {
}
