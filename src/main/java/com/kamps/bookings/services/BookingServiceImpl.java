package com.kamps.bookings.services;



import com.kamps.bookings.models.Booking;

import com.kamps.bookings.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public Booking createBooking(Booking booking) {
        return bookingRepository.save(booking);
    }


   /* @Override
    public Booking getBookingById(Integer id) {
        return bookingRepository.findById(id).orElse(null);
    }



    @Override
    public void deleteBooking(Integer id) {
        bookingRepository.deleteById(id);
    }*/
}

