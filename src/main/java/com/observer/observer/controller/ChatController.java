package com.observer.observer.controller;

import com.observer.observer.model.Chat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ChatController {

    Chat chat;
    public ChatController(Chat chat) {
        this.chat = chat;
    }



    @RequestMapping("/sendmessage/{message}")
    public ResponseEntity<String> sendMessage(@PathVariable("message") String message) {
        chat.notifyObservers(message);
        return ResponseEntity.ok("message sent");
    }



}
