package com.example.demo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BotController {
    @PostMapping(value= "/greet", consumes = "application/json")
    public String greet(@RequestBody List<UserInfo> userInfoList) {
//        if (userInfo.isEnabled()) {
//            return String.format("Hello! Nice to see you, %s!", userInfo.getName());
//        } else {
//            return String.format("Hello! Nice to see you, %s! Your account is disabled", userInfo.getName());
//        }
        return String.format("Ok, %d of users have been looged out!", userInfoList.size());
    }
}
