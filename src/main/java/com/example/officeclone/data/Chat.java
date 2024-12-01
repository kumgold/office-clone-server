package com.example.officeclone.data;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
public class Chat {
    private String id;
    private String date;
    private String message;
    private String memberId;
    private String chattingRoomId;
}
