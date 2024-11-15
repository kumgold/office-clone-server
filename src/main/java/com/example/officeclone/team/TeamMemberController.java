package com.example.officeclone.team;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TeamMemberController {

    @GetMapping("/team")
    public String getMembers() {
        return "hello";
    }
}
