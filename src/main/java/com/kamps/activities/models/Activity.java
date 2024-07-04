package com.kamps.activities.models;


import com.kamps.camps.models.Camp;
import com.kamps.providerProfiles.models.ProviderProfile;
import com.kamps.users.models.Users;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;

@Entity
@Data
@Table(name = "activities")
public class Activity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer activityId;

    private Integer providerId;

    @ManyToOne
    @JoinColumn(name = "campId", nullable = false)
    private Camp camp;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private Users users;


    //private Integer campId;



    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String ageGroup;

    @Column(nullable = false)
    private String location;

    @Column(nullable = false, precision = 10, scale = 2)
    private BigDecimal pricePerWeek;





}