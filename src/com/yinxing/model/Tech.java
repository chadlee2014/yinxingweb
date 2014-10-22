package com.yinxing.model;

import javax.persistence.*;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
public class Tech {

	int id;
	String type;
	String tittle;
	String text;
	Date date;
	int count;
	int good;
	String nextText;

	User user;
	Set<TechPhoto> techPhotos = new HashSet<TechPhoto>();
	
	@ManyToOne
	@JoinColumn(name="user_id")
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@OneToMany(mappedBy="tech")
	public Set<TechPhoto> getTechPhotos() {
		return techPhotos;
	}

	public void setTechPhotos(Set<TechPhoto> techPhotos) {
		this.techPhotos = techPhotos;
	}

	@Column(name="_count")
	public int getCount() {
		return count;
	}

	@Column(name="_date")
	@Temporal(TemporalType.TIMESTAMP)
	public Date getDate() {
		return date;
	}

	@Column(name="_good")
	public int getGood() {
		return good;
	}

	@Id
	@Column(name="_id")
	@GeneratedValue
	public int getId() {
		return id;
	}

	@Column(name="_nextText",columnDefinition="TEXT")
	public String getNextText() {
		return nextText;
	}

	@Column(name="_text",columnDefinition="TEXT")
	public String getText() {
		return text;
	}

	@Column(name="_tittle",length=50)
	public String getTittle() {
		return tittle;
	}

	@Column(name="_type",length=50)
	public String getType() {
		return type;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setGood(int good) {
		this.good = good;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNextText(String nextText) {
		this.nextText = nextText;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

	public void setType(String type) {
		this.type = type;
	}

}
