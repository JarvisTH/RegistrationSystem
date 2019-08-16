<%--
  Created by IntelliJ IDEA.
  User: Jarvis
  Date: 2019/8/16
  Time: 0:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../include/admin/adminHeader.jsp"%>
<%@ include file="../include/admin/adminNavigator.jsp"%>

<title>患者管理</title>

<!-- 搜索 -->
<div class="container mt-3">
    <form>
        <label>搜索栏：</label>
        <div class="custom-control custom-input custom-control-inline input-group-sm">
            <input type="text" class="form-control" placeholder="请输入ID" id="usr" name="username">
        </div>
        <div class="custom-control custom-input custom-control-inline input-group-sm">
            <input type="text" class="form-control" placeholder="请输入姓名" id="usr" name="username">
        </div>
        <div class="custom-control custom-input custom-control-inline input-group-sm">
            <input type="text" class="form-control" placeholder="请输入性别" id="usr" name="username">
        </div>
        <input type="submit" class="btn btn-info " value="Search">
    </form>
</div>

<!-- 内容 -->
<div class="container mt-3">
    <table class="table table-bordered table-hover table-dark table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>身份证号</th>
            <th>地址</th>
            <th>电话</th>
            <th>修改</th>
            <th>删除</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${patients}" var="patient">
            <tr>
                <th>${patient.id}</th>
                <td>${patient.name}</td>
                <td>${patient.sex}</td>
                <td>${patient.age}</td>
                <td>${patient.idCard}</td>
                <td>${patient.address}</td>
                <td>${patient.phone}</td>
                <td><a href="">modify</a></td>
                <td><a href="">delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<!-- 分页 -->
<div style="margin-left: 44%;  margin-top: 2rem;">
    <ul class="pagination pagination-sm">
        <li class="page-item"><a class="page-link bg-dark text-white" href="#">Previous</a></li>
        <li class="page-item"><a class="page-link bg-dark text-white" href="#">1</a></li>
        <li class="page-item active"><a class="page-link bg-dark text-white" href="#">2</a></li>
        <li class="page-item"><a class="page-link bg-dark text-white" href="#">3</a></li>
        <li class="page-item"><a class="page-link bg-dark text-white" href="#">Next</a></li>
    </ul>
</div>


<%@ include file="../include/admin/adminFooter.jsp"%>

