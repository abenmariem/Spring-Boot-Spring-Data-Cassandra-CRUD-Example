package com.javasneo.todolist.model;

import java.util.ArrayList;
import java.util.List;

public class TodoListResponse {

  private List<Todo> todos;

  public List<Todo> getTodos() {
    return todos;
  }

  public void setTodos(List<Todo> todos) {
    this.todos = todos;
  }
}
