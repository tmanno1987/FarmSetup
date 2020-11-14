package com.farm.repos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.farm.models.Tasks;

@CrossOrigin()
public interface TaskRepo extends JpaRepository<Tasks, Long> {
	Page<Tasks> findById(@RequestParam Long id, Pageable pageable);
	
	Page<Tasks> findByCategoryId(@RequestParam Integer id, Pageable pageable);
	
	Page<Tasks> findByName(@RequestParam String name, Pageable pageable);
	
	Page<Tasks> findByNameContaining(@RequestParam String name, Pageable pageable);
}