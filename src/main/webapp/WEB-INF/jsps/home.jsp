<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html style="height: 100%">

<head>
    <link rel="icon" href="./images/logofinalC.jfif" type="image/icon type">
    <title>Industry Technology</title>
    <style>
        ol {
            background: initial;
            padding: 10px;
            list-style: none;
            counter-reset: steps;
            margin-top: -18px;

        }

        ol li {
            background: #cce5ff;
            color: initial;;
            margin: 8px;
            margin-right: -9px;


        }

        .offer {
            color: white;
            text-align: center;
            padding: 8px;
            background: #1abc9c;
            margin-top: 1px;
        }

        .background {
            background-image: linear-gradient(to bottom, rgba(254, 254, 254, 1) 90%, rgba(0, 233, 255, 1) 110%);
            background-repeat: no-repeat;
            margin: 0;
            padding: 0;
            width: 100%;
            height: 100%;
        }
    </style>
    <jsp:include page="header.jsp"/>
    <link rel="stylesheet" type="text/css" href="../styles/header.css">
</head>

<body class="background">
<div>
    <div style="width: 190px; height: 200px;border: none; margin-left: 5%;margin-top: 5%;">
        <img src="./images/logofinalC.jfif" width="100%" height="100%">
    </div>
    <div style="width: 600%; height: 50%; border: none; margin-top: -13.0%; margin-left: 18%;">
        <img src="./images/technology.jfif" width="400px" height="100%">
    </div>
    <div style="width:900px; height: 135px; border: 2px solid; color: pink; margin-top: 0.5%;margin-left: 18% ">

    </div>
    <div class="offered"
         style="width: 500px; height: 295px; border: 2px solid; color: cornflowerblue; margin-left: 5%;margin-top: 2%;">
        <h2 class="offer"> Courses Offered </h2>
        <ol>
            <li><i class='fas fa-at'></i>C & C++ -Languages</li>
            <li>Core-Java</li>
            <li>Advanced-Java</li>
            <li>Servlets</li>
            <li>Spring</li>
            <li>Hibernate</li>
            <li>SQL Server-Training</li>
            <li>Java Online-Training</li>
            <li>Live Project-Training</li>
        </ol>
    </div>
    <div style="width: 800px; height: 295px; border: 2px solid; color: pink; margin-left: 40%;margin-top: -19.5%;">
        <div style="width:120px; height: 120px; border: none; margin-top: 3%;margin-left: 1%;">
            <img src="./images/vish.webp" width="100%">
        </div>
        <div style="width:120px; height: 120px; border: 2px solid; color: pink; margin-top: 1.5%;margin-left: 1% ">
        </div>
        <div style="width:600px; height: 120px; border: 2px solid; color: pink; margin-top: -32.5%;margin-left: 18% ">
        </div>
        <div style="width:600px; height: 120px; border: 2px solid; color: pink; margin-top: 1.5%;margin-left: 18% ">
        </div>
    </div>
</div>
</body>
</html>