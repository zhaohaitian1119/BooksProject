<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script src="/static/js/jquery-1.12.4.js"></script>
</head>
<body>
<h1>图书借阅系统</h1>
<form method="post" action="/doLogin">
    <p>登录账号:<input type="text" name="user_code" /></p>
    <p>登录密码:<input type="password" name="password" /></p>
    <p><input type="submit" value="登录" /><a href="/jsp/addUser.jsp"><input type="button" value="注册用户" /></a></p>
    <p style="font-size: 20px;color: red;">${loginmsg}</p>
</form>
</body>
</html>
<script type="text/javascript">
    $("form").submit(function () {
        var password=$("[name=password]").val();
        if(password.length<7){
            alert("密码长度必须是7位");
            return false;
        }

    })

</script>
