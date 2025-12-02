package com.ahmedworkspace.casahub.booking.mapper;

import com.ahmedworkspace.casahub.booking.application.dto.BookedDateDTO;
import com.ahmedworkspace.casahub.booking.application.dto.NewBookingDTO;
import com.ahmedworkspace.casahub.booking.domain.Booking;
import java.time.OffsetDateTime;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-02T17:34:40+0100",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.8 (Oracle Corporation)"
)
@Component
public class BookingMapperImpl implements BookingMapper {

    @Override
    public Booking newBookingToBooking(NewBookingDTO newBookingDTO) {
        if ( newBookingDTO == null ) {
            return null;
        }

        Booking booking = new Booking();

        booking.setStartDate( newBookingDTO.startDate() );
        booking.setEndDate( newBookingDTO.endDate() );

        return booking;
    }

    @Override
    public BookedDateDTO bookingToCheckAvailability(Booking booking) {
        if ( booking == null ) {
            return null;
        }

        OffsetDateTime startDate = null;
        OffsetDateTime endDate = null;

        startDate = booking.getStartDate();
        endDate = booking.getEndDate();

        BookedDateDTO bookedDateDTO = new BookedDateDTO( startDate, endDate );

        return bookedDateDTO;
    }
}
