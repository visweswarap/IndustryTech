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
    <link rel="icon" href="./images/logofinalC.jfif" type="image/icon type">
    <title>All-Courses</title>
    <jsp:include page="header.jsp"/>
    <style type="text/css">
        .table-head{
            background-color: darkgrey;

        }
        table {
            width: 100%;
            border-collapse: collapse;
            overflow: hidden;
            box-shadow: 0 0 20px rgba(0, 0, 0, 0.1);
            margin-left: 40%;
            border-radius: 10px
        }

        th {
            padding: 8px;
            color: whitesmoke;
            text-align: center;
        }
        td {
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
            background-image: linear-gradient(to bottom, rgba(254, 254, 254, 1) 90%, rgba(0, 233, 255, 1) 120%);
            background-repeat: no-repeat;
            margin: 0;
            padding: 0;
            width: 100%;
            height: 100%;
        }

    </style>
</head>

<body class="background">
<div style="display: grid; grid-template-columns: 1fr 1fr; grid-gap: 20px;">
    <div>
        <table style="border: 1px solid black; width: 90%;margin-left: 5em; margin-top: 5em;">
            <tr class="table-head" >
                <th>Course ID</th>
                <th>Name</th>
                <th>Duration</th>
                <th>Fees</th>
                <th>Actions</th>
            </tr>
            <c:forEach var="c" items="${courses}">
                <tr style="border: 1px solid black;">
                    <td>${c.id}</td>
                    <td>${c.name}</td>
                    <td>${c.duration}</td>
                    <td>${c.fee}</td>

                    <td >
                        <input type="button" onclick="updateTable()"  value="update">
                        <input type="button" class="btndelete"  id="delete" value="delete">
                    </td>
                </tr>

            </c:forEach>
        </table>
    </div>
    <div>
        <jsp:include page="new-course.jsp"/>
    </div>
</div>
<script>
    function loadAllCourses() {
        window.location = "./all";
    }
    function updateTable() {
      let id =  ${c.id}
    }
    $("#delete").on('click', '.btnDelete', function () {
        $(this).closest('tr').remove();
    });
   </script>

</body>
</html>

