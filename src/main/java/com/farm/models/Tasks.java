package com.farm.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Task")
public class Tasks {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="task_name")
	private String name;
	
	@Column(name="currently_active")
	private Boolean active;
	
	@Column(name="avg_time")
	@Temporal(TemporalType.TIMESTAMP)
	private Date avgTime;
	
	@Column(name="last_updated")
	@Temporal(TemporalType.DATE)
	private Date lastUpdated;
	
	@ManyToOne
	@JoinColumn(name="category_name", nullable=false)
	private TaskCategory category;
	
	@Column(name="description")
	private String desc;
	
	@Column(name="photoUrl")
	private String photoUrl;
	
	public Tasks() { super(); }

	public Tasks(String name, Boolean active, Date avgTime, Date lastUpdated, TaskCategory category, String desc,
			String photoUrl) {
		super();
		this.name = name;
		this.active = active;
		this.avgTime = avgTime;
		this.lastUpdated = lastUpdated;
		this.category = category;
		this.desc = desc;
		this.photoUrl = photoUrl;
	}

	public Tasks(Long id, String name, Boolean active, Date avgTime, Date lastUpdated, TaskCategory category,
			String desc, String photoUrl) {
		super();
		this.id = id;
		this.name = name;
		this.active = active;
		this.avgTime = avgTime;
		this.lastUpdated = lastUpdated;
		this.category = category;
		this.desc = desc;
		this.photoUrl = photoUrl;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public Date getAvgTime() {
		return avgTime;
	}

	public void setAvgTime(Date avgTime) {
		this.avgTime = avgTime;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public TaskCategory getCategory() {
		return category;
	}

	public void setCategory(TaskCategory category) {
		this.category = category;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
}