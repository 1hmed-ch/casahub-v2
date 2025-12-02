package com.ahmedworkspace.casahub.listing.application.dto;

import com.ahmedworkspace.casahub.listing.application.dto.vo.PriceVO;

import java.util.UUID;

public record ListingCreateBookingDTO(
        UUID listingPublicId, PriceVO price) {
}
