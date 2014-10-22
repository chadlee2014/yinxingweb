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
    	<div class="more"><a target="content" href="loadMoreAnnouncement.action?userId=123&startIndex=1&size=15">more</a></div>
		<div id="carousel">
		 <s:iterator value="indexAnnouncementList"  status="temp" id="announcementItem">
		 	<div class="carousel-feature"><a target="content" href="loadAnnouncementById.action?announcementId=<s:property value='#announcementItem.id' /> "><img class="carousel-image" src="images/<s:property value='#announcementItem.photo'/>"></a></div>
		 </s:iterator>
  		</div>
	</div>
	<script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
		<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
		<script type="text/javascript" src="js/jquery.featureCarousel.js"></script> 
        <script type="text/javascript"> 
        				$(document).ready(function() {
					       	$("#carousel").featureCarousel({
								autoPlay:7000,
								trackerIndividual:false,
								trackerSummation:false,
								topPadding:50,
								smallFeatureWidth:.9,
								smallFeatureHeight:.9,
								sidePadding:0,
								smallFeatureOffset:0
							});
     					 });
        </script>

  </body>
</html>
