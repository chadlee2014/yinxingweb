package com.yinxing.service;

import com.yinxing.common.BaseService;
import com.yinxing.model.ProjectPhoto;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component("projectPhotoService")
public class ProjectPhotoService extends BaseService {
    public String deleteProjectPhotoById(int id){
        ProjectPhoto projectPhoto = new ProjectPhoto();
        projectPhoto.setId(id);
        getProjectPhotoDAO().deleteProjectPhoto(projectPhoto);
        return SUCCESS;

    }
    public String addProjectPhoto(ProjectPhoto projectPhoto) throws IOException {

        return getProjectPhotoDAO().saveNewProjectPhoto(projectPhoto);
    }

    public String editProject(ProjectPhoto projectPhoto,int id) throws IOException {

        projectPhoto.setId(id);
        return getProjectPhotoDAO().updateProjectPhoto(projectPhoto);
    }
}
