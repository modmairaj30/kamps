package com.kamps.bookings.services;



import com.kamps.bookings.models.Booking;

import java.util.List;

public interface BookingService {
    List<Booking> getAllBookings();
  // Booking getBookingById(Integer id);
    Booking createBooking(Booking booking);
   // void deleteBooking(Integer id);*/
}

