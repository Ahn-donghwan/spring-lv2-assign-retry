package com.sparta.springlv2assignretry.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommentSaveResponseDto {

    private final String username;
    private final String comment;
    private final LocalDateTime createdAt;

    public CommentSaveResponseDto(String username, String comment, LocalDateTime createdAt) {
        this.username = username;
        this.comment = comment;
        this.createdAt = createdAt;
    }
}
