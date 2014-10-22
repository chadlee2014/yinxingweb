package com.yinxing.service;

import com.yinxing.common.BaseService;
import com.yinxing.model.TechPhoto;
import org.springframework.stereotype.Component;

import java.io.IOException;

@Component("techPhotoService")
public class TechPhotoService extends BaseService {
	   public String deleteTechPhotoById(int id){
	        TechPhoto techPhoto = new TechPhoto();
	        techPhoto.setId(id);
	        getTechPhotoDAO().deleteTechPhoto(techPhoto);
	        return SUCCESS;
	    }
	    public String addTechPhoto(TechPhoto techPhoto) throws IOException {
	        return getTechPhotoDAO().saveNewTechPhoto(techPhoto);
	    }

	    public String editTech(TechPhoto techPhoto,int id) throws IOException {
	        techPhoto.setId(id);
	        return getTechPhotoDAO().updateTechPhoto(techPhoto);
	    }
}
