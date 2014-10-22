<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<div id="top-menu">

    	<div id="menu">
				<ul id="sdt_menu" class="sdt_menu">
				<li>
					<a href="<%=basePath%>loadIndex.action?startIndex=1&size=6" target="content">
						<img src="images/publicResource/menu/2.jpg" alt=""/>
						<span class="sdt_active"></span>
						<span class="sdt_wrap">
							<span class="sdt_link">首页</span>
							<span class="sdt_descr">home page</span>
						</span>
					</a>
				</li>
				<li>
					<a href="<%=basePath%>loadTech.action?index=1" target="content">
						<img src="images/publicResource/menu/1.jpg" alt=""/>
						<span class="sdt_active"></span>
						<span class="sdt_wrap">
							<span class="sdt_link">技术交流</span>
							<span class="sdt_descr">knowledge exchange</span>
						</span>
					</a>
					
				</li>
				<li>
					<a href="<%=basePath%>loadProject.action?index=1" target="content">
						<img src="images/publicResource/menu/3.jpg" alt=""/>
						<span class="sdt_active"></span>
						<span class="sdt_wrap">
							<span class="sdt_link">项目展示</span>
							<span class="sdt_descr">our project</span>
						</span>
					</a>
				</li>
				<li>
					<a href="<%=basePath%>loadAboutUs.action" target="content">
						<img src="images/publicResource/menu/4.jpg" alt=""/>
						<span class="sdt_active"></span>
						<span class="sdt_wrap">
							<span class="sdt_link">关于我们</span>
							<span class="sdt_descr">about us</span>
						</span>
					</a>
				</li>
				<li>
					<a href="<%=basePath%>loadMessageBoard.action?index=1" target="content">
						<img src="images/publicResource/menu/6.jpg" alt=""/>
						<span class="sdt_active"></span>
						<span class="sdt_wrap">
							<span class="sdt_link">留言板</span>
							<span class="sdt_descr">message board</span>
						</span>
					</a>
				</li>
			</ul>
        </div>
	</div>
	<div id="blank1">
    <div class="register"><a href="#">|注册</a></div>
    <div class="login"><a href="#">登陆</a></div>
    </div>
    <!-- The JavaScript -->
        <script type="text/javascript" src="js/jquery-1.4.2.min.js"></script>
		<script type="text/javascript" src="js/jquery.easing.1.3.js"></script>
		<script type="text/javascript" src="js/jquery.featureCarousel.js"></script> 
        <script type="text/javascript">
            $(function() {
				/**
				* for each menu element, on mouseenter, 
				* we enlarge the image, and show both sdt_active span and 
				* sdt_wrap span. If the element has a sub menu (sdt_box),
				* then we slide it - if the element is the last one in the menu
				* we slide it to the left, otherwise to the right
				*/
                $('#sdt_menu > li').bind('mouseenter',function()
				{
					var $elem = $(this);
					$elem.find('img')
						 .stop()
						 .animate({
							'width':'170px',
							'height':'170px',
							'left':'0px'},400,'easeOutBack')
						 $(this)
						 .find('.sdt_wrap')
					     .stop(true)
						 .animate({'top':'140px'},500,'easeOutBack')
						 .andSelf()
						 .find('.sdt_active')
					     .stop(false)
						 .animate({'height':'170px'},300,function(){
								var $sub_menu = $elem.find('.sdt_box');
								if($sub_menu.length){
									var left = '170px';
									if($elem.parent().children().length == $elem.index()+1)
										left = '-170px';
									$sub_menu.show().animate({'left':left},200);
									}	
								});
				}).bind('mouseleave',function(){
					var $elem = $(this);
					var $sub_menu = $elem.find('.sdt_box');
					if($sub_menu.length)
						$sub_menu.hide().css('left','0px');
					
					$elem.find('.sdt_active')
						 .stop(true)
						 .animate({'height':'0px'},300)
						 .andSelf().find('img')
						 .stop(true)
						 .animate({
							'width':'0px',
							'height':'0px',
							'left':'85px'},400)
						 .andSelf()
						 .find('.sdt_wrap')
						 .stop(true)
						 .animate({'top':'25px'},500);
				});
            });
        </script>
