package com.sparta.springlv2assignretry.repository;

import com.sparta.springlv2assignretry.entity.Comment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Comment, String> {
}
