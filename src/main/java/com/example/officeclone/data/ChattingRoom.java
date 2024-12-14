package com.example.officeclone.data;

import lombok.*;

import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ChattingRoom {
    private String id;
    private String name;
    private List<String> memberIdList;
}
