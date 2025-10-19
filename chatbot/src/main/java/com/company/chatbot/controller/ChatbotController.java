package com.company.chatbot.controller;

import com.company.chatbot.service.ChatbotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chat")
public class ChatbotController {

    public ChatbotController(){
        System.out.println("ChatbotController");
    }

    @Autowired
    private ChatbotService chatbotService;

    @PostMapping("/bot")
    public String chat(@RequestBody String userMessage) {
        return chatbotService.getChatResponse(userMessage);
    }
}

