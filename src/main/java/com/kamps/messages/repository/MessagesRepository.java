package com.kamps.messages.repository;

import com.kamps.messages.models.Message;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MessagesRepository extends JpaRepository<Message, Long> {
}
