package com.example.officeclone.chat;

import com.example.officeclone.data.ChattingRoom;
import com.example.officeclone.response.ChattingRoomResponse;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ChattingRoomController {
    List<ChattingRoom> list = new ArrayList<>(
            Arrays.asList(
                    new ChattingRoom(
                            "1-11",
                            "name AAA",
                           Arrays.asList("1", "11")
                    ),
                    new ChattingRoom(
                            "1-2",
                            "name ABC",
                            Arrays.asList("1", "2")
                    )
            )
    );

    @GetMapping("/chatting-rooms")
    @ResponseBody
    public ChattingRoomResponse getChattingRooms() {
        return new ChattingRoomResponse(list);
    }

    @PostMapping("/chatting-room")
    public ChattingRoom createChattingRoom(@RequestBody ChattingRoom room) {
        if (!list.contains(room)) {
            list.add(room);
        }
        return room;
    }
}

