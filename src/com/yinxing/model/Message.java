package com.yinxing.model;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Message {

	int id;
	Date date;
	String text;
	boolean isPrivate;
	int followId;
	boolean isBoard;

	User user;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="_date")
	public Date getDate() {
		return date;
	}

	@Column(name="_followId")
	public int getFollowId() {
		return followId;
	}

	@Id
	@Column(name="_id")
	@GeneratedValue
	public int getId() {
		return id;
	}

	@Column(name="_text",columnDefinition="TEXT")
	public String getText() {
		return text;
	}

	@ManyToOne
	@JoinColumn(name="user_id")
	public User getUser() {
		return user;
	}

	@Column(name="_isBoard")
	public boolean isBoard() {
		return isBoard;
	}

	@Column(name="_isPrivate")
	public boolean isPrivate() {
		return isPrivate;
	}

	public void setBoard(boolean isBoard) {
		this.isBoard = isBoard;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setFollowId(int followId) {
		this.followId = followId;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setPrivate(boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	public void setText(String text) {
		this.text = text;
	}

	public void setUser(User user) {
		this.user = user;
	}

	
}
