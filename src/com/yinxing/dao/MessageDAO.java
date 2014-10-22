package com.yinxing.dao;

import com.yinxing.common.BaseDAO;
import com.yinxing.model.Message;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("messageDAO")
public class MessageDAO extends BaseDAO<Message> {
	public String saveMessage(Message message){
		save(message);
		return SUCCESS;
	}

	public String deleteMessage(Message message){
		delete(message);
		
		return SUCCESS;
	}
	public List<Message> findMessageList(final Integer index, final Integer pageSize){
		String queryString="from Message";
		return createResult(index,pageSize,queryString);
		
	}
}
