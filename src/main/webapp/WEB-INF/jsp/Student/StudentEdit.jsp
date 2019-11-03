<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/27
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改Student</title>
</head>
<body>
<form action="/test/students/update" method="post" >
    <span>id</span>: <input type="text" value="${id}" name="id">
    <span>name</span>: <input type="text" value="${name}" name="name">
    <br>
    <button type="submit">提交</button>
</form>


</body>
</html>
