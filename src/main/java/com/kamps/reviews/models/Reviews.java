package com.kamps.reviews.models;


import com.kamps.camps.models.Camp;

import com.kamps.users.models.Users;
import jakarta.persistence.*;
import lombok.Data;


import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "Reviews")
public class Reviews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ReviewID")
    private Long reviewID;

    @ManyToOne
    @JoinColumn(name = "campId", nullable = false)
    private Camp camp;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private Users users;

    @Column(name = "Rating", nullable = false)
    private Integer rating;

    @Column(name = "Comment")
    private String comment;

    @Column(name = "ReviewDate", nullable = false)
    private LocalDateTime reviewDate;



}
