package com.farm.repos;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestParam;

import com.farm.models.Cattle;

@CrossOrigin()
public interface CattleRepo extends JpaRepository<Cattle, Long> {
	Page<Cattle> findById(@RequestParam Long id, Pageable pageable);
	
	Page<Cattle> findByCategoryId(@RequestParam Long id, Pageable pageable);
	
	Page<Cattle> findBySex(@RequestParam String sex, Pageable pageable);
}