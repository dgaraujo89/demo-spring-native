package com.example.web;

import com.example.web.dto.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class MessageController {

    @GetMapping
    public Message index(@RequestParam(defaultValue = "empty") String name) {
        return Message.builder()
                .name(name)
                .text("Hello")
                .build();
    }
}
