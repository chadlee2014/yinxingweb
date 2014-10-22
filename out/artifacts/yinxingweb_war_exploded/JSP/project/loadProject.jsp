<%@ page language="java" import="java.util.*"  pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags" %>

<div id="mainInfo">
    <div class="addAnnouncement"><a target="content" href="editProject.action ">添加项目</a></div>
    <s:iterator value="projectList"  status="temp" id="projectItem">
    <s:if test='1!="5"'>
    <div class="announcementItem1"><a target="content" href="loadProjectById.action?projectId=<s:property value='#projectItem.id' /> "><img class="announcement-img" src="images/<s:property value='#announcementItem.photo'/>"></a>
    <div class="announcementEdit"><a target="content" href="editProject.action?projectId=<s:property value='#projectItem.id' /> ">编辑</a></div>
    <div class="announcementDelete"><a target="content" href="deleteProject.action?projectId=<s:property value='#projectItem.id' /> ">删除</a></div>
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
