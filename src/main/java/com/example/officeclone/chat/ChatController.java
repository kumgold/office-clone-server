package com.example.officeclone.chat;

import com.example.officeclone.data.Chat;
import com.example.officeclone.data.ChattingRoom;
import com.example.officeclone.response.ChatResponse;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ChatController {
    List<Chat> list = new ArrayList<>(
            Arrays.asList(
                    new Chat(
                            "111111",
                            System.currentTimeMillis(),
                            "test",
                            "1",
                            "1-2"
                    ),
                    new Chat(
                            "222222",
                            System.currentTimeMillis(),
                            "test 2",
                            "1",
                            "1-2"
                    ),
                    new Chat(
                            "333333",
                            System.currentTimeMillis(),
                            "test 2",
                            "2",
                            "1-2"
                    ),
                    new Chat(
                            "444444",
                            System.currentTimeMillis(),
                            "test 2",
                            "2",
                            "1-2"
                    )
            )
    );

    @GetMapping("/chats")
    @ResponseBody
    public ChatResponse getChatList(@RequestParam("id") String chattingRoomId) {
        return new ChatResponse(list);
    }

    @PostMapping("/chats")
    public Chat createChat(@RequestBody Chat chat) {
        list.add(chat);

        return chat;
    }
}
