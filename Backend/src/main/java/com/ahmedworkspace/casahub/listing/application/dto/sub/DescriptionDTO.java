package com.ahmedworkspace.casahub.listing.application.dto.sub;

import com.ahmedworkspace.casahub.listing.application.dto.vo.DescriptionVO;
import com.ahmedworkspace.casahub.listing.application.dto.vo.TitleVO;
import jakarta.validation.constraints.NotNull;

public record DescriptionDTO(
        @NotNull TitleVO title,
        @NotNull DescriptionVO description
        ) {
}
