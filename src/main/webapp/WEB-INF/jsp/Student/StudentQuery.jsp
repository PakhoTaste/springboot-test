<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/27
  Time: 17:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<span>id</span> : <input type="text" readonly value="${s.id}" name="id">
<span>name</span>: <input type="text" readonly value="${s.name}" name="name">
<br>
<button type="button" onclick="history.back();">返回</button>
</body>
</html>
