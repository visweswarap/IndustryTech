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
    <nav>

        <ul>
           <img style="margin-bottom: 20px" src="./images/logofinalC.jfif" width="3%" height="80%">
            <li style="margin-bottom: 1em" ><a class="active-header" href="${pageContext.request.contextPath}/courses/home">Industry
                Technologies</a>
            </li>
            <li style="margin-bottom: 1em"><a class="active" href="${pageContext.request.contextPath}/courses">Courses</a>
                <ul>
                    <li><a href="#">C </a></li>
                    <li><a href="#">Java</a></li>
                    <li><a href="#">Dev Ops</a></li>
                    <li><a href="#">Linux</a></li>
                    <li><a href="#">Python</a></li>
                </ul>
            </li>
            <li style="margin-bottom: 1em"><a class="active" href="#">Batches</a>
                <ul>
                    <li><a href="#">Programming</a></li>
                    <li><a href="#">Project</a></li>
                    <li><a href="#">Internship</a></li>
                    <li><a href="#">Mentorship</a></li>
                </ul>
            </li>
            <li style="margin-bottom: 1em"><a class="active" href="#">Projects</a></li>
            <li style="margin-bottom: 1em">
                <c:if test="${not empty user}">
                <a class="active" id="admin" style="display: table" href="${pageContext.request.contextPath}/admin">Admin</a>
            </li>
            </c:if>
            <li style="float:right;">
                <c:if test="${not empty user}">
                    <a class="active" id="details"
                       href="${pageContext.request.contextPath}/details">${user.email}</a>
                </c:if>
                <c:if test="${empty user}"><a class="active"
                                              href="${pageContext.request.contextPath}/login">Login</a></c:if>
            </li>
        </ul>
    </nav>
</div>
<script src="scripts/web/jquery-3.6.0.min.js"></script>
