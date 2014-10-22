package com.yinxing.model;

import javax.persistence.*;

@Entity
public class ProjectPhoto {

	int id;
	String url;
	boolean isMain;

	Project project;

	@Id
	@Column(name="_id")
	@GeneratedValue
	public int getId() {
		return id;
	}

	@ManyToOne
	@JoinColumn(name="project_id")
	public Project getProject() {
		return project;
	}

	@Column(name="_url",length=100)
	public String getUrl() {
		return url;
	}

	@Column(name="_isMain")
	public boolean isMain() {
		return isMain;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMain(boolean isMain) {
		this.isMain = isMain;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}


