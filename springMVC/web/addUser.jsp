<%--
  Created by IntelliJ IDEA.
  User: RogerLin
  Date: 2021/6/8
  Time: 1:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="utf-8" language="java" %>
<html>
<head>
    <title>addUser</title>
</head>
<body>
<form action="/addUser" method="post">
    用户名：<input type="text" name="username" value="lili" />
    id:<input type="text" name="id" value="23"/>
    性别：<input type="text" name="sex" value="man"/>
    年龄：<input type="text" name="age" value="235"/>
    <input type="submit" value="addUser"/>
</form>
</body>
</html>
