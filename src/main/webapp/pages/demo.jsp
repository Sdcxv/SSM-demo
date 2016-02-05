<%--
  Created by IntelliJ IDEA.
  User: Sdcxv
  Date: 2016/2/5
  Time: 15:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <base href="<%=basePath%>">

    <title>My JSP 'demo.jsp' starting page</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->

</head>

<body>
<form action="demo!insert.action">
    姓名：<input name="name"><br>
    性别：<input type="radio" name="gender" value="1">男<input type="radio" name="gender" value="2">女<br>
    年龄：<input name="age" onkeyup="this.value=this.value.replace(/[^0-9]/g,'');"><br>
    <input type="submit" value="确定">
</form>
</body>
</html>
