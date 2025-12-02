package com.ahmedworkspace.casahub.listing.application.dto;

import com.ahmedworkspace.casahub.listing.application.dto.sub.PictureDTO;
import com.ahmedworkspace.casahub.listing.application.dto.vo.PriceVO;
import com.ahmedworkspace.casahub.listing.domain.BookingCategory;

import java.util.UUID;

public record DisplayCardListingDTO(PriceVO price,
                                    String location,
                                    PictureDTO cover,
                                    BookingCategory bookingCategory,
                                    UUID publicId) {
}
