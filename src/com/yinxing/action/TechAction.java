package com.yinxing.action;

import com.yinxing.common.BaseAction;
import com.yinxing.model.Tech;
import com.yinxing.service.TechService;

import java.io.IOException;
import java.util.List;

public class TechAction extends BaseAction {
	private Tech tech;
	private int techId = -1;
	private TechService service = getTechService();
	private List<Tech> techList;
	private int index;
	
	public Tech getTech() {
		return tech;
	}

	public void setTech(Tech tech) {
		this.tech = tech;
	}

	public int getTechId() {
		return techId;
	}

	public void setTechId(int techId) {
		this.techId = techId;
	}

	public List<Tech> getTechList() {
		return techList;
	}

	public void setTechList(List<Tech> techList) {
		this.techList = techList;
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
	public String loadTechById(){

		tech = service.getTechById(techId);
		return SUCCESS;
	}
	
	/**
	 * 根据ID删除相应的项目
	 */
	public String deleteTech(){
		
		service.deleteTechById(techId);
		return SUCCESS;
	}
	
	/**
	 * 添加项目展示信息
	 * @throws java.io.IOException
	 */
	public String updateTech() throws IOException {
		
		if(techId==ADD){
			service.addTech(tech);
			return SUCCESS;
		}else{
			
			service.editTech(tech,techId);
			return SUCCESS;
		}
	}
	
	public String editTech(){
        if(techId != -1) {
            tech = service.getTechById(techId);
        }
			return SUCCESS;
	}
	
	public String loadTech(){
		techList = service.getTechList(index,PAGESIZE_TECH);
		return SUCCESS;
	}
	
}
