package com.example.officeclone.data;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Member {
    private String id;
    private String name;
    private String number;
    private String statusMessage;
    private String group;
    private Boolean isFavorite;

    public Member(String id, String name, String number, String statusMessage, String group, Boolean isFavorite) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.statusMessage = statusMessage;
        this.group = group;
        this.isFavorite = isFavorite;
    }
}
