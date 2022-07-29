<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Mahesh
  Date: 7/28/2022
  Time: 4:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>user details</title>
    <style type="text/css">
        table {
            width: 100%;
            border-collapse: collapse;
            overflow: hidden;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            margin-left: 20%;
        }

        th, td {
            padding: 8px;
            color: purple;
            text-align: center;
        }

        tr:hover {
            background-color: cornflowerblue;
        }

        td:hover {
            background-color: cornflowerblue;
            z-index: -1;
            left: 0;
            right: 0;
        }

        .background {
            background-image: linear-gradient(to bottom, rgba(254, 254, 254, 1) 75%, rgba(0, 233, 255, 1) 120%);
            background-repeat: no-repeat;
            margin: 0;
            padding: 0;
            width: 100%;
            height: 100%;
        }
    </style>
</head>
<body class="background">
<div>
    <table style="border: 1px solid black; width: 50%;margin-left: 25em; margin-top: 5em">
        <tr>
            <th>User Id</th>
            <th>First Name</th>
            <th>Last Name</th>
            <th>E-Mail Id</th>
            <th>Mobile Number</th>
        </tr>
        <c:forEach var="user" items="${users}">
            <tr style="border: 1px solid black;">
                <td>${user.id}</td>
                <td>${user.firstname}</td>
                <td>${user.lastname}</td>
                <td>${user.email}</td>
                <td>${user.mobile}</td>
            </tr>

        </c:forEach>
    </table>
</div>
</body>
</html>
