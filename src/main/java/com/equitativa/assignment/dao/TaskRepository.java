package com.equitativa.assignment.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.equitativa.assignment.model.Task;

public interface TaskRepository extends JpaRepository<Task, Long> {

}
