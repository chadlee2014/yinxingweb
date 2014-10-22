package com.yinxing.action;

import com.yinxing.common.BaseAction;
import com.yinxing.model.Project;
import com.yinxing.service.ProjectService;

import java.io.IOException;
import java.util.List;


public class ProjectAction extends BaseAction {
	private Project project;
	private int projectId = -1;
	private ProjectService service = getProjectService();
	private List<Project> projectList;
	private int index;

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}

	public int getProjectId() {
		return projectId;
	}

	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}

	public List<Project> getProjectList() {
		return projectList;
	}

	public void setProjectList(List<Project> projectList) {
		this.projectList = projectList;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	/**
	 * 根据点击图片所属ID返回相应的项目细节
	 * @return
	 */
	public String loadProjectById(){

		project = service.getProjectById(projectId);
		return SUCCESS;
	}
	
	/**
	 * 根据ID删除相应的项目
	 */
	public String deleteProject(){
		
		service.deleteProjectById(projectId);
		return SUCCESS;
	}
	
	/**
	 * 添加项目展示信息
	 * @throws java.io.IOException
	 */
	public String updateProject() throws IOException {
		
		if(projectId==ADD){
			service.addProject(project);
			return SUCCESS;
		}else{
			
			service.editProject(project,projectId);
			return SUCCESS;
		}
	}
	
	public String editProject(){
        if(projectId != -1) {
            project = service.getProjectById(projectId);
        }
			return SUCCESS;
	}
	
	public String loadProject(){
		projectList = service.getProjectList(index,PAGESIZE_PROJECT);
		return SUCCESS;
	}
	
}
