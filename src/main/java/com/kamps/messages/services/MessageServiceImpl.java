package com.kamps.messages.services;

import com.kamps.messages.models.Message;
import com.kamps.messages.repository.MessagesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessagesRepository messagesRepository;

    @Override
    public List<Message> getAllMessages() {
        return messagesRepository.findAll();
    }

    @Override
    public Message createMessage(Message message) {
        return messagesRepository.save(message);
    }

   /* @Override
    public Message getMessageById(Long messageId) {
        return messagesRepository.findById(messageId).orElseThrow(() -> new RuntimeException("Message not found"));
    }



    @Override
    public Message updateMessage(Long messageId, Message message) {
        Message existingMessage = messagesRepository.findById(messageId).orElseThrow(() -> new RuntimeException("Message not found"));
        existingMessage.setSenderId(message.getSenderId());
        existingMessage.setRecipientId(message.getRecipientId());
        existingMessage.setMessageText(message.getMessageText());
        existingMessage.setSentTime(message.getSentTime());
        return messagesRepository.save(existingMessage);
    }

    @Override
    public void deleteMessage(Long messageId) {
        messagesRepository.deleteById(messageId);
    }*/
}