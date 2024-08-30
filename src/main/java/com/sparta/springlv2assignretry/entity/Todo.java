package com.sparta.springlv2assignretry.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Getter
public class Todo extends Timestamped {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String username;
    private String title;
    private String contents;


    public Todo(String title, String contents) {
        this.title = title;
        this.contents = contents;
    }

    public void updateTitle(String title) { this.title = title;
    }

    public void updateContents(String contents) { this.contents = contents;
    }
}
