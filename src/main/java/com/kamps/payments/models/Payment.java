package com.kamps.payments.models;



import com.kamps.activities.models.Activity;
import com.kamps.bookings.models.Booking;
import com.kamps.users.models.Users;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "payments")
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer paymentId;

   @OneToOne
    @JoinColumn(name = "bookingId", nullable = false)
    private Booking booking;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private Users users;


    /*@Column(nullable = false)
    private Integer bookingId;*/

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal amount;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @Column(nullable = false)
    private LocalDateTime paymentDate;

    @Column(nullable = false)
    private Integer providerId;

    public enum Status {
        PENDING, COMPLETED, REFUNDED
    }
}

