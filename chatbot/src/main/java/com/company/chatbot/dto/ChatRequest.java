package com.company.chatbot.dto;

import lombok.Data;

import java.util.List;

@Data
public class ChatRequest {
    private String model = "gpt-3.5-turbo";
    private List<ChatMessage> messages;
}
