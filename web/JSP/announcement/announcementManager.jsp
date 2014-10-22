<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>loadIndex</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="css/style.css" rel="stylesheet" type="text/css" />
	<link href="css/announcement.css" rel="stylesheet" type="text/css" />
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
    <div id="mainInfo">
    <div class="addAnnouncement"><a target="content" href="editAnnouncement.action?announcementId=<s:property value='announcementId' /> ">添加公告</a></div>
		 <s:iterator value="indexAnnouncementList"  status="temp" id="announcementItem">
		 	<s:if test='1!="5"'>
		 		<div class="announcementItem1"><a target="content" href="loadAnnouncementById.action?announcementId=<s:property value='#announcementItem.id' /> "><img class="announcement-img" src="images/<s:property value='#announcementItem.photo'/>"></a>
		 			<div class="announcementEdit"><a target="content" href="editAnnouncement.action?announcementId=<s:property value='#announcementItem.id' /> ">编辑</a></div>
		 			<div class="announcementDelete"><a target="content" href="deleteAnnouncement.action?announcementId=<s:property value='#announcementItem.id' /> ">删除</a></div>
		 		</div>
		 	</s:if>
		 	<%-- <s:else>
		 		<div class="announcementItem1"><a target="content" href="loadAnnouncementById.action?announcementId=<s:property value='#announcementItem.id' /> "><img class="announcement-img" src="<s:property value='#announcementItem.photo'/>"></a></div>
		 		<s:if test='userRight==1'>
		 			<div class="announcementEdit">编辑</div>
		 			<div class="announcementDelete">删除</div>
		 		</s:if>
		 	</s:else> --%>
		 	
		 </s:iterator>
  	</div>
	
  </body>
</html>
