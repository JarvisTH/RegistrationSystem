<%--
  Created by IntelliJ IDEA.
  User: Jarvis
  Date: 2019/8/15
  Time: 14:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<!-- 导航栏 -->
<div>
    <nav class="navbar navbar-expand-sm bg-dark navbar-dark">
        <!-- Navbar text-->
        <span class="navbar-text">
            挂号预约系统后台
        </span>
        <!-- Links -->
        <ul class="navbar-nav">
            <ul class="navbar-nav">
                <li class="nav-item dropdown ">
                    <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">订单管理</a>
                    <div class="dropdown-menu bg-dark text-white">
                        <a class="dropdown-item bg-dark text-white" href="#">订单记录</a>
                        <a class="dropdown-item bg-dark text-white" href="#">退单记录</a>
                        <a class="dropdown-item bg-dark text-white" href="#">退款记录</a>
                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">用户管理</a>
                    <div class="dropdown-menu bg-dark text-white">
                        <a class="dropdown-item bg-dark text-white" href="#">医师管理</a>
                        <a class="dropdown-item bg-dark text-white" href="#">患者管理</a>
                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">纲目管理</a>
                    <div class="dropdown-menu bg-dark text-white">
                        <a class="dropdown-item bg-dark text-white" href="#">科目管理</a>
                        <a class="dropdown-item bg-dark text-white" href="#">科室管理</a>
                    </div>
                </li>
                <li class="nav-item dropdown">
                    <a class="nav-link dropdown-toggle" href="#" id="navbardrop" data-toggle="dropdown">登录日志</a>
                    <div class="dropdown-menu bg-dark text-white">
                        <a class="dropdown-item bg-dark text-white" href="#">医师日志</a>
                        <a class="dropdown-item bg-dark text-white" href="#">患者日志</a>
                    </div>
                </li>
                <li class="nav-item">
                    <a class="nav-link" href="#">时间表管理</a>
                </li>
        </ul>
    </nav>
</div>
