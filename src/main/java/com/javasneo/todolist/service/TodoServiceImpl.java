package com.javasneo.todolist.service;

import com.javasneo.todolist.model.Todo;
import com.javasneo.todolist.repository.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class TodoServiceImpl implements TodoService{
  @Autowired
  TodoRepository todoRepository;

  public List<Todo> getAll(){
    List<Todo> todoList = new ArrayList<Todo>();
    todoRepository.findAll().forEach(todo -> todoList.add(todo));
    return todoList;
  }

  public Todo create(Todo todo)
  {
    return todoRepository.save(new Todo(UUID.randomUUID(), todo.getName(), todo.getDescription()));
  }

  public Todo update(Todo todo)
  {
    return todoRepository.save(todo);
  }

  public void delete(UUID id)
  {
    todoRepository.deleteById(id);
  }

}
