package com.yinxing.service;

import com.yinxing.common.BaseService;
import com.yinxing.model.Message;
import org.springframework.stereotype.Component;

import java.util.List;

@Component("messageService")
public class MessageService extends BaseService {
	public List<Message> getMessageList(int index,int pageSize){
		List<Message> messageList = getMessageDAO().findMessageList(index, pageSize);
		return messageList;
	}
	
	public String deleteMessageById(int id){
		Message message = new Message();
		message.setId(id);
		getMessageDAO().deleteMessage(message);
		return SUCCESS;
		
	}
	
	public String addMessage(Message message){
		return getMessageDAO().saveMessage(message);
	}
}
