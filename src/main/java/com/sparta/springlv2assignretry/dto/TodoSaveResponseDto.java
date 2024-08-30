package com.sparta.springlv2assignretry.dto;

import lombok.Getter;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Getter
public class TodoSaveResponseDto {

    private final String username;
    private final String title;
    private final String contents;
    private final LocalDateTime createdAt;

    public TodoSaveResponseDto(String username, String title, String contents, LocalDateTime createdAt) {
        this.username = username;
        this.title = title;
        this.contents = contents;
        this.createdAt = createdAt;
    }
}
