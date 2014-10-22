package com.yinxing.dao;

import com.yinxing.common.BaseDAO;
import com.yinxing.model.TechPhoto;
import org.springframework.stereotype.Component;

@Component("techPhotoDAO")
public class TechPhotoDAO extends BaseDAO<TechPhoto> {
	public String saveNewTechPhoto(TechPhoto techPhoto){
        save(techPhoto);
        return SUCCESS;
    }

    public String deleteTechPhoto(TechPhoto techPhoto){
        delete(techPhoto);
        return SUCCESS;
    }
    public String updateTechPhoto(TechPhoto techPhoto){

        update(techPhoto);

        return SUCCESS;
    }
}
