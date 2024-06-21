package com.kamps.campActivities.models;



import com.kamps.activities.models.Activity;
import com.kamps.camps.models.Camp;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "camp_activities")
public class CampActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer campActivityId;

    @ManyToOne
    @JoinColumn(name = "campId", nullable = false)
    private Camp camp;


    @ManyToOne
    @JoinColumn(name = "activityId", nullable = false)
    private Activity activity;


    /*@Column(nullable = false)
    private Integer campId;

    @Column(nullable = false)
    private Integer activityId;*/
}

