package com.sparta.springlv2assignretry.controller;

import com.sparta.springlv2assignretry.dto.*;
import com.sparta.springlv2assignretry.service.CommentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class CommentController {

    private final CommentService commentService;

    // 댓글 저장
    @PostMapping("/todos/{todoUsername}/comments")
    public ResponseEntity<CommentSaveResponseDto> saveComment(@RequestBody CommentSaveRequestDto commentSaveRequestDto){
        return ResponseEntity.ok(commentService.saveComment(commentSaveRequestDto));
    }

    // 단건 조회
    @GetMapping("/todos/{todoUsername}/comments")
    public ResponseEntity<CommentDetailResponseDto> getComment(@PathVariable String todoUsername){
        return ResponseEntity.ok(commentService.getComment(todoUsername));
    }

    // 전체 조회
    @GetMapping("/todos")
    public ResponseEntity<List<CommentAllResponseDto>> getComments(){
        return ResponseEntity.ok(commentService.getComments());
    }

    // 수정
    @PutMapping("/todos/{todoUsername}/comments")
    public UpdateCommentResponseDto updateComment(@PathVariable String todoUsername, @RequestBody UpdateCommentRequestDto updateCommentRequestDto){
        return commentService.updateComment(todoUsername, updateCommentRequestDto);
    }

    // 삭제
    @DeleteMapping("/todos/{todoUsername}/comments")
    public void deleteComment(@PathVariable String todoUsername) { commentService.deleteComment(todoUsername); }
}
