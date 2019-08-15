<%--
  Created by IntelliJ IDEA.
  User: Jarvis
  Date: 2019/8/15
  Time: 15:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../include/admin/adminHeader.jsp"%>
<%@ include file="../include/admin/adminNavigator.jsp"%>

<title>科目管理</title>

<div class="workingArea">
    <table class="table table-border table-sm">
        <thead class="thead-light">
        <tr>
            <th>科室ID</th>
            <th>科室名称</th>
            <th>编辑</th>
            <th>删除</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${ks}" var="k">
            <tr>
                <td>${k.id}</td>
                <td>${k.name}</td>
                <td><a href="">modify</a></td>
                <td><a href="">delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>
<div style="text-align: center;margin-top: 5%;">
    <a href="" class="btn btn-outline-primary">添加</a>
</div>
