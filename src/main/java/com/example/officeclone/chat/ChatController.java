package com.example.officeclone.chat;

import com.example.officeclone.data.Chat;
import com.example.officeclone.response.ChatResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class ChatController {
    List<Chat> list = new ArrayList<>(
            Arrays.asList(
                    new Chat(
                            "111111",
                            "2024-12-01",
                            "test",
                            "1",
                            "1-2"
                    ),
                    new Chat(
                            "222222",
                            "2024-12-01",
                            "test 2",
                            "2",
                            "1-2"
                    ),
                    new Chat(
                            "222222",
                            "2024-12-01",
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
}
