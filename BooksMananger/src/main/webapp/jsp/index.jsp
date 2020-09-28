<%--
  Created by IntelliJ IDEA.
  User: 39740
  Date: 2020/9/28
  Time: 14:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<script src="/static/js/jquery-1.12.4.js"></script>
<body>
<form action="/selAll" method="post">
    <table border="1px" width="650px">
        <tr align="center">
            <td colspan="6">
                <h3>图书借阅系统</h3>
            </td>
        </tr>
        <tr align="center">
            <td colspan="2">
                图书分类:
                <select name="bookType">
                    <option value="0">--请选择--</option>
                    <c:if test="${bookType == 1}"><option value="1" selected>小说</option></c:if> <c:if test="${bookType != 1}"><option value="1">小说</option></c:if>
                    <c:if test="${bookType == 2}"><option value="2" selected>文学</option></c:if> <c:if test="${bookType != 2}"><option value="2">文学</option></c:if>
                    <c:if test="${bookType == 3}"><option value="3" selected>传记</option></c:if> <c:if test="${bookType != 3}"><option value="3">传记</option></c:if>
                    <c:if test="${bookType == 4}"><option value="4" selected>艺术</option></c:if> <c:if test="${bookType != 4}"><option value="4">艺术</option></c:if>
                    <c:if test="${bookType == 5}"><option value="5" selected>少儿</option></c:if> <c:if test="${bookType != 5}"><option value="5">少儿</option></c:if>
                    <c:if test="${bookType == 6}"><option value="6" selected>经济</option></c:if> <c:if test="${bookType != 6}"><option value="6">经济</option></c:if>
                    <c:if test="${bookType == 7}"><option value="7" selected>管理</option></c:if> <c:if test="${bookType != 7}"><option value="7">管理</option></c:if>
                    <c:if test="${bookType == 8}"><option value="8" selected>科技</option></c:if> <c:if test="${bookType != 8}"><option value="8">科技</option></c:if>
                </select>
            </td>
            <td colspan="2">
                图书名称:
                <input type="text" name="bookName" value="${bookName}">
            </td>
            <td colspan="2">
                是否借阅:
                <select name="isBorrow">
                    <option value="2">--请选择--</option>
                    <c:if test="${isBorrow == 0}">
                        <option value="0" selected>未借阅</option>
                    </c:if>
                    <c:if test="${isBorrow != 0}">
                        <option value="0" >未借阅</option>
                    </c:if>
                    <c:if test="${isBorrow == 1}">
                        <option value="1" selected>已借阅</option>
                    </c:if>
                    <c:if test="${isBorrow != 1}">
                        <option value="1">已借阅</option>
                    </c:if>
                </select>
                <input type="submit" value="查询">
            </td>
        </tr>
        <tr>
            <td colspan="6" align="right">
                当前用户:${userCode}
                <a href="#" onclick="back()">退出</a>
            </td>
        </tr>
        <tr align="center">
            <td>图书编号</td>
            <td>图书分类</td>
            <td>图书名称</td>
            <td>作者</td>
            <td>出版社</td>
            <td>操作</td>
        </tr>
        <c:if test="${flag == 'false'}">
            <c:forEach items="${pageInfo.list}" var="item">
                <tr align="center">
                    <td>${item.bookCode}</td>
                    <td>
                        <c:if test="${item.bookType == 1}">小说</c:if>
                        <c:if test="${item.bookType == 2}">文学</c:if>
                        <c:if test="${item.bookType == 3}">传记</c:if>
                        <c:if test="${item.bookType == 4}">艺术</c:if>
                        <c:if test="${item.bookType == 5}">少儿</c:if>
                        <c:if test="${item.bookType == 6}">经济</c:if>
                        <c:if test="${item.bookType == 7}">管理</c:if>
                        <c:if test="${item.bookType == 8}">科技</c:if>
                    </td>
                    <td>${item.bookName}</td>
                    <td>${item.bookAtuthor}</td>
                    <td>${item.publishPress}</td>
                    <td>
                        <c:if test="${item.isBorrow == 0}">
                            <a href="#">申请借阅</a>
                        </c:if>
                        <c:if test="${item.isBorrow == 1}">
                            <a href="#" style="color: red">已借阅</a>
                        </c:if>
                    </td>
                </tr>
            </c:forEach>
        </c:if>
        <c:if test="${flag == 'true'}">
            <tr align="center">
                <td colspan="6">${msg}</td>
            </tr>
        </c:if>
    </table>
</form>
<script>
    function back() {
        var flag = confirm("是否退出系统");
        if(flag == true){
            location.href="/jsp/login.jsp"
        }
    }
</script>
<div>
    <a href="/selAll?pageNum=${pageInfo.firstPage}">首页</a>
    <c:if test="${pageInfo.hasPreviousPage}">
        <a href="/selAll?pageNum=${pageInfo.prePage}">上一页</a>
    </c:if>
    <c:forEach items="${pageInfo.navigatepageNums}" var="i">
        <a href="/selAll?pageNum=${i}">${i}</a>
    </c:forEach>
    <c:if test="${pageInfo.hasNextPage}">
        <a href="/selAll?pageNum=${pageInfo.nextPage}">下一页</a>
    </c:if>
    <a href="/selAll?pageNum=${pageInfo.lastPage}">尾页</a>
</div>
</body>
</html>

