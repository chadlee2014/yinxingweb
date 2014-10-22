package com.yinxing.dao;

import com.yinxing.common.BaseDAO;
import com.yinxing.model.Announcement;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("announcementDAO")
public class AnnouncementDAO extends BaseDAO<Announcement> {
	
	public String saveNewAnnouncement(Announcement announcement){
		save(announcement);
		return SUCCESS;
	}

	public String deleteAnnouncement(Announcement announcement){
		delete(announcement);
		
		return SUCCESS;
	}
	
	public List<Announcement> findIndexList(final Integer startIndex,
			final Integer Size){
		String queryString="from Announcement";
		return createResultForStartIndex(startIndex,Size,queryString);
	}
	
	public List<Announcement> findList(final Integer index, final Integer pageSize){
		String queryString="from Announcement";
		return createResult(index,pageSize,queryString);
		
	}
	
	public String updateAnnouncement(Announcement announcement){
		
		update(announcement);
		
		return SUCCESS;
	}
	
	public Announcement findAnnouncementById(int id){
		
		String queryString = "from Announcement where id=?";
		List<Announcement> result = createResult(queryString,id);
		Announcement announcement = result.get(0);
		return announcement;
		
	}
}
