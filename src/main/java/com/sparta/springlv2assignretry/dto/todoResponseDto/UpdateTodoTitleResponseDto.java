package com.sparta.springlv2assignretry.dto.todoResponseDto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class UpdateTodoTitleResponseDto {

    private final String username;
    private final String title;
    private final String contents;
    private final LocalDateTime modifiedAt;


    public UpdateTodoTitleResponseDto(String username, String title, String contents, LocalDateTime modifiedAt) {
        this.username = username;
        this.title = title;
        this.contents = contents;
        this.modifiedAt = modifiedAt;
    }
}
