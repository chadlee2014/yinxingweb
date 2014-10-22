package com.yinxing.service;

import com.yinxing.common.BaseService;
import com.yinxing.model.Tech;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;
import java.util.List;

@Component("techService")
public class TechService extends BaseService {
	public List<Tech> getTechList(int index,int pageSize){
		List<Tech> techList = getTechDAO().findTechList(index, pageSize);
		return techList;
	}
	
	public Tech getTechById(int id){
		Tech tech = getTechDAO().findTechById(id);
		
		return tech;
	}
	
	public String deleteTechById(int id){
		Tech tech = new Tech();
		tech.setId(id);
		getTechDAO().deleteTech(tech);
		return SUCCESS;
		
	}
	
	public String addTech(Tech tech) throws IOException {
		Date date = new Date();
		tech.setDate(date);
	
		
		return getTechDAO().saveNewTech(tech);
	}
	
	public String editTech(Tech tech,int id) throws IOException {
		Date date = new Date();
		tech.setId(id);
		tech.setDate(date);
		
		 return getTechDAO().updateTech(tech);
		
		
	}
}
