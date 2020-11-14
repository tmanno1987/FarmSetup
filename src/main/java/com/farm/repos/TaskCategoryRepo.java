package com.farm.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.farm.models.TaskCategory;

@CrossOrigin()
@RepositoryRestResource(collectionResourceRel="taskCategory", path="task-category")
public interface TaskCategoryRepo extends JpaRepository<TaskCategory, Long> {

}