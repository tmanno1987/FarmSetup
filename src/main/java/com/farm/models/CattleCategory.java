package com.farm.models;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.farm.models.enums.CattleType;

@Entity
@Table(name="Breeds")
public class CattleCategory {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="breed_type")
	private CattleType name;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="category")
	private Set<Cattle> cattleSet;
	
	public CattleCategory() { super(); }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CattleType getName() {
		return name;
	}

	public void setName(CattleType name) {
		this.name = name;
	}

	public Set<Cattle> getCattleSet() {
		return cattleSet;
	}

	public void setCattleSet(Set<Cattle> cattleSet) {
		this.cattleSet = cattleSet;
	}
}