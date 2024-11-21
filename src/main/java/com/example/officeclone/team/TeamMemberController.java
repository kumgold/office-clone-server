package com.example.officeclone.team;

import com.example.officeclone.data.Member;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TeamMemberController {

    @GetMapping("/team")
    @ResponseBody
    public MemberResponse getMembers() {
        List<Member> list = new ArrayList<>();

        list.add(
                new Member(
                        "11",
                        "name AAA",
                        "01011111111",
                        "status message",
                        "",
                        false
                )
        );
        list.add(
                new Member(
                        "2",
                        "name ABC",
                        "01022222222",
                        "",
                        "",
                        false
                )
        );
        list.add(
                new Member(
                        "3",
                        "name Hello",
                        "01012341234",
                        "Hello World",
                        "",
                        false
                )
        );

        return new MemberResponse(
                200,
                list
        );
    }
}

