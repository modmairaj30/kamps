package com.kamps.campSchedule.models;



import com.kamps.camps.models.Camp;
import com.kamps.users.models.Users;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name = "camp_schedule")
public class CampSchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer scheduleId;

    /*@Column(nullable = false)
    private Integer campId;*/

    @ManyToOne
    @JoinColumn(name = "campId", nullable = false)
    private Camp camp;

    @Column(nullable = false)
    private LocalDate startDate;

    @Column(nullable = false)
    private LocalDate endDate;

    private Integer capacity;
}

