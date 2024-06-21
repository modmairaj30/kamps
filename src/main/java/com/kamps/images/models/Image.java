package com.kamps.images.models;


import jakarta.persistence.*;
import lombok.Data;

/*@Entity
@Data
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imageId;

    private Long entityId;
    private String imageUrl;
    private String description;
    private EntityType entityType;


    // Enum for EntityType
    public enum EntityType {
        CAMP, ACTIVITY

    }

}*/
@Entity
@Data
public class Image {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long imageId;

    @Column(nullable = false)
    private Long entityId;

    @Column(nullable = false)
    private String imageUrl;

    private String description;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private EntityType entityType;

    // Enum for EntityType
    public enum EntityType {
        CAMP, ACTIVITY
    }
}

