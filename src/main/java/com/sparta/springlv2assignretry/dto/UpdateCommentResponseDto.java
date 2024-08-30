package com.sparta.springlv2assignretry.dto;

import lombok.Getter;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Getter
public class UpdateCommentResponseDto {

    private final String username;
    private final String comment;
    private final LocalDateTime modifiedAt;


    public UpdateCommentResponseDto(String username, String comment, LocalDateTime modifiedAt) {
        this.username = username;
        this.comment = comment;
        this.modifiedAt = modifiedAt;
    }
}
