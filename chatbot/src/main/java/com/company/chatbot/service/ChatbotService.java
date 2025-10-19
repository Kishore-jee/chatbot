package com.company.chatbot.service;

import com.company.chatbot.dto.ChatMessage;
import com.company.chatbot.dto.ChatRequest;
import com.company.chatbot.dto.ChatResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Service("chatbot")
@Slf4j
public class ChatbotService {
    @Value("${openai.api.key}")
    private String apiKey;

    @Value("${openai.api.url}")
    private String apiUrl;

    private final RestTemplate restTemplate = new RestTemplate();

    public String getChatResponse(String userMessage){
        ChatMessage msg = new ChatMessage("user", userMessage);
        ChatRequest request = new ChatRequest();
        request.setMessages(Collections.singletonList(msg));

        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.setBearerAuth(apiKey);

        HttpEntity entity = new HttpEntity(request, headers);
        ResponseEntity<ChatResponse> response = restTemplate.exchange(apiUrl, HttpMethod.POST, entity, ChatResponse.class);

        log.info("=============> {}", response);
        return response.getBody().getChoices().get(0).getMessage().getContent();
    }
}
