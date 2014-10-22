<%@ page language="java" import="java.util.*"  pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>My JSP 'editAnnouncement.jsp' starting page</title>
    
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
  	
  		<form enctype="multipart/form-data" action="updateAnnouncement.action?announcementId=<s:property value='announcementId' />" class="announcementForm" method="post">
  			<label for="title">title</label>
	  		<div id="title"><input class="title" name="announcement.tittle" value="<s:property value='announcement.tittle'/>"></div>
	  		<label for="photo">photo</label>
	  		<div id="photo"><input name="announcementImg" class="photo" type="file" ></div>
	  		<label for="text">text</label>
	  		<div id="text"><input class="text" name="announcement.text" value="<s:property value='announcement.text'/>"></div>
	  		<label for="note">note</label>
	  		<div id="note"><input class="note" name="announcement.note" value="<s:property value='announcement.note'/>"></div>
	  		<div id="submit"><input type="submit" class="submit"></div>
  		</form>
  	</div>
  </body>
</html>
