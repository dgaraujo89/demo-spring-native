package com.example.web.dto;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Message {

    private String name;
    private String text;

}
