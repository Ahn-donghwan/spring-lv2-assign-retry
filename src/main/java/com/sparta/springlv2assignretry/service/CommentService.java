package com.sparta.springlv2assignretry.service;

import com.sparta.springlv2assignretry.dto.*;
import com.sparta.springlv2assignretry.entity.Comment;
import com.sparta.springlv2assignretry.repository.CommentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class CommentService {

    private final CommentRepository commentRepository;

    @Transactional
    public CommentSaveResponseDto saveComment(CommentSaveRequestDto commentSaveRequestDto) {
        Comment newComment = new Comment(commentSaveRequestDto.getComment());

        Comment savedComment = commentRepository.save(newComment);

        return new CommentSaveResponseDto(savedComment.getUsername(), savedComment.getComment(), savedComment.getCreatedAt());
    }

    public CommentDetailResponseDto getComment(String todoUsername) {
        Comment comment = commentRepository.findById(todoUsername).orElseThrow(() -> new NullPointerException("해당 ID 를 찾을 수 없음. 다시 입력해주세요."));

        return new CommentDetailResponseDto(comment.getUsername(), comment.getComment(), comment.getCreatedAt());
    }

    public List<CommentAllResponseDto> getComments() {

        List<Comment> commentList = commentRepository.findAll();

        List<CommentAllResponseDto> dtoList = new ArrayList<>();

        for (Comment comment : commentList) {
            CommentAllResponseDto dto = new CommentAllResponseDto(comment.getUsername(), comment.getComment(), comment.getCreatedAt());
            dtoList.add(dto);
        }
        return dtoList;
    }

    @Transactional
    public UpdateCommentResponseDto updateComment(String todoUsername, UpdateCommentRequestDto updateCommentRequestDto) {

        Comment comment = commentRepository.findById(todoUsername).orElseThrow(() -> new NullPointerException("해당 ID를 찾을 수 없음. 다시 시도 해주세요."));

        comment.updateComment(updateCommentRequestDto.getComment());

        return new UpdateCommentResponseDto( comment.getUsername(), comment.getComment(), comment.getModifiedAt());
    }

    @Transactional
    public void deleteComment(String todoUsername) { commentRepository.deleteById(todoUsername);
    }
}

