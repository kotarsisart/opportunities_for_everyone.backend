package com.project.opportunities.domain.dto.news.request;

import com.project.opportunities.validation.image.ValidImage;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import org.hibernate.validator.constraints.Length;
import org.springframework.web.multipart.MultipartFile;

public record NewsCreateRequestDto(
        @NotBlank
        @Length(min = 10, max = 100)
        String title,
        @NotBlank
        @Length(min = 10)
        String content,
        @NotNull
        @ValidImage
        MultipartFile coverImage) {
}
