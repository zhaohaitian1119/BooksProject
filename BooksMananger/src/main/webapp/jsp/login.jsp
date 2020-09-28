<%--
  Created by IntelliJ IDEA.
  User: 39740
  Date: 2020/9/28
  Time: 14:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="/static/js/jquery-1.12.4.js"></script>
<body>
<form action="/dologin" method="post">
    <table border="1px" align="center">
        <tr align="center">
            <td colspan="2">
                <h3>图书借阅系统</h3>
            </td>
        </tr>
        <tr>
            <td>登陆账号:</td>
            <td><input type="text" name="code"></td>
        </tr>
        <tr>
            <td>登陆密码:</td>
            <td><input type="password" name="pwd"></td>
        </tr>
        <tr>
            <td colspan="2"  align="center">
                <input type="submit" value="登录">
                <input type="button" value="注册">
            </td>
        </tr>
    </table>
</form>
<p align="center" style="color: red">${error}</p>
<script>
    $("form").submit(function () {
        var code = $("[name = 'code']").val();
        var pwd = $("[name = 'pwd']").val();
        if(code == ""){
            alert("账户不能为空");
            return false;
        }
        if(pwd == ""){
            alert("密码不能为空");
            return false;
        }
        if(pwd.length < 6){
            alert("密码不能小于6位数");
            return false;
        }
        return true;
    })

</script>
</body>
</html>
