package com.example.officeclone.data;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ChattingRoom {
    private String id;
    private String name;
    private String previewMessage;
    private int memberCount;
}
