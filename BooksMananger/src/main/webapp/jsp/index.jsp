<%--
  Created by IntelliJ IDEA.
  User: 吉俊烁
  Date: 2020/9/28
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<p style="color: red;" align="center">${error}</p>
<form action="/doIndex" method="post">
    <table border="px" align="center">
        <tr>
            <td colspan="2" style="font-size: 32px">图书借阅系统</td>
        </tr>
        <tr>
            <td>登录账号:</td>
            <td><input type="text" name="userCode"/></td>
        </tr>
        <tr>
            <td>登录密码:</td>
            <td><input type="password" name="password"/></td>
        </tr>
        <tr>
            <td colspan="2"><input type="submit" value="登录"/>
                <input type="button" value="注册用户"/>
            </td>
        </tr>
    </table>
</form>
</body>
</html>
