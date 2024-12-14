package com.example.officeclone.data;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Chat {
    private String id;
    private Long datetimeMilli;
    private String message;
    private String memberId;
    private String chattingRoomId;
}
