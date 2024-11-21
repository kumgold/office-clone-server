package com.example.officeclone.chat;

import com.example.officeclone.data.ChattingRoom;
import lombok.Getter;
import lombok.ToString;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ChatController {
    @GetMapping("/chattingroom")
    @ResponseBody
    public ChattingRoomResponse getChattingRooms() {
        List<ChattingRoom> list = new ArrayList<>();

        list.add(
                new ChattingRoom(
                        "1&11",
                        "name AAA",
                        "test",
                        2
                )
        );

        list.add(
                new ChattingRoom(
                        "1&2",
                        "name ABC",
                        "test 2",
                        2
                )
        );

        return new ChattingRoomResponse(
                list
        );
    }
}

