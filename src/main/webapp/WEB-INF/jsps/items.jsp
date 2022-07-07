<%--
  Created by IntelliJ IDEA.
  User: vish
  Date: 07/07/22
  Time: 10:16 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body style="background-image: url('./images/175640.jpg')"><h2 style="border:orange;
           border-width:5px;
           border-style:solid;
           border-radius: 50px;
           text-align: center;
           background-color: lightsteelblue;
           color: red ">COURSES DETAILS </h2>
<table style="border: 1px solid black; width: 90%;margin-left: 5%">
    <tr style="border: 1px solid black;">
        <th style="background-color: darkgrey; color: #8c3b32">Course -ID</th>
        <th style="background-color: darkgrey; color: #8c3b32">Course - Name</th>
        <th style="background-color: darkgrey; color: #8c3b32">Course - Duration</th>
        <th style="background-color: darkgrey; color: #8c3b32">Course- Fees</th>
        <th style="background-color: darkgrey; color: #8c3b32">Created - Date</th>
        <th style="background-color: darkgrey; color: #8c3b32">Modified -  Date</th>
        <th style="background-color: darkgrey; color: #8c3b32">Created - By</th>
        <th style="background-color: darkgrey; color: #8c3b32">Modified - By</th>
        <th style="background-color: darkgrey; color: #8c3b32">Update/Delete</th>
    </tr>
    <c:forEach var="s" items="${student}">
        <tr style="border: 1px solid black;">
            <td style="border: 1px solid black;
           border-radius: 5px;
           background-color: silver;
           text-align: center;
           padding: 6px 6px 6px 6px;">${s.name}</td>
            <td style="border: 1px solid black; border-radius: 5px;  background-color: silver; text-align: center;"></td>
            <td style="border: 1px solid black; border-radius: 3px;  background-color: silver; text-align: center;"></td>
            <td style="border: 1px solid black; border-radius: 3px; background-color: silver; text-align: center;"></td>
            <td style="border: 1px solid black; border-radius: 3px; background-color: silver; text-align: center;"></td>
            <td style="border: 1px solid black; border-radius: 3px; background-color: silver; text-align: center;"></td>
            <td style="border: 1px solid black; border-radius: 3px; background-color: silver; text-align: center;"></td>
            <td style="border: 1px solid black; border-radius: 3px; background-color: silver; text-align: center;"></td>
            <td style="border: 1px solid black; border-radius: 3px; background-color: silver; text-align: center;">
                <input type="button" value="update" style="line-height: 1; display: inline-block; font-size: 0.8rem;
                        border-radius: 5px;color: #fff;padding: 4px;background-color: #06998b;" >
                <input type="button" value="delete" style="line-height: 1; display: inline-block; font-size: 0.8rem;
                        border-radius: 5px;color: #fff;padding: 4px;background-color: #06998b;">
            </td>
        </tr>

    </c:forEach>
</table>
</body>
</html>

