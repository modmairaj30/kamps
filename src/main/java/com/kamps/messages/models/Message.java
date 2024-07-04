package com.kamps.messages.models;

// Messages.java
import com.kamps.users.models.Users;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;


@Entity
@Data
public class Message {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long messageId;

    private Long senderId;

    @ManyToOne
    @JoinColumn(name = "userId", nullable = false)
    private Users users;


    private Long recipientId;
    private String messageText;
    private Date sentTime;


}