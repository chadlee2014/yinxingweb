<%@ page language="java" import="java.util.*"  pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

  	<div id="mainInfo">
  	
  			<label for="title">title</label>
	  		<div id="title"><s:property value="announcement.tittle"/></div>
	  		<label for="text">text</label>
	  		<div id="text"><s:property value="announcement.text"/></div>
  	</div>
