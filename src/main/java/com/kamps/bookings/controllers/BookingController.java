package com.kamps.bookings.controllers;



import com.kamps.bookings.models.Booking;
import com.kamps.bookings.services.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookings")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping
    public List<Booking> getAllBookings() {
        return bookingService.getAllBookings();
    }


    @PostMapping("/createBookings")
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }
   /* @GetMapping("/{id}")
    public Booking getBookingById(@PathVariable Integer id) {
        return bookingService.getBookingById(id);
    }


    @PutMapping("/{id}")
    public Booking updateBooking(@PathVariable Integer id, @RequestBody Booking booking) {
        booking.setBookingId(id);
        return bookingService.createOrUpdateBooking(booking);
    }

    @DeleteMapping("/{id}")
    public void deleteBooking(@PathVariable Integer id) {
        bookingService.deleteBooking(id);
    }*/
}

