<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/27
  Time: 11:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>新增Student</title>
</head>
<body>
<form action="/test/students" method="POST">
    <h2>id</h2>: <input type="text" name="id">
    <h3>name</h3>: <input type="text" name="name">
    <button type="submit">保存</button>
</form>
</body>
</html>
