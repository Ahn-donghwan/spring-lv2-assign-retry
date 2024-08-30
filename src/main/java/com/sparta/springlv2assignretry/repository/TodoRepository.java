package com.sparta.springlv2assignretry.repository;

import com.sparta.springlv2assignretry.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, String> {
}
