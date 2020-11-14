package com.farm.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.farm.models.enums.TaskType;

@Entity
@Table(name="Task_Categories")
public class TaskCategory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="category_name")
	@Enumerated(EnumType.STRING)
	private TaskType name;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="category")
	private Set<Tasks> taskList;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public TaskType getName() {
		return name;
	}

	public void setName(TaskType name) {
		this.name = name;
	}

	public Set<Tasks> getTaskList() {
		return taskList;
	}

	public void setTaskList(Set<Tasks> taskList) {
		this.taskList = taskList;
	}
}