package com.yinxing.action;

import com.yinxing.common.BaseAction;
import com.yinxing.model.Message;
import com.yinxing.service.MessageService;

import java.io.IOException;
import java.util.List;

/**
 * Created by chadlee on 9/11/14.
 */
public class MessageAction extends BaseAction {
	private Message message;
	private int messageId = -1;
	private MessageService service = getMessageService();
	private List<Message> messageList;
	private int index;

	
	public Message getMessage() {
		return message;
	}

	public void setMessage(Message message) {
		this.message = message;
	}

	public int getMessageId() {
		return messageId;
	}

	public void setMessageId(int messageId) {
		this.messageId = messageId;
	}

	public List<Message> getMessageList() {
		return messageList;
	}

	public void setMessageList(List<Message> messageList) {
		this.messageList = messageList;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}
	/**
	 * 根据ID删除相应的项目
	 */
	public String deleteMessage(){
		
		service.deleteMessageById(messageId);
		return SUCCESS;
	}
	
	/**
	 * 添加项目展示信息
	 * @throws java.io.IOException
	 */
	public String addMessage() throws IOException {
			service.addMessage(message);
			return SUCCESS;
		
	}
	
	public String loadMessage(){
		messageList = service.getMessageList(index,PAGESIZE_PROJECT);
		return SUCCESS;
	}
	
}
