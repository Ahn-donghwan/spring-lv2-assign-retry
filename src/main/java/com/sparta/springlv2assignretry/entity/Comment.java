package com.sparta.springlv2assignretry.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity
@Getter
@NoArgsConstructor
public class Comment extends Timestamped {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String comment;
    private String username;

    public Comment(String comment) {
        this.comment = comment;

    }

    public void updateComment(String comment) { this.comment = comment;
    }
}
