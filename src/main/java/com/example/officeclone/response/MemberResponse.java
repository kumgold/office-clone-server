package com.example.officeclone.response;

import com.example.officeclone.data.Member;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
@ToString
public class MemberResponse {
    int statusCode;
    List<Member> data;
    
    public MemberResponse(int statusCode, List<Member> members) {
        this.statusCode = statusCode;
        this.data = members;
    }
}
