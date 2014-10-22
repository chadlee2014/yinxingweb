package com.yinxing.model;

import javax.persistence.*;


@Entity
public class TechPhoto {

	int id;
	String url;
	boolean isMain;
	Tech tech;
	
	@Id
	@Column(name="_id")
	@GeneratedValue
	public int getId() {
		return id;
	}

	@ManyToOne
	@JoinColumn(name="tech_id")
	public Tech getTech() {
		return tech;
	}

	@Column(name="_url",length=100)
	public String getUrl() {
		return url;
	}

	@Column(name="_ismain")
	public boolean isMain() {
		return isMain;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setMain(boolean isMain) {
		this.isMain = isMain;
	}

	public void setTech(Tech tech) {
		this.tech = tech;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	
}
