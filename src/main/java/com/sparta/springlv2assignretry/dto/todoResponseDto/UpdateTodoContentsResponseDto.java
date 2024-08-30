package com.sparta.springlv2assignretry.dto.todoResponseDto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class UpdateTodoContentsResponseDto {

    private final String username;
    private final String title;
    private final String contents;
    private final LocalDateTime modifiedAt;


    public UpdateTodoContentsResponseDto(String username, String title, String contents, LocalDateTime modifiedAt) {
        this.username = username;
        this.title = title;
        this.contents = contents;
        this.modifiedAt = modifiedAt;
    }
}
