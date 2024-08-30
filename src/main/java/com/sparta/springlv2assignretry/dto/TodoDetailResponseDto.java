package com.sparta.springlv2assignretry.dto;

import lombok.Getter;

@Getter
public class TodoDetailResponseDto {

    private final String username;
    private final String title;
    private final String contents;


    public TodoDetailResponseDto(String username, String title, String contents) {
        this.username = username;
        this.title = title;
        this.contents = contents;
    }
}
