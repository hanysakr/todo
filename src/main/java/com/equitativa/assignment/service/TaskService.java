package com.equitativa.assignment.service;

import java.util.List;

import com.equitativa.assignment.dto.TaskDTO;

public interface TaskService {
	
	public void addTask(TaskDTO task);
	
	public void removeTask(Long id);
	
	public void updateTask(TaskDTO task);
	
	public TaskDTO getTaskById(Long id);
	
	public List<TaskDTO> list();

}
