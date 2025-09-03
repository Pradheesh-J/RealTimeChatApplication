package com.chat.app.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Data
@Component
@NoArgsConstructor

public class ChatMessage {
    private long id;
    private String sender;
    private String content;
}
