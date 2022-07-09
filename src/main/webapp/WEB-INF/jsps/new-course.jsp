<%--
  Created by IntelliJ IDEA.
  User: vish
  Date: 07/07/22
  Time: 10:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <jsp:include page="header.jsp"/>
    <style type="text/css">
        div.main {
            width: 500px;
            margin: 100px auto 0px auto;
        }

        div.register {
            background-color: white;
            width: 80%;
            font-size: 18px;
            border-radius: 10px;
            border: 1px solid rgba(255, 255, 255, 0.3);
            box-shadow: 2px 2px 15px rgba(0, 0, 0, 0.3);
            height: 60%;
              color: #800080;
            display: inline-block;
        }

        .button {
            background-color: white;
            color: black;
            border: 2px solid #008CBA;
            padding: 10px 16px;
            text-align: center;
            margin: 4px 2px;
            transition-duration: 0.4s;
            cursor: pointer;
            border-radius: 4px;

        }

        .button:hover {
            background-color: #008CBA;
            color: white;
            border-radius: 4px;
        }

        .input {
            width: 200px;
            margin: 1px;
            border: none;
            border-bottom: 2px solid #8842d5;
        }
    </style>
</head>
<body style="background-image: url('../images/3145.webp');">
<div>
       <div class="main">
        <div class="register">
            <h2 style="text-align: center;text-shadow: -15px 10px 10px #ced0d3;transition: all 0.25s ease-out;">
                Submit Courses Details</h2>
            <br>
            <form id="register" action="${pageContext.request.contextPath}/courses/new" method="get"
                  style="width: 200px; margin-left: 10%">
                <label style="font-size: 17px;">Course Name :</label>
                <br>
                <input class="input" type="text" name="Cname" placeholder="Enter Course Name;">
                <br><br>
                <label style="font-size: 17px;">Course Duration :</label>
                <br>
                <input class="input" type="text" name="Duration" placeholder="Duration In Days">
                <br><br>
                <label style="font-size: 17px;">Course Fee :</label>
                <br>
                <input class="input" type="text" name="Cfee" placeholder="Fee in Rs : ">
                <br><br>
                <div style="margin-top: 10%">
                    <input type="submit" value="Submit Details" class="button">
                </div>
                <div style="margin-left: 90%; margin-top: -24%;">
                    <input type="button" value="List Of Courses" class="button" onclick="loadAllCourses()">
                </div>
            </form>
        </div>
    </div>
</div>
<script>

    function loadAllCourses() {
        window.location = "./all";
    }
</script>
</body>
</html>
