package com.yinxing.dao;

import com.yinxing.common.BaseDAO;
import com.yinxing.model.Project;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("projectDAO")
public class ProjectDAO extends BaseDAO<Project> {

	public String saveNewProject(Project project){
		save(project);
		return SUCCESS;
	}

	public String deleteProject(Project project){
		delete(project);
		
		return SUCCESS;
	}

	
	public List<Project> findProjectList(final Integer index, final Integer pageSize){
		String queryString="from Project";
		return createResult(index,pageSize,queryString);
		
	}
	
	public String updateProject(Project project){
		
		update(project);
		
		return SUCCESS;
	}
	
	public Project findProjectById(int id){
		
		String queryString = "from project where id=?";
		List<Project> result = createResult(queryString,id);
		Project project = result.get(0);
		return project;
		
	}

}
