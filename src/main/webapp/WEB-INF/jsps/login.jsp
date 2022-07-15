<%--
  Created by IntelliJ IDEA.
  User: vish
  Date: 15/07/22
  Time: 9:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login / Signup</title>
    <jsp:include page="header.jsp"/>
    <link rel="stylesheet" type="text/css" href="../styles/login.css">
    <style>
        div.login {
            background-color: white;
            width: 30%;
            font-size: 18px;
            border-radius: 10px;
            border: 1px solid rgba(255, 255, 255, 0.3);
            box-shadow: 2px 2px 15px rgba(0, 0, 0, 0.3);
            color: #800080;
            //display: inline-block;
            margin-top: 1.5em;
            margin-left: 30em;
            height: 18em;

        }
        div.signup
        {
            background-color: white;
            width: 40%;
            font-size: 18px;
            border-radius: 10px;
            border: 1px solid rgba(255, 255, 255, 0.3);
            box-shadow: 2px 2px 15px rgba(0, 0, 0, 0.3);
            color: #800080;
            display: inline-block;
            margin-top: 1.5em;
            margin-left: 30em;
            height: 20em;

        }


        .input {
            width: 20em;
            margin: 1px;
            border: none;
            border-bottom: 2px solid #8842d5;
            height: 2em;
        }

        .user {
            margin-left: 2em;
            margin-top: 1em;
        }
        .signup-form{
            margin-left: 2em;
            margin-top: 1em;
        }

        .h2 {
            text-align: left;
            text-shadow: -15px 10px 10px #ced0d3;
            transition: all 0.25s ease-out;
            margin-left: 1em;
            margin-top: 1em;
        }
        .text{
            font-size: 15px;
            margin-left: 2em;
        }
    </style>
</head>
<body>
<div class="main">
<div class="login">
    <h2 class="h2"> Login</h2>
    <form action="/user/sign" id="loginForm" class="user">
        <label style="font-size: 17px;">E Mail :</label>
        <br>
        <input class="input" type="email" name="email" placeholder="Enter a Valid Email">
        <br>
        <label style="font-size: 17px;">Pass Word :</label>
        <br>
        <input class="input" type="password" name="password" placeholder="Enter a Valid Pass Word">
        <br> <br>
        <input type="button" value="Login Now" onclick="saveCourse()" class="button">

    </form>
    <div class="login-signup" style="margin-top: 15px">
       <span class="text">Not a Member? <a href="#" class="signup-text"> Signup Now</a>
       </span>
    </div>
</div>
<!--
 New to this site? <button> Signup here </button>
 -->
<div class="signup">
    <h2 class="h2"> Registration</h2>
<form id="signupForm" action="/user/signup" class="signup-form">
    <label style="font-size: 17px;">Name:</label>
    <br>
    <input class="input" type="email" name="email" placeholder="First Name">
    <input class="input" type="email" name="email" placeholder="Last Name">
    <br>
    <label style="font-size: 17px;">E Mail :</label>
    <br>
    <input class="input" type="email" name="email" placeholder="Enter a Valid Email">
    <br>
    <label style="font-size: 17px;">Pass Word :</label>
    <br>
    <input class="input" type="password" name="password" placeholder="Enter a Valid Pass Word">
    <br>
    <label style="font-size: 17px;">Mobile Number :</label>
    <br>
    <input class="input" type="password" name="password" placeholder="Enter a Valid Mobile Number">
    <br> <br>
    <input type="button" value="Signup" onclick="signup()" class="button">
</form>
</div>
</div>

<script type="application/javascript">
    function signup() {
        // hide login form
        // show signup form
    }
</script>
</body>
</html>
