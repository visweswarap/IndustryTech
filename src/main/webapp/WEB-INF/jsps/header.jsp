<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: vish
  Date: 07/07/22
  Time: 10:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<link rel="stylesheet" type="text/css" href="styles/header.css">
<div class="header">
    <div class="dropdown">
        <nav>
            <ul>
                <li><a class="active-header" href="${pageContext.request.contextPath}/courses/home" >IT Industry Technologies</a></li>
                <li><a class="active" href="${pageContext.request.contextPath}/courses">Courses</a>
                    <ul>
                        <li><a href="#">C </a></li>
                        <li><a href="#">Java</a></li>
                        <li><a href="#">Dev Ops</a></li>
                        <li><a href="#">Linux</a></li>
                    </ul>
                </li>
                <li><a class="active" href="#">Batches</a>
                    <ul>
                        <li><a href="#">Programming</a></li>
                        <li><a href="#">Project</a></li>
                        <li><a href="#">Internship</a></li>
                        <li><a href="#">Mentorship</a></li>
                    </ul>
                </li>
                <li><a class="active" href="#">Projects</a></li>
                <li><a class="active" href="${pageContext.request.contextPath}/user">Admin</a></li>
                <li style="float:right;">
                    <c:if test="${not empty email}">
                        <a class="active" href="user-details" >${email}</a>
                    </c:if>
                    <c:if test="${empty email}"><a class="active" href="${pageContext.request.contextPath}/user/loginform" >Login</a></c:if>

                </li>
               </ul>
        </nav>
    </div>
</div>
<script src="scripts/web/jquery-3.6.0.min.js"></script>