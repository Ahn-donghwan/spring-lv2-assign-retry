package com.sparta.springlv2assignretry.service;

import com.sparta.springlv2assignretry.dto.*;
import com.sparta.springlv2assignretry.entity.Todo;
import com.sparta.springlv2assignretry.repository.TodoRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class TodoService {

    private final TodoRepository todoRepository;

    @Transactional
    public TodoSaveResponseDto saveTodo(TodoSaveRequestDto todoSaveRequestDto) {
        Todo newTodo = new Todo( todoSaveRequestDto.getTitle(), todoSaveRequestDto.getContents());

        Todo savedTodo = todoRepository.save(newTodo);

        return new TodoSaveResponseDto(savedTodo.getUsername(), savedTodo.getTitle(), savedTodo.getContents(), savedTodo.getCreatedAt());
    }

    public TodoDetailResponseDto getTodo(String todoUsername) {
        Todo todo = todoRepository.findById(todoUsername).orElseThrow(() -> new NullPointerException("해당 Username 으로 조회할 수 없음. 다시 시도해주세요."));

        return new TodoDetailResponseDto( todo.getUsername(), todo.getTitle(), todo.getContents());
    }

    @Transactional
    public UpdateTodoTitleResponseDto updateTodoTitle(String todoUsername, UpdateTodoTitleRequestDto updateTodoTitleRequestDto) {
        Todo todo = todoRepository.findById(todoUsername).orElseThrow(() -> new NullPointerException("해당 Username 으로 조회할 수 없음. 다시 시도해주세요."));

        todo.updateTitle(updateTodoTitleRequestDto.getTitle());

        return new UpdateTodoTitleResponseDto( todo.getUsername(), todo.getTitle(), todo.getContents(), todo.getModifiedAt());
    }

    public UpdateTodoContentsResponseDto updateTodoContents(String todoUsername, UpdateTodoContentsRequestDto updateTodoContentsRequestDto) {
        Todo todo = todoRepository.findById(todoUsername).orElseThrow(() -> new NullPointerException("해당 Username 으로 조회할 수 없음. 다시 시도해주세요."));

        todo.updateContents(updateTodoContentsRequestDto.getContents());

        return new UpdateTodoContentsResponseDto( todo.getUsername(), todo.getTitle(), todo.getUsername(), todo.getModifiedAt());
    }
}
