package com.kamps.analytics.models;


import com.kamps.camps.models.Camp;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "Analytics")
public class Analytics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "RecordID")
    private Long recordID;

    @ManyToOne
    @JoinColumn(name = "campId", nullable = false)
    private Camp camp;

    @Column(name = "Metric", nullable = false)
    private String metric;

    @Column(name = "Value", nullable = false)
    private Integer value;

    @Column(name = "RecordDate", nullable = false)
    private LocalDateTime recordDate;


}
