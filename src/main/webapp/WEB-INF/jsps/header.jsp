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
                <li><a class="active-header" style="margin-right: 6em; margin-left: 5em" href="${pageContext.request.contextPath}/courses/home" >IT Industry Technologies</a></li>
                <li><a class="active" style="margin-right: 5em;" href="${pageContext.request.contextPath}/courses">Courses</a>
                    <ul>
                        <li><a href="#">C </a></li>
                        <li><a href="#">C++</a></li>
                        <li><a href="#">Core Java</a></li>
                        <li><a href="#">AdvanceJava</a></li>
                    </ul>
                </li>
                <li><a class="active" style="margin-right: 5em;" href="#">Batches</a>
                    <ul>
                        <li><a href="#">10.00 AM</a></li>
                        <li><a href="#">11.00 AM</a></li>
                        <li><a href="#">05.00 PM</a></li>
                        <li><a href="#">06.00 PM</a></li>
                    </ul>
                </li>
                <li><a class="active" style="margin-right: 22em;" href="#">Projects</a></li>
                <li>
                    <c:if test="${not empty email}">
                        <a class="active" href="user-details" style="float: right;">${email}</a>
                    </c:if>
                    <c:if test="${empty email}"><a class="active" href="user" style="float: right;">Login</a></c:if>

                </li>
               </ul>
        </nav>
    </div>
</div>
<script src="scripts/web/jquery-3.6.0.min.js"></script>