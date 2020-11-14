package com.farm.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.farm.models.CattleCategory;

@CrossOrigin()
@RepositoryRestResource(collectionResourceRel="cattle-category")
public interface CattleCategoryRepo extends JpaRepository<CattleCategory, Long> {

}