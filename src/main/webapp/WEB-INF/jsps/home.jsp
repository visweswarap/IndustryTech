<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Hello World</title>
    <style>
        ol{
            background:  initial;
            padding: 10px;
            list-style: none;
            counter-reset: steps;
            margin-top: -18px;

        }
        ol li {
            background: #cce5ff;
            color: initial;;
            margin: 8px;
            margin-right:-9px;


        }
        .offer{
            color: white;
            text-align: center;
            padding: 8px;
            background: #1abc9c;
            margin-top: 1px;
        }

         .background{
             background-image: linear-gradient(to bottom, rgba(254,254,254,1) 75%, rgba(0,233,255,1) 120%);
             background-repeat: no-repeat;
             margin: 0;
             padding: 0;
             width: 100%;
             height: 100%;
         }
     </style>
    <jsp:include page="header.jsp" />
    <link rel="stylesheet" type="text/css" href="../styles/header.css">
</head>
<body class="background">
<div>
    <div style="width: 190px; height: 200px; border: 2px solid; color: pink; margin-left: 5%;margin-top: 5%;">
    </div>
    <div style="width: 600px; height: 50px; border: 2px solid; color: pink; margin-top: -13.5%; margin-left: 18%">
        <h1 class="header">It Industry Training</h1>
    </div>
    <div style="width:900px; height: 140px; border: 2px solid; color: pink; margin-top: 0.5%;margin-left: 18% ">

    </div>
       <div class="offered" style="width: 500px; height: 300px; border: 2px solid; color: cornflowerblue; margin-left: 5%;margin-top: 6%;">
        <h2 class="offer" > Courses Offered </h2>
        <ol>
            <li>C & C++ -Languages</li>
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
    <div style="width: 800px; height: 300px; border: 2px solid; color: pink; margin-left: 40%;margin-top: -20.15%;">
        <div style="width:120px; height: 120px; border: 2px solid; color: pink; margin-top: 3%;margin-left: 1%;">
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