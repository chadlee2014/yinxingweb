package com.yinxing.common;

import com.yinxing.dao.*;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component
public class BaseService {
	protected static final String SUCCESS = "success";
	private AnnouncementDAO announcementDAO;
	private MessageDAO messageDAO;
	private ProjectDAO projectDAO;
	private ProjectPhotoDAO projectPhotoDAO;
	private TechDAO techDAO;
	private TechPhotoDAO techPhotoDAO;
	private UserDAO userDAO;

	protected AnnouncementDAO getAnnouncementDAO() {
		return announcementDAO;
	}

	protected MessageDAO getMessageDAO() {
		return messageDAO;
	}

	protected ProjectDAO getProjectDAO() {
		return projectDAO;
	}

	protected ProjectPhotoDAO getProjectPhotoDAO() {
		return projectPhotoDAO;
	}

	protected TechDAO getTechDAO() {
		return techDAO;
	}

	protected TechPhotoDAO getTechPhotoDAO() {
		return techPhotoDAO;
	}

	protected UserDAO getUserDAO() {
		return userDAO;
	}

	@Resource(name="announcementDAO")
	public void setAnnouncementDAO(AnnouncementDAO announcementDAO) {
		this.announcementDAO = announcementDAO;
	}

	@Resource(name="messageDAO")
	public void setMessageDAO(MessageDAO messageDAO) {
		this.messageDAO = messageDAO;
	}

	@Resource(name="projectDAO")
	public void setProjectDAO(ProjectDAO projectDAO) {
		this.projectDAO = projectDAO;
	}

	@Resource(name="projectPhotoDAO")
	public void setProjectPhotoDAO(ProjectPhotoDAO projectPhotoDAO) {
		this.projectPhotoDAO = projectPhotoDAO;
	}

	@Resource(name="techDAO")
	public void setTechDAO(TechDAO techDAO) {
		this.techDAO = techDAO;
	}

	@Resource(name="techPhotoDAO")
	public void setTechPhotoDAO(TechPhotoDAO techPhotoDAO) {
		this.techPhotoDAO = techPhotoDAO;
	}

	@Resource(name="userDAO")
	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

}
