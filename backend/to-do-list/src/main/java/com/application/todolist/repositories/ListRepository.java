package com.application.todolist.repositories;

import com.application.todolist.entities.List;
import org.springframework.data.repository.CrudRepository;

public interface ListRepository extends CrudRepository<List, Integer> {
}
