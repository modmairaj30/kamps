
package com.kamps.providerProfiles.models;


import com.kamps.users.models.Users;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "provider_profiles")
public class ProviderProfile {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer providerId;



    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private Users users;

    @Column(nullable = false)
    private String provideEmail;

    private String profilePictureUrl;
}

