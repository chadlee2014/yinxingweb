package com.yinxing.dao;

import com.yinxing.common.BaseDAO;
import com.yinxing.model.ProjectPhoto;
import org.springframework.stereotype.Component;

@Component("projectPhotoDAO")
public class ProjectPhotoDAO extends BaseDAO<ProjectPhoto> {
    public String saveNewProjectPhoto(ProjectPhoto projectPhoto){
        save(projectPhoto);
        return SUCCESS;
    }

    public String deleteProjectPhoto(ProjectPhoto projectPhoto){
        delete(projectPhoto);
        return SUCCESS;
    }
    public String updateProjectPhoto(ProjectPhoto projectPhoto){

        update(projectPhoto);

        return SUCCESS;
    }
}
