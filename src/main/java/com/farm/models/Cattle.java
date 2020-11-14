package com.farm.models;

import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Cattle")
public class Cattle {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="breed")
	private CattleCategory category;
	
	@Column(name="sex_type")
	private String sex;
	
	@Column(name="birthday")
	@Temporal(TemporalType.DATE)
	private Date birthday;
	
	@Column(name="last_checkup")
	@Temporal(TemporalType.DATE)
	private Date checkup;
	
	@Column(name="age")
	private int age;
	
	@Column(name="price")
	private double price;
	
	@Column(name="photo")
	private String photoUrl;
	
	public Cattle() { super(); }

	public Cattle(CattleCategory category, String sex, Date birthday, Date checkup, int age, double price,
			String photoUrl) {
		super();
		this.category = category;
		this.sex = sex;
		this.birthday = birthday;
		this.checkup = checkup;
		this.age = age;
		this.price = price;
		this.photoUrl = photoUrl;
	}

	public Cattle(Long id, CattleCategory category, String sex, Date birthday, Date checkup, int age, double price,
			String photoUrl) {
		super();
		this.id = id;
		this.category = category;
		this.sex = sex;
		this.birthday = birthday;
		this.checkup = checkup;
		this.age = age;
		this.price = price;
		this.photoUrl = photoUrl;
	}
	
	private int calculateAge(Date bday) {
		Date d = new Date();
		
		return ChronoUnit.YEARS.between((Temporal)bday, (Temporal)d);
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public CattleCategory getCategory() {
		return category;
	}

	public void setCategory(CattleCategory category) {
		this.category = category;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getCheckup() {
		return checkup;
	}

	public void setCheckup(Date checkup) {
		this.checkup = checkup;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPhotoUrl() {
		return photoUrl;
	}

	public void setPhotoUrl(String photoUrl) {
		this.photoUrl = photoUrl;
	}
}











