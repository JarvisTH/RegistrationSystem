<%--
  Created by IntelliJ IDEA.
  User: Jarvis
  Date: 2019/8/16
  Time: 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../include/admin/adminHeader.jsp"%>
<%@ include file="../include/admin/adminNavigator.jsp"%>

<title>订单管理</title>


<!-- 搜索 -->
<div class="container mt-3">
    <form>
        <label>搜索栏：</label>
        <div class="custom-control custom-input custom-control-inline input-group-sm">
            <input type="text" class="form-control" placeholder="请输入ID" id="usr" name="username">
        </div>
        <div class="custom-control custom-input custom-control-inline input-group-sm">
            <input type="text" class="form-control" placeholder="请输入名称" id="usr" name="username">
        </div>
        <input type="submit" class="btn btn-info " value="Search">
    </form>
</div>

<!-- 添加 -->
<div class="container mt-3">
    <label>功能栏：</label>
    <a href="" class="btn bg-primary text-white">添加</a>
</div>


<!--内容-->
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
        <c:forEach items="${orderRecords}" var="orderRecord">
            <tr>
                <td>${orderRecord.id}</td>
                <td>${orderRecord.serialNumber}</td>
                <td>${orderRecord.keMu}</td>
                <td>${orderRecord.keShi}</td>
                <td>${orderRecord.price}</td>
                <td><a href="">${orderRecord.patientId}</a></td>
                <td><a href="">${orderRecord.doctorId}</a></td>
                <td><a href="">${orderRecord.scheduleId}</a></td>
                <td><a href="">modify</a></td>
                <td><a href="">delete</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

<!-- 分页 -->
<div style="margin-left: 44%; margin-top: 2rem;">
    <ul class="pagination pagination-sm">
        <li class="page-item"><a class="page-link bg-dark text-white" href="#">Previous</a></li>
        <li class="page-item"><a class="page-link bg-dark text-white" href="#">1</a></li>
        <li class="page-item active"><a class="page-link bg-dark text-white" href="#">2</a></li>
        <li class="page-item"><a class="page-link bg-dark text-white" href="#">3</a></li>
        <li class="page-item"><a class="page-link bg-dark text-white" href="#">Next</a></li>
    </ul>
</div>


<%@ include file="../include/admin/adminFooter.jsp"%>
