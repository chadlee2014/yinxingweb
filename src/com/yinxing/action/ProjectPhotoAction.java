package com.yinxing.action;

import com.yinxing.common.BaseAction;
import com.yinxing.model.ProjectPhoto;
import com.yinxing.service.ProjectPhotoService;

/**
 * Created by chadlee on 9/11/14.
 */
public class ProjectPhotoAction extends BaseAction {
    private ProjectPhoto projectPhoto;
    private int projectId = -1;
    private ProjectPhotoService service = getProjectPhotoService();

    public ProjectPhoto getProject() {
        return projectPhoto;
    }

    public void setProject(ProjectPhoto project) {
        this.projectPhoto = project;
    }

    public int getProjectId() {
        return projectId;
    }

    public void setProjectId(int projectId) {
        this.projectId = projectId;
    }

    public ProjectPhotoService getService() {
        return service;
    }

    public void setService(ProjectPhotoService service) {
        this.service = service;
    }


}
