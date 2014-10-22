package com.yinxing.action;

import com.yinxing.common.BaseAction;
import com.yinxing.model.Announcement;
import com.yinxing.service.AnnouncementService;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class AnnouncementAction extends BaseAction {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4854667595320296313L;
	private AnnouncementService service = getAnnouncementService();
	private File announcementImg;
	private String announcementImgFileName;
	private String announcementImgContentType;
	private List<Announcement> indexAnnouncementList;
	private Announcement announcement;
	private int startIndex;
	private int size;
	private int index;
	private int pageSize;
	private int announcementId = -1;
	private int userId = -1;
	public File getAnnouncementImg() {
		return announcementImg;
	}

	public void setAnnouncementImg(File announcementImg) {
		this.announcementImg = announcementImg;
	}
	public String getAnnouncementImgFileName() {
		return announcementImgFileName;
	}

	public void setAnnouncementImgFileName(String announcementImgFileName) {
		this.announcementImgFileName = announcementImgFileName;
	}

	public String getAnnouncementImgContentType() {
		return announcementImgContentType;
	}

	public void setAnnouncementImgContentType(String announcementImgContentType) {
		this.announcementImgContentType = announcementImgContentType;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getAnnouncementId() {
		return announcementId;
	}

	public void setAnnouncementId(int announcementId) {
		this.announcementId = announcementId;
	}

	public int getStartIndex() {
		return startIndex;
	}

	public void setStartIndex(int startIndex) {
		this.startIndex = startIndex;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Announcement getAnnouncement() {
		return announcement;
	}

	public void setAnnouncement(Announcement announcement) {
		this.announcement = announcement;
	}

	public List<Announcement> getIndexAnnouncementList() {
		return indexAnnouncementList;
	}

	public void setIndexAnnouncementList(List<Announcement> indexAnnouncementList) {
		this.indexAnnouncementList = indexAnnouncementList;
	}

	
	

	/**
	 * 加载index的时候调用，获取首页公告信息
	 * 传入信息只有ID、图片和标题
	 * @return
	 */
	public String loadIndexInfo(){
		indexAnnouncementList = service.getIndexList(startIndex,size);

		return SUCCESS;
	}
	
	/**
	 * 根据点击图片所属ID返回相应的公告细节，由index页面调用
	 * @return
	 */
	public String loadAnnouncementById(){

		announcement = service.getAnnouncementById(announcementId);
		return SUCCESS;
	}
	
	/**
	 * 根据ID删除相应的公告，有annoucementManager调用
	 */
	public String deleteAnnouncement(){
		service.deleteAnnouncementById(announcementId);
		return SUCCESS;
	}
	
	/**
	 * 添加公告信息
	 * @throws java.io.IOException
	 */
	public String updateAnnouncement() throws IOException {
		
		if(announcementId==ADD){
			service.addAnnouncement(announcement,announcementImg);
			return SUCCESS;
		}else{
			
			service.editAnnouncement(announcement,announcementImg,announcementId);
			return SUCCESS;
		}
		
		
	}
	
	public String editAnnouncement(){
        if(announcementId != -1) {
            announcement = service.getAnnouncementById(announcementId);
        }
			return SUCCESS;
	}
	
	public String loadMoreAnnouncement(){
		indexAnnouncementList = service.getAnnouncementList(index,PAGESIZE_ANNOUNCEMENT);
		return SUCCESS;
	}
	

}
