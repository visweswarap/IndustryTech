<%--
  Created by IntelliJ IDEA.
  User: vish
  Date: 07/07/22
  Time: 10:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
<head>
    <title>Title</title>
    <style type="text/css">
        table {
            width: 800px;
            border-collapse: collapse;
            overflow: hidden;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            margin-left: 20%;
        }

        th, td {
            padding: 8px;
            background-color: purple;
            color: #fff;
        }

        th {
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
    </style>
</head>
<div class="header">
    <a href="#default" class="logo">IT Industrial Technologies</a>
    <div class="header-right">
        <a class="active" href="#home" onclick="loadCoursesHome()">Home</a>
    </div>
</div>

<body style="background-image: url('../images/175640.jpg')">
<table style="border: 1px solid black; width: 90%;margin-left: 5%">
    <tr>
        <th>Course -ID</th>
        <th>Course - Name</th>
        <th>Course - Duration</th>
        <th>Course- Fees</th>
        <th>Created - Date</th>
        <th>Modified - Date</th>
        <th>Created - By</th>
        <th>Modified - By</th>
        <th>Update/Delete</th>
    </tr>
    <c:forEach var="c" items="${courses}">
        <tr style="border: 1px solid black;">
            <td>${c.id}</td>
            <td>${c.name}</td>
            <td>${c.duration}</td>
            <td>${c.fee}</td>
            <td>${c.createdDate}</td>
            <td>${c.modifiedDate}</td>
            <td>${c.createdBy}</td>
            <td>${c.modifiedBy}</td>
            <td style=>
                <input type="button" value="update" style="line-height: 1; display: inline-block; font-size: 0.8rem;
                        border-radius: 5px;color: #fff;padding: 4px;background-color: #06998b;">
                <input type="button" value="delete" style="line-height: 1; display: inline-block; font-size: 0.8rem;
                        border-radius: 5px;color: #fff;padding: 4px;background-color: #06998b;">
            </td>
        </tr>

    </c:forEach>
</table>

</body>
</html>

