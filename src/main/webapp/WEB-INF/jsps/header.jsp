<%--
  Created by IntelliJ IDEA.
  User: vish
  Date: 07/07/22
  Time: 10:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style>
    body {
        font-family: Arial, Helvetica, sans-serif;
    }
    * {
        padding: 0;
        margin: 0;
        box-sizing: border-box;
    }
    nav {
        height: 60px;
        background: #2c3e50;
        box-shadow: 0 10px 15px rgba(0, 0, 0, 0.1);
        margin-top: 0em;
    }
    nav ul {
        padding: 0;
        float: right;
        margin-right: 30px;
    }
    nav ul li {
        background: #2c3e50;
        position: relative;
        list-style: none;
        display: inline-block;
    }
    nav ul li a {
        display: block;
        padding: 0 15px;
        color: white;
        text-decoration: none;
        line-height: 60px;
        font-size: 18px;
    }
    nav ul li a:hover {
        background: #243342;
    }
    nav ul ul {
        position: absolute;
        top: 60px;
        display: none;
    }
    nav ul li:hover > ul {
        display: block;
    }
    nav ul ul li {
        width: 150px;
        float: none;
        display: list-item;
        position: relative;
    }
    nav ul ul li a {
        padding: 0 10px;
        text-align: left;
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

    .button-green {
        background-color: white;
        color: black;
        border: 2px solid green;
        padding: 10px 16px;
        text-align: center;
        margin: 4px 2px;
        transition-duration: 0.4s;
        cursor: pointer;
        border-radius: 4px;

    }

    .button:hover {
        background-color: green;
        color: white;
        border-radius: 4px;
    }


</style>
<div class="header">

    <div class="dropdown">
        <nav>
            <ul>
                <li><a class="active-header" href="#" style="margin-right: 40em;">IT Industry Technologies</a></li>
                <li><a class="active" href="${pageContext.request.contextPath}/courses/">Courses</a>
                    <ul>
                        <li><a href="#">C </a></li>
                        <li><a href="#">C++</a></li>
                        <li><a href="#">Core Java</a></li>
                        <li><a href="#">AdvanceJava</a></li>
                    </ul>
                </li>
                <li><a class="active" href="#">Batches</a>
                    <ul>
                        <li><a href="#">10.00 AM</a></li>
                        <li><a href="#">11.00 AM</a></li>
                        <li><a href="#">05.00 PM</a></li>
                        <li><a href="#">06.00 PM</a></li>
                    </ul>
                </li>
                <li><a class="active" href="#">Projects</a></li>
                <li><a class="active" href="#">Home</a></li>
            </ul>
        </nav>
    </div>

</div>
<script src="../scripts/web/jquery-3.6.0.min.js"></script>
