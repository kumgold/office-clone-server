package com.example.officeclone.data;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class ChattingRoom {
    private String id;
    private String name;
    private String previewMessage;
    private int memberCount;

    public ChattingRoom(String id, String name, String previewMessage, int memberCount) {
        this.id = id;
        this.name = name;
        this.previewMessage = previewMessage;
        this.memberCount = memberCount;
    }
}
