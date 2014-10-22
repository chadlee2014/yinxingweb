package com.yinxing.service;

import com.yinxing.common.BaseService;
import com.yinxing.model.Announcement;
import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;

@Component("announcementService")
public class AnnouncementService extends BaseService {
	
	public List<Announcement> getIndexList(int startIndex,int size){
		List<Announcement> indexList = getAnnouncementDAO().findIndexList(startIndex,size);
		return indexList;
	}
	
	public List<Announcement> getAnnouncementList(int index,int pageSize){
		List<Announcement> announcementList = getAnnouncementDAO().findList(index, pageSize);
		return announcementList;
	}
	
	public Announcement getAnnouncementById(int id){
		Announcement announcement = getAnnouncementDAO().findAnnouncementById(id);
		
		return announcement;
	}
	
	public String deleteAnnouncementById(int id){
		Announcement announcement = new Announcement();
		announcement.setId(id);
		getAnnouncementDAO().deleteAnnouncement(announcement);
		return SUCCESS;
		
	}
	
	public String addAnnouncement(Announcement announcement,File img) throws IOException {
		java.util.Date date = new java.util.Date();
		announcement.setDate(date);
		if(img!=null){
			String realpath = ServletActionContext.getServletContext().getRealPath("/images");
			String fileName = "";
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-ss-mm");
			String announcementDate=sdf.format(date);
			fileName = announcementDate+".png";
			File savefile = new File(realpath,fileName);
			if(!savefile.getParentFile().exists())
				savefile.getParentFile().mkdirs();
			FileUtils.copyFile(img, savefile);
			announcement.setPhoto(fileName);
		}
		
		return getAnnouncementDAO().saveNewAnnouncement(announcement);
	}
	
	public String editAnnouncement(Announcement announcement,File img,int id) throws IOException {
		java.util.Date date = new java.util.Date();
		announcement.setDate(date);
		announcement.setId(id);
		if(img!=null){
			String realpath = ServletActionContext.getServletContext().getRealPath("/images");
			String fileName = "";
			
			SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH-ss-mm");
			String announcementDate=sdf.format(date);
			fileName = announcementDate+".png";
			File savefile = new File(realpath,fileName);
			if(!savefile.getParentFile().exists())
				savefile.getParentFile().mkdirs();
			FileUtils.copyFile(img, savefile);
			announcement.setPhoto(fileName);
		}
		 return getAnnouncementDAO().updateAnnouncement(announcement);
		
		
	}
}
