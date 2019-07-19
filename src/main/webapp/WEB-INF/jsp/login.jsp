<%--
  Created by IntelliJ IDEA.
  User: jiangxiaoyao
  Date: 2019/7/17
  Time: 21:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="script" uri="http://www.springframework.org/tags" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="login2.do">
    <script:message code="username" />:<input name="username"><br>
    <input type="submit">
</form>
<a href="?locale=zh_CN">中文</a>
<a href="?locale=en">英文</a>
</body>
</html>
