package com.javasneo.todolist.repository;

import com.javasneo.todolist.model.Todo;
import org.springframework.data.cassandra.repository.CassandraRepository;

import java.util.UUID;

public interface TodoRepository extends CassandraRepository<Todo, UUID> {
}
