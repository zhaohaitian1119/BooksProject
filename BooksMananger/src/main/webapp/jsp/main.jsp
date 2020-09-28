<%--
  Created by IntelliJ IDEA.
  User: 吉俊烁
  Date: 2020/9/28
  Time: 15:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px">
    <tr>
        <td colspan="6" align="center" style="font-size: 32px;">图书借阅系统</td>
    </tr>
    <form action="/Usersel" method="post">
        <tr>
            <td colspan="6">图书分类:<select name="bookType">
                <option <c:if test="${bookType==0}"> selected</c:if> value="0">请选择</option>
                <option <c:if test="${bookType==1}"> selected</c:if> value="1">小说</option>
                <option <c:if test="${bookType==2}"> selected</c:if> value="2">文学</option>
                <option <c:if test="${bookType==3}"> selected</c:if> value="3">传记</option>
                <option <c:if test="${bookType==4}"> selected</c:if> value="4">艺术</option>
                <option <c:if test="${bookType==5}"> selected</c:if> value="5">少儿</option>
                <option <c:if test="${bookType==6}"> selected</c:if> value="6">经济</option>
                <option <c:if test="${bookType==7}"> selected</c:if> value="7">管理</option>
                <option <c:if test="${bookType==8}"> selected</c:if> value="8">科技</option>
            </select>&nbsp;&nbsp;&nbsp;&nbsp;
                图书名称:<input type="text" value="${bookName}" name="bookName">&nbsp;&nbsp;&nbsp;&nbsp;
                是否借阅:<select name="isBorrow">
                    <option <c:if test="${isBorrow==2}"> selected</c:if> value="2">请选择</option>
                    <option <c:if test="${isBorrow==1}"> selected</c:if> value="1">已借阅</option>
                    <option <c:if test="${isBorrow==0}"> selected</c:if> value="0">未借阅</option>
                </select>&nbsp;&nbsp;&nbsp;&nbsp;
                <input type="submit" value="查询"/>
            </td>
        </tr>

    </form>
    <tr>
        <td colspan="6" align="right">当前用户:${users.userCode}&nbsp;&nbsp;&nbsp;&nbsp;<a href="/Logout">退出</a></td>
    </tr>
    <tr>
        <td>图书编号</td>
        <td>图书分类</td>
        <td>图书名称</td>
        <td>作者</td>
        <td>出版者</td>
        <td>操作</td>
    </tr>
    <c:forEach var="i" items="${pageInfo.list}">
        <tr>
            <td>${i.bookCode}</td>
            <td>${i.bookType}</td>
            <td>${i.bookName}</td>
            <td>${i.bookAtuthor}</td>
            <td>${i.publishPress}</td>
            <td><c:if test="${i.isBorrow==0}">
                <a href="/setIsBorrow">申请借阅</a>
            </c:if>
                <c:if test="${i.isBorrow==1}">
                    <span style="color:red;">已借阅</span>

                </c:if>
            </td>
        </tr>
    </c:forEach>
</table>
<div>
    <%--  <c:if test="${pageInfo.isFirstPage}">
          <a href="/Usersel?pageNum=${pageInfo.firstPage}&bookType=${bookType}&bookName=${bookName}&isBorrow=${isBorrow}">首页</a>
      </c:if>

      <c:if test="${pageInfo.hasPreviousPage}">
          <a href="/Usersel?pageNum=${pageInfo.prePage}&bookType=${bookType}&bookName=${bookName}&isBorrow=${isBorrow}">上一页</a>
      </c:if>

      <c:forEach items="${pageInfo.navigatepageNums}" var="i">
          <a href="/Usersel?pageNum=${i}&bookType=${bookType}&bookType=${bookType}&bookName=${bookName}&isBorrow=${isBorrow}">${i}</ a>
      </c:forEach>

      <c:if test="${pageInfo.hasNextPage==false}">
          <a href="/Usersel?pageNum=${pageInfo.nextPage}&bookType=${bookType}&bookName=${bookName}&isBorrow=${isBorrow}">下一页</a>
      </c:if>
      <c:if test="${pageInfo.isLastPage}">
          <a href="/Usersel?pageNum=${pageInfo.lastPage}&bookType=${bookType}&bookName=${bookName}&isBorrow=${isBorrow}">尾页</a>
      </c:if>--%>
        <span>${pageInfo.size}</span>
    <c:if test="${pageInfo.isFirstPage==false}">

        <a href="/Usersel?pageNum=${pageInfo.firstPage}">首页</a>|
        <a href="/Usersel?pageNum=${pageInfo.prePage}">上一页</a>|
    </c:if>
    <c:if test="${pageInfo.isLastPage==false}">
        <a href="/Usersel?pageNum=${pageInfo.nextPage}">下一页</a>|
        <a href="/Usersel?pageNum=${pageInfo.lastPage}">尾页</a>
    </c:if>


</div>
</body>
</html>
