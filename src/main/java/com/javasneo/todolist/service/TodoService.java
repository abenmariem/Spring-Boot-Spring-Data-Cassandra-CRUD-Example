package com.javasneo.todolist.service;

import com.javasneo.todolist.model.Todo;

import java.util.List;
import java.util.UUID;

public interface TodoService {
  List<Todo> getAll();
  Todo create(Todo todo);
  Todo update(Todo todo);
  void delete(UUID id);
}
