<%--
  Created by IntelliJ IDEA.
  User: Jarvis
  Date: 2019/8/16
  Time: 9:35
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../include/admin/adminHeader.jsp"%>
<%@ include file="../include/admin/adminNavigator.jsp"%>

<title>医师管理</title>

<!-- 搜索 -->
<div class="container mt-3">
    <form>
        <label>搜索栏：</label>
        <div class="custom-control custom-input custom-control-inline input-group-sm">
            <input type="text" class="form-control" placeholder="请输入ID" id="usr" name="username">
        </div>
        <div class="custom-control custom-input custom-control-inline input-group-sm">
            <input type="text" class="form-control" placeholder="请输入医师ID" id="usr" name="username">
        </div>
        <input type="submit" class="btn btn-info " value="Search">
    </form>
</div>

<!-- 添加 -->
<div class="container mt-3">
    <label>功能栏：</label>
    <a href="" class="btn bg-primary text-white">添加</a>
</div>

<!-- 内容 -->
<div class="container mt-3">
    <table class="table table-bordered table-hover table-dark table-striped">
        <thead>
        <tr>
            <th>ID</th>
            <th>楼栋</th>
            <th>区域</th>
            <th>房间</th>
            <th>日期</th>
            <th>上/下午</th>
            <th>总量</th>
            <th>剩余量</th>
            <th>医师ID</th>
            <th>修改</th>
            <th>删除</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${doctorSchedules}" var="doctorSchedule">
            <tr>
                <th>${doctorSchedule.id}</th>
                <td>${doctorSchedule.building}</td>
                <td>${doctorSchedule.region}</td>
                <td>${doctorSchedule.room}</td>
                <td>${doctorSchedule.scheduleDate}</td>
                <td>${doctorSchedule.detailTime}</td>
                <td>${doctorSchedule.totalAmount}</td>
                <td>${doctorSchedule.remainAmount}</td>
                <td><a href="">${doctorSchedule.doctorId}</a></td>
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
