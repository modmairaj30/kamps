package com.kamps.activitySchedule.models;


import com.kamps.activities.models.Activity;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalTime;


@Entity
@Data
@Table(name = "activity_Schedule")
public class ActivitySchedule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer scheduleId;


    @ManyToOne
    @JoinColumn(name = "activityId", nullable = false)
    private Activity activity;


    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Day day;


    @Column(nullable = false)
    private java.time.LocalTime startTime;

    @Column(nullable = false)
    private java.time.LocalTime endTime;

    public enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY
    }


}

