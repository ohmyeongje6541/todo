package org.example.todoapp.repository;

import org.example.todoapp.dto.TodoDto;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap; // 안정성이 높음

public class TodoRepository {
    private final Map<Long, TodoDto> storage = new ConcurrentHashMap<>();
    private Long nextId = 1L; // L = Long
}
