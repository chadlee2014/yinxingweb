package com.yinxing.dao;

import com.yinxing.common.BaseDAO;
import com.yinxing.model.Tech;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("techDAO")
public class TechDAO extends BaseDAO<Tech> {
	public String saveNewTech(Tech tech){
		save(tech);
		return SUCCESS;
	}

	public String deleteTech(Tech tech){
		delete(tech);
		
		return SUCCESS;
	}

	
	public List<Tech> findTechList(final Integer index, final Integer pageSize){
		String queryString="from Tech";
		return createResult(index,pageSize,queryString);
		
	}
	
	public String updateTech(Tech tech){
		
		update(tech);
		
		return SUCCESS;
	}
	
	public Tech findTechById(int id){
		
		String queryString = "from Tech where id=?";
		List<Tech> result = createResult(queryString,id);
		Tech tech = result.get(0);
		return tech;
		
	}

}
