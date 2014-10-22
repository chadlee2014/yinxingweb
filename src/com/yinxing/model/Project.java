package com.yinxing.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Project {

	int id;
	String tittle;
	String description;
	Date date;
	String trueDescription;

	Set<ProjectPhoto> projectPhotos = new HashSet<ProjectPhoto>();
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="_date")
	public Date getDate() {
		return date;
	}

	@Column(name="_description",columnDefinition="TEXT")
	public String getDescription() {
		return description;
	}

	@Id
	@Column(name="_id")
	@GeneratedValue
	public int getId() {
		return id;
	}

	@OneToMany(mappedBy="project")
	public Set<ProjectPhoto> getProjectPhotos() {
		return projectPhotos;
	}

	@Column(name="_tittle",length=50)
	public String getTittle() {
		return tittle;
	}

	@Column(name="_trueDescription",columnDefinition="TEXT")
	public String getTrueDescription() {
		return trueDescription;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setProjectPhotos(Set<ProjectPhoto> projectPhotos) {
		this.projectPhotos = projectPhotos;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public void setTrueDescription(String trueDescription) {
		this.trueDescription = trueDescription;
	}

}
