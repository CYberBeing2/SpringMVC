<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
      <meta charset="utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>用户主页</title>
	<!-- BOOTSTRAP STYLES-->
    <link href="<%=basePath%>/assets/css/bootstrap.css" rel="stylesheet" />
     <!-- FONTAWESOME STYLES-->
    <link href="<%=basePath%>/assets/css/font-awesome.css" rel="stylesheet" />
        <!-- CUSTOM STYLES-->
    <link href="<%=basePath%>/assets/css/custom.css" rel="stylesheet" />
     <!-- GOOGLE FONTS-->
  <!--  <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' /> -->
</head>
<body>
    <div id="wrapper">
         <div class="navbar navbar-inverse navbar-fixed-top">
            <div class="adjust-nav">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                    </button>
               
                   <span class="logout-spn" > ${username},欢迎您！</span>
                
                </div>
                 <c:if test="${username!=null }">
                 <span class="logout-spn" >
                  <a href="${pageContext.request.contextPath }/logout.action" style="color:#fff;">退出登陆</a>  

                </span>
                  </c:if>     
            </div>
        </div>
        
         <!-- /. NAV TOP  -->
        <nav class="navbar-default navbar-side" role="navigation">
            <div class="sidebar-collapse">
                <ul class="nav" id="main-menu">
                     <li> 
                       <a href="${pageContext.request.contextPath }/selectBankCardByFK.action"><i class="fa fa-desktop "></i>我的银行卡 <span class="badge"></span></a>
                    </li>
                   
                    <li class="active-link">
                        <a href="${pageContext.request.contextPath }/transferBefore.action"><i class="fa fa-table "></i>转账 <span class="badge"></span></a>
                    </li>
                    <li>
<a href="${pageContext.request.contextPath }/selectTransferBefore.action"><i class="fa fa-edit "></i>查询账单 <span class="badge"></span></a>                    </li>
                </ul>
                            </div>
        </nav>
        <!-- /. NAV SIDE  -->
        <div id="page-wrapper" >
          <div id="page-inner">
                <div class="row">
                    <div class="col-md-12">
                        <h2>转账结果</h2>
                    </div>
                </div>                 
       <div>转账成功！</div>
        </div>    
        <div class="footer">
             <div class="row">
                <div class="col-lg-12" >
                    &copy;  2014 yourdomain.com | Design More Templates <a href="http://www.cssmoban.com/" target="_blank" title="模板之家">模板之家</a> - Collect from <a href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
                </div>
        </div>
        </div>
</body>
