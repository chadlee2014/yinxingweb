package com.yinxing.service;

import com.yinxing.common.BaseService;
import com.yinxing.model.Project;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Date;
import java.util.List;

@Component("projectService")
public class ProjectService extends BaseService {

	public List<Project> getProjectList(int index,int pageSize){
		List<Project> projectList = getProjectDAO().findProjectList(index, pageSize);
		return projectList;
	}
	
	public Project getProjectById(int id){
		Project project = getProjectDAO().findProjectById(id);
		
		return project;
	}
	
	public String deleteProjectById(int id){
		Project project = new Project();
		project.setId(id);
		getProjectDAO().deleteProject(project);
		return SUCCESS;
		
	}
	
	public String addProject(Project project) throws IOException {
		Date date = new Date();
		project.setDate(date);
	
		
		return getProjectDAO().saveNewProject(project);
	}
	
	public String editProject(Project project,int id) throws IOException {
		Date date = new Date();
		project.setId(id);
		project.setDate(date);
		
		 return getProjectDAO().updateProject(project);
		
		
	}

}
