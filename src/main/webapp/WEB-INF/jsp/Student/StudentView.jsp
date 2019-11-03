<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2019/10/27
  Time: 0:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px black solid">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>修改</td>
        <td>删除</td>
    </tr>
    <c:forEach items="${page.list}" var="s"  >
        <tr>
            <td>${s.id}</td>
            <td>${s.name}</td>
            <td><a href="/test/perpareUpdate?id=${s.id}">修改</a></td>
            <td><a class="delete" href="/test/student/delete?id=${s.id}">删除</a></td>
        </tr>
    </c:forEach>

</table>
<br>
<div>
    <a href="?start=1">[首  页]</a>
    <a href="?start=${page.pageNum-1}">[上一页]</a>
    <a href="?start=${page.pageNum+1}">[下一页]</a>
    <a href="?start=${page.pages}">[末  页]</a>
</div>
<br>
<form action="/test/perpareInsert">
    <input type="submit"  value="新增" />
</form>
<form action="/test/query" method="get">
    <input type="text" placeholder="请输入ID查询" name="id">
    <input type="submit" value="查询" />
</form>

<form id="formdelete" action="" method="POST">
    <input type="hidden" value="DELETE" name="_method">
</form>

</body>

</html>

<script src="js/jquery-3.3.1.min.js">
    $(function (){
        $(".delete").click(function(){
            debugger;
            var $href = $(this).attr("href");
            $("#formdelete").attr("action",$href).submit();
            return false;
        });
    });

</script>
