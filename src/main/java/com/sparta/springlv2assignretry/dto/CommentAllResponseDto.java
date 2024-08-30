package com.sparta.springlv2assignretry.dto;

import lombok.Getter;
import org.springframework.cglib.core.Local;

import java.time.LocalDateTime;

@Getter
public class CommentAllResponseDto {

    private final String username;
    private final String comment;
    private final LocalDateTime createdAt;

    public CommentAllResponseDto(String username, String comment, LocalDateTime createdAt) {
        this.username = username;
        this.comment = comment;
        this.createdAt = createdAt;
    }
}
