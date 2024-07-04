package com.kamps.messages.services;


import com.kamps.messages.models.Message;

import java.util.List;

public interface MessageService {
    List<Message> getAllMessages();
   // Message getMessageById(Long messageId);
    Message createMessage(Message message);
   // Message updateMessage(Long messageId, Message message);
   // void deleteMessage(Long messageId);
}
