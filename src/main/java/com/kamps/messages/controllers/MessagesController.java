package com.kamps.messages.controllers;


import com.kamps.messages.models.Message;
import com.kamps.messages.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/messages")
public class MessagesController {

    @Autowired
    private MessageService messageService;

    @GetMapping
    public List<Message> getAllMessages() {
        return messageService.getAllMessages();
    }

    @PostMapping
    public Message createMessage(@RequestBody Message message) {
        return messageService.createMessage(message);
    }

   /* @GetMapping("/{messageId}")
    public Message getMessageById(@PathVariable Long messageId) {
        return messageService.getMessageById(messageId);
    }



    @PutMapping("/{messageId}")
    public Message updateMessage(@PathVariable Long messageId, @RequestBody Message message) {
        return messageService.updateMessage(messageId, message);
    }

    @DeleteMapping("/{messageId}")
    public void deleteMessage(@PathVariable Long messageId) {
        messageService.deleteMessage(messageId);
    }*/
}