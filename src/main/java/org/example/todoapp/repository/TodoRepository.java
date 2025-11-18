package org.example.todoapp.repository;

import org.example.todoapp.dto.TodoDto;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap; // 안정성이 높음

public class TodoRepository {
    private final Map<Long, TodoDto> storage = new ConcurrentHashMap<>();
    private Long nextId = 1L; // L = Long

    public TodoDto save(TodoDto todo) {
        // 데이터를 저장하는 로직
        todo.setId(nextId++);
        storage.put(todo.getId(), todo);
        return todo;
    }

    public List<TodoDto> findAll() {
        return new ArrayList<>(storage.values());
    }

    public TodoDto findById(Long id) {
        return storage.get(id);
    }
}
