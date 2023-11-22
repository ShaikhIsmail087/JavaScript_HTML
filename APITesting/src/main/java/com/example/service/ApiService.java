package com.example.service;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import java.net.URI;
import java.net.URISyntaxException;

@Service
public class ApiService {

    private final String apiUrl = "https://chatbotapi.idealake.com/InitiateChat/Initiate_Chat/?ConversationId=&Medium=web&Location&ClientDomain=https://iluiprojects.idealake.com/GI-Chatbot/test/chatbot.html";
    private final String accessToken = "Bearer eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJ1bmlxdWVfbmFtZSI6InVzZXJuYW1lIiwibmJmIjoxNjk2NTk2MjQ2LCJleHAiOjE3MDUyMzYyNDUsImlhdCI6MTY5NjU5NjI0NiwiaXNzIjoiTGVvQm90IiwiYXVkIjoiVXNlcnMifQ.BynPKQk3EGogYI_Zz_81HksIBX_uqM3qR32eA5VaZik";
    private final String customHeader = "OTA5MDkwOTA5MDkwOTA5MA==";

    private final WebClient webClient;

    public ApiService(WebClient.Builder webClientBuilder) {
        this.webClient = webClientBuilder.baseUrl(apiUrl)
                .defaultHeader("Content-Type", "application/json")
                .defaultHeader("Authorization", accessToken)
                .defaultHeader("X-Custom-Header", customHeader)
                .build();
    }

    public String initiateChat() throws URISyntaxException {
        return webClient.get()
                .uri(new URI(apiUrl))
                .retrieve()
                .bodyToMono(String.class)
                .block(); // blocking for simplicity, consider using subscribe in production
    }
}
