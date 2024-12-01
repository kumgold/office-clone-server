package com.example.officeclone.response;

import com.example.officeclone.data.Chat;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class ChatResponse {
    List<Chat> data;

    public ChatResponse(List<Chat> data) {
        this.data = data;
    }
}
