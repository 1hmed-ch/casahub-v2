package com.ahmedworkspace.casahub.booking.mapper;

import com.ahmedworkspace.casahub.booking.application.dto.BookedDateDTO;
import com.ahmedworkspace.casahub.booking.application.dto.NewBookingDTO;
import com.ahmedworkspace.casahub.booking.domain.Booking;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface BookingMapper {

    Booking newBookingToBooking(NewBookingDTO newBookingDTO);

    BookedDateDTO bookingToCheckAvailability(Booking booking);
}
