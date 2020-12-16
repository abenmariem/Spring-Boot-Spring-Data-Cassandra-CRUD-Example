package com.javasneo.todolist.model;

import org.springframework.data.cassandra.core.mapping.PrimaryKey;
import org.springframework.data.cassandra.core.mapping.Table;

import java.util.UUID;


@Table
public class Todo {

  @PrimaryKey
  private UUID id;
  private String name;
  private String description;

  public Todo() {
  }

  public Todo(UUID id, String name, String description) {
    this.id = id;
    this.name = name;
    this.description = description;
  }

  public UUID getId() {
    return id;
  }

  public void setId(UUID id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void setDescription(String description) {
    this.description = description;
  }
}
