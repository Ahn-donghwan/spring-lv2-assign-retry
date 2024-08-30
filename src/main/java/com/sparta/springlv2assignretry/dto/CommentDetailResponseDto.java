package com.sparta.springlv2assignretry.dto;

import lombok.Getter;

import java.time.LocalDateTime;

@Getter
public class CommentDetailResponseDto {

    private final String username;
    private final String comment;
    private final LocalDateTime createdAt;

    public CommentDetailResponseDto(String username, String comment, LocalDateTime createdAt) {
        this.username = username;
        this.comment = comment;
        this.createdAt = createdAt;
    }
}
