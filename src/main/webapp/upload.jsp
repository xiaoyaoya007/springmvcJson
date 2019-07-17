<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/7/17
  Time: 11:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>--------------------单个上传---------------</h1>
<form method="post" enctype="multipart/form-data" action="upload.do">
    <input type="file" name="file"><br>
    <input type="submit">
</form>
<h1>--------------------批量上传---------------</h1>
<form method="post" enctype="multipart/form-data" action="uploads.do">
    <input type="file" name="file"><br>
    <input type="file" name="file"><br>
    <input type="file" name="file"><br>
    <input type="submit">
</form>
</body>
</html>
