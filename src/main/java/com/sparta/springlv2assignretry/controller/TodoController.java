package com.sparta.springlv2assignretry.controller;

import com.sparta.springlv2assignretry.dto.todoRequestDto.TodoSaveRequestDto;
import com.sparta.springlv2assignretry.dto.todoRequestDto.UpdateTodoContentsRequestDto;
import com.sparta.springlv2assignretry.dto.todoRequestDto.UpdateTodoTitleRequestDto;
import com.sparta.springlv2assignretry.dto.todoResponseDto.TodoDetailResponseDto;
import com.sparta.springlv2assignretry.dto.todoResponseDto.TodoSaveResponseDto;
import com.sparta.springlv2assignretry.dto.todoResponseDto.UpdateTodoContentsResponseDto;
import com.sparta.springlv2assignretry.dto.todoResponseDto.UpdateTodoTitleResponseDto;
import com.sparta.springlv2assignretry.service.TodoService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
public class TodoController {

    private TodoService todoService;

    // 일정 저장
    @PostMapping("/todos")
    public ResponseEntity<TodoSaveResponseDto> saveTodo(@RequestBody TodoSaveRequestDto todoSaveRequestDto){
        return ResponseEntity.ok(todoService.saveTodo(todoSaveRequestDto));
    }

    // 단건 조회
    @GetMapping("/todos/{todoUsername}")
    public ResponseEntity<TodoDetailResponseDto> getTodo(@PathVariable String todoUsername){
        return ResponseEntity.ok(todoService.getTodo(todoUsername));
    }

    // 수정 - 제목 수정
    @PutMapping("/todos/{todoUsername}")
    public ResponseEntity<UpdateTodoTitleResponseDto> updateTodoTitle(@PathVariable String todoUsername, @RequestBody UpdateTodoTitleRequestDto updateTodoTitleRequestDto){
        return ResponseEntity.ok(todoService.updateTodoTitle(todoUsername,updateTodoTitleRequestDto));
    }

    // 수정 - 내용 수정
    @PutMapping("/todos/{todoUsername}")
    public UpdateTodoContentsResponseDto updateTodoContents(@PathVariable String todoUsername, @RequestBody UpdateTodoContentsRequestDto updateTodoContentsRequestDto){
        return todoService.updateTodoContents(todoUsername, updateTodoContentsRequestDto);
    }

}
