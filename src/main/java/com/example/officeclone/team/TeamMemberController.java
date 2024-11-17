package com.example.officeclone.team;

import com.example.officeclone.data.Member;
import com.example.officeclone.data.ResponseData;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class TeamMemberController {

    @GetMapping("/team")
    @ResponseBody
    public ResponseData getMembers() {
        List<Member> list = new ArrayList<>();

        list.add(
                new Member(
                        "1",
                        "name A",
                        "01011111111",
                        "status message",
                        "",
                        false
                )
        );

        return new ResponseData(
                200,
                list
        );
    }
}

