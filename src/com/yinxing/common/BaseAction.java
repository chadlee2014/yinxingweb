package com.yinxing.common;

import com.opensymphony.xwork2.ActionSupport;
import com.yinxing.service.*;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BaseAction extends ActionSupport {
	protected static final String SUCCESS = "success";
	protected static final String FALSE = "false";
	protected static final int PAGESIZE_PROJECT = 9;
	protected static final int PAGESIZE_ANNOUNCEMENT = 9;
	protected static final int PAGESIZE_TECH = 9;
	protected static final int PAGESIZE_MESSAGEBOARD = 9;
	
	/*
	 * 需要添加的对象ID为-1
	 */
	protected static final int ADD = -1;
	
	/*
	 * 
	 */
	private static ClassPathXmlApplicationContext ctx;
	static {
		ctx = new ClassPathXmlApplicationContext("beans.xml");
	}

	protected AnnouncementService getAnnouncementService() {
		return (AnnouncementService) ctx.getBean("announcementService");
	}
	
	protected MessageService getMessageService(){
		return (MessageService)ctx.getBean("messageService");
	}
	
	protected ProjectPhotoService getProjectPhotoService(){
		return (ProjectPhotoService)ctx.getBean("projectPhotoService");
	}
	
	protected ProjectService getProjectService(){
		return (ProjectService) ctx.getBean("projectService");
	}
	
	protected TechPhotoService getTechPhotoService(){
		return (TechPhotoService) ctx.getBean("techPhotoService");
	}
	
	protected TechService getTechService(){
		return (TechService) ctx.getBean("techService");
	}
	
	protected UserService getUserService(){
		return (UserService) ctx.getBean("userService");
	}
}
