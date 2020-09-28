<%--
  Created by IntelliJ IDEA.
  User: 沈建磊
  Date: 2020/9/28
  Time: 16:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="/static/js/jquery-1.12.4.js"></script>
</head>
<body>
<form method="post" action="/selectBook">
    图书分类:<select name="book_type">
    <option value="-1">--请选择--</option>
    <option value="1">小说</option>
    <option value="2">文学</option>
    <option value="3">传记</option>
    <option value="4">艺术</option>
    <option value="5">少儿</option>
    <option value="6">经济</option>
    <option value="7">管理</option>
    <option value="8">科技</option>
</select>
    &nbsp;&nbsp;&nbsp;图书名称:<input type="text" name="book_name" />
    &nbsp;&nbsp;&nbsp;是否借阅:<select name="is_borrow">
    <option value="-1">--请选择--</option>
    <option value="0">未借阅</option>
    <option value="1">已借阅</option>
</select>
    <input type="submit" value="查询" />
</form>
<p>当前用户:${users.userCode} <a href="/tuichu">退出</a></p>
<table border="1px" width="1000px">
    <tr>
        <td>图书编号</td>
        <td>图书分类</td>
        <td>图书名称</td>
        <td>作者</td>
        <td>出版社</td>
        <td>操作</td>
    </tr>

    <c:forEach items="${pageInfo.list}" var="item">
        <tr>
            <td>${item.bookCode}</td>
            <td>
                <c:if test="${item.bookType==1}">小说</c:if>
                <c:if test="${item.bookType==2}">文学</c:if>
                <c:if test="${item.bookType==3}">传记</c:if>
                <c:if test="${item.bookType==4}">艺术</c:if>
                <c:if test="${item.bookType==5}">少儿</c:if>
                <c:if test="${item.bookType==6}">经济</c:if>
                <c:if test="${item.bookType==7}">管理</c:if>
                <c:if test="${item.bookType==8}">科技</c:if>
            </td>
            <td>${item.bookName}</td>
            <td>${item.bookAtuthor}</td>
            <td>${item.publishPress}</td>
            <td>
                <c:if test="${item.isBorrow==0}"><a href="">申请借阅</a></c:if>
                <c:if test="${item.isBorrow==1}">已借阅</c:if>
            </td>
        </tr>
    </c:forEach>

</table>

<div>
    <a href="/selectBook?pageNum=${pageInfo.firstPage}">首页</a>
    <c:if test="${pageInfo.hasPreviousPage}">
        <a href="/selectBook?pageNum=${pageInfo.prePage}">上一页</a>
    </c:if>
    <c:forEach items="${pageInfo.navigatepageNums}" var="i">
        <a href="/selectBook?pageNum=${i}">${i}</a>
    </c:forEach>
    <c:if test="${pageInfo.hasNextPage}">
        <a href="/selectBook?pageNum=${pageInfo.nextPage}">下一页</a>
    </c:if>
    <a href="/selectBook?pageNum=${pageInfo.lastPage}">尾页</a>
</div>

</body>
</html>
<script type="text/javascript">
    $("tr:even").css("background-color","#ccc");
    $("tr:first").css("background-color","#666666");
</script>

