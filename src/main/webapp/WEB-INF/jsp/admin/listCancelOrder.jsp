<%--
  Created by IntelliJ IDEA.
  User: Jarvis
  Date: 2019/8/16
  Time: 9:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../include/admin/adminHeader.jsp"%>
<%@ include file="../include/admin/adminNavigator.jsp"%>

<title>退单管理</title>

<!-- 搜索 -->
<div class="container mt-3">
    <form>
        <label>搜索栏：</label>
        <div class="custom-control custom-input custom-control-inline input-group-sm">
            <input type="text" class="form-control" placeholder="请输入时间表ID" id="usr" name="username">
        </div>
        <div class="custom-control custom-input custom-control-inline input-group-sm">
            <input type="text" class="form-control" placeholder="请输入科目" id="usr" name="username">
        </div>
        <div class="custom-control custom-input custom-control-inline input-group-sm">
            <input type="text" class="form-control" placeholder="请输入科室" id="usr" name="username">
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
            <th>订单ID</th>
            <th>订单序号</th>
            <th>科目</th>
            <th>科室</th>
            <th>门诊价格</th>
            <th>患者ID</th>
            <th>医师ID</th>
            <th>时间表ID</th>
            <th>修改</th>
            <th>删除</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${cancelOrders}" var="cancelOrder">
            <tr>
                <td>${cancelOrder.id}</td>
                <td>${cancelOrder.serialNumber}</td>
                <td>${cancelOrder.keMu}</td>
                <td>${cancelOrder.keShi}</td>
                <td>${cancelOrder.price}</td>
                <td><a href="">${cancelOrder.patientId}</a></td>
                <td><a href="">${cancelOrder.doctorId}</a></td>
                <td><a href="">${cancelOrder.scheduleId}</a></td>
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

