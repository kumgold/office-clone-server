package com.example.officeclone.data;

import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class ResponseData {
    int statusCode;
    List<Member> members;


    public ResponseData(int statusCode, List<Member> members) {
        this.statusCode = statusCode;
        this.members = members;
    }
}
