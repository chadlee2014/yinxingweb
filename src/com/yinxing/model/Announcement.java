package com.yinxing.model;


import javax.persistence.*;
import java.util.Date;


@Entity
public class Announcement {

	int id = -1;
	String photo;
	String text;
	Date date;
	String tittle;
	String note;

	@Column(name="_date")
	@Temporal(TemporalType.TIME)
	public Date getDate() {
		return date;
	}

	@Id
	@Column(name="_id")
	@GeneratedValue
	public int getId() {
		return id;
	}

	@Column(name="_note",columnDefinition="TEXT")
	public String getNote() {
		return note;
	}

	@Column(name="_photo",length=100)
	public String getPhoto() {
		return photo;
	}

	@Column(name="_text",columnDefinition="TEXT")
	public String getText() {
		return text;
	}

	@Column(name="_tittle",length=50)
	public String getTittle() {
		return tittle;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setTittle(String tittle) {
		this.tittle = tittle;
	}

}
