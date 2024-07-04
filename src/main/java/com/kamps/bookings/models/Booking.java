package com.kamps.bookings.models;



import com.kamps.camps.models.Camp;
import com.kamps.users.models.Users;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "bookings")
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer bookingId;

    @ManyToOne
    @JoinColumn(name = "campId", nullable = false)
    private Camp camp;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private Users users;

   /* @Column(nullable = false)
    private Integer userId;

    @Column(nullable = false)
    private Integer campId;*/

    @Column(nullable = false)
    private LocalDateTime bookingDate;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @Column(nullable = false)
    private LocalDateTime createdAt;

    public enum Status {
        RESERVED, PAID, CANCELLED
    }
}

