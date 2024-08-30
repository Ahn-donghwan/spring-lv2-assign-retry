package com.sparta.springlv2assignretry.dto.todoResponseDto;

import lombok.Getter;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Getter
public class TodoDetailResponseDto {

    private final String username;
    private final String title;
    private final String contents;
    private final LocalDateTime createdAt;


    public TodoDetailResponseDto(String username, String title, String contents, LocalDateTime createdAt) {
        this.username = username;
        this.title = title;
        this.contents = contents;
        this.createdAt = createdAt;
    }
}
