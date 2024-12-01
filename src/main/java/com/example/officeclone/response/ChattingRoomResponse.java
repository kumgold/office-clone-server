package com.example.officeclone.response;

import com.example.officeclone.data.ChattingRoom;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class ChattingRoomResponse {
    List<ChattingRoom> data;

    public ChattingRoomResponse(List<ChattingRoom> data) {
        this.data = data;
    }
}
