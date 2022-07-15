<%--
  Created by IntelliJ IDEA.
  User: vish
  Date: 15/07/22
  Time: 9:42 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<link rel="stylesheet" type="text/css" href="styles/login.css">
<jsp:include page="header.jsp"/>
<html>
<head>
    <title>Login / Signup</title>
</head>
<body>
<div class="main">

    <!--
     New to this site? <button> Signup here </button>
     -->
    <div class="signup">
        <h2 class="h2"> Registration</h2>
        <form id="signupForm" action="/user/signup" class="signupForm">
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
            <input type="button" value="Signup" id="createAccount" onclick="signup()" class="button">
        </form>
        <span class="text">Already Member? <a  href="#" class="Login-text" id="linkLogin"> Login Now</a>
       </span>
    </div>
    <div class="login">
        <h2 class="h2"> Login</h2>
        <form action="/user/sign" id="loginForm" class="form--hidden">
            <label style="font-size: 17px;">E Mail :</label>
            <br>
            <input class="input" type="email" name="email" placeholder="Enter a Valid Email">
            <br>
            <label style="font-size: 17px;">Pass Word :</label>
            <br>
            <input class="input" type="password" name="password" placeholder="Enter a Valid Pass Word">
            <br> <br>
            <input type="button" value="Login Now" id="#linkLogin" class="button">

        </form>
        <div class="login-signup" style="margin-top: 15px">
       <span class="text">Not a Member? <a  href="#" class="signup-text" id="linkCreateAccount"> Signup Now</a>
       </span>
        </div>
    </div>
</div>

<script type="application/javascript">

        document.addEventListener("DOMContentLoaded", () => {
            const loginForm = document.querySelector("#loginForm");
            const createAccount = document.querySelector("#signupForm");

            document.querySelector("#linkCreateAccount").addEventListener("click", e => {
                e.preventDefault();
                loginForm.classList.add("signupForm");
                createAccount.classList.remove("signupForm");
            });
            document.querySelector("#linkLogin").addEventListener("click", e => {
                e.preventDefault();
                loginForm.classList.remove("signupForm");
                createAccount.classList.add("form--hidden");
            });
        });


</script>
</body>
</html>
