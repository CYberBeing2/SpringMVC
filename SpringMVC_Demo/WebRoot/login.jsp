<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
 <head>
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">
  <meta name="viewport"
        content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
  <title>Amaze UI Examples</title>
  <meta name="renderer" content="webkit">
  <meta http-equiv="Cache-Control" content="no-siteapp"/>
  <link rel="stylesheet" href="<%=basePath%>/css/amazeui.min.css">
  <link rel="stylesheet" href="<%=basePath%>/css/app.css">
</head>
<body>
<div class="am-g myapp-login">
	<div class="myapp-login-bg">
		  <div data-am-widget="tabs"
	       class="am-tabs am-tabs-d2"
	        >
	      <ul class="am-tabs-nav am-cf">
	          <li class="am-active">欢迎登录银行服务系统</li>
	      </ul>
	      <div class="am-tabs-bd">
	          <div data-tab-panel-0 class="am-tab-panel am-active">
				<form action="${pageContext.request.contextPath }/login.action" class="am-form" method="post">
					<fieldset>
						<div class="am-form-group">
						<label for="doc-vld-name">User Name</label>
						<input type="text" id="doc-vld-name" name="username" minlength="3" placeholder="请输入账号" class="am-form-field" required/>
						</div>
						<div class="am-form-group">
						<label for="doc-vld-name">Password</label>
						<input type="password" id="doc-vld-name"  name="password" minlength="3" placeholder="请输入密码" class="am-form-field" required/>
						</div>			
						<div class="am-form-group">
					 <label for="doc-vld-name">登陆类别:</label>
				     <label><input type="radio"  name="mark"  value ="1" minlength="3" class="am-form-field" checked="checked"/>	管理员</label>   
				     <label><input type="radio"  name="mark"  value ="2"  minlength="3" class="am-form-field" />	客户</label>   
						
						</div>
						<button class="myapp-login-button am-btn am-btn-secondary" type="submit">登陆</button>
					</fieldset>
					<legend>遇到问题请联系：13834677911</legend>
				</form>
	          </div>
	          <div data-tab-panel-1 class="am-tab-panel ">
				</form>
	          </div>
	        
	      </div>
	  </div>
	</div>
</div>
</body>
</html>