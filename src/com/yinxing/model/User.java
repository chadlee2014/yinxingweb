package com.yinxing.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
public class User {

	String description;
	String email;
	String experience;
	String head;
	int id;
	String identity;
	boolean isLive;
	String password;
	String phone;
	String QQ;
	String realname;
	String username;

	Set<Tech> techs = new HashSet<Tech>();
	Set<Message> messages = new HashSet<Message>();
	
	@OneToMany(mappedBy="user")
	public Set<Message> getMessages() {
		return messages;
	}

	public void setMessages(Set<Message> messages) {
		this.messages = messages;
	}

	@OneToMany(mappedBy="user")
	public Set<Tech> getTechs() {
		return techs;
	}

	public void setTechs(Set<Tech> techs) {
		this.techs = techs;
	}

	@Column(name="_description",columnDefinition="TEXT")
	public String getDescription() {
		return description;
	}

	@Column(name="_email",length=50)
	public String getEmail() {
		return email;
	}

	@Column(name="_experience",columnDefinition="TEXT")
	public String getExperience() {
		return experience;
	}

	@Column(name="_head",length=100)
	public String getHead() {
		return head;
	}

	@Id
	@Column(name="_id")
	@GeneratedValue
	public int getId() {
		return id;
	}

	@Column(name="_identity",columnDefinition="TEXT")
	public String getIdentity() {
		return identity;
	}

	@Column(name="_password",length=50)
	public String getPassword() {
		return password;
	}

	@Column(name="_phone",length=50)
	public String getPhone() {
		return phone;
	}

	@Column(name="_QQ",length=50)
	public String getQQ() {
		return QQ;
	}

	@Column(name="_realname",length=50)
	public String getRealname() {
		return realname;
	}

	@Column(name="_username",length=50,unique=true)
	public String getUsername() {
		return username;
	}

	@Column(name="_islive")
	public boolean isLive() {
		return isLive;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setExperience(String experience) {
		this.experience = experience;
	}

	public void setHead(String head) {
		this.head = head;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setIdentity(String identity) {
		this.identity = identity;
	}

	public void setLive(boolean isLive) {
		this.isLive = isLive;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setQQ(String qQ) {
		QQ = qQ;
	}

	public void setRealname(String realname) {
		this.realname = realname;
	}

	public void setUsername(String username) {
		this.username = username;
	}



}
