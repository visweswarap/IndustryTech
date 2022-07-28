<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<body style="background-image: linear-gradient(to bottom, rgba(254,254,254,1) 75%, rgba(0,233,255,1) 120%);
            background-image:-moz-linear-gradient(to bottom, rgba(254,254,254,1) 75%, rgba(0,233,255,1) 120%);" >
<div class="main">

    <!--
     New to this site? <button> Signup here </button>
     -->
    <div class="signup">
        <h2 class="h2"> Registration</h2>
        <form id="signupForm" class="signupForm">
            <div style="display: none; color: red;" id="passwordError"><p>Password and Conform Password Not Matched</p>
            </div>
            <div style="display: none; color: green;" id="saveSuccess"><p>Saved Successfully</p></div>
            <div style="display: none; color: red;" id="saveFailed"><p>Save failed! Try again.</p></div>
            <label style="font-size: 17px;">FirstName:</label>
            <br>
            <input class="input" type="text" name="firstname" placeholder="First Name">
            <br>
            <label style="font-size: 17px;">LirstName:</label>
            <br>
            <input class="input" type="text" name="lastname" placeholder="Last Name">
            <br>
            <label style="font-size: 17px;">E-Mail :</label>
            <br>
            <input class="input" type="email" name="email" placeholder="Enter a Valid E-mail">
            <br>
            <label style="font-size: 17px;">Password :</label>
            <br>
            <input class="input" type="password" name="password" id="password" placeholder="Enter a Valid Password">
            <br>
            <label style="font-size: 17px;">Conform Password :</label>
            <br>
            <input class="input" type="password" id="conformpassword" placeholder="Enter Conform Password ">
            <br>
            <label style="font-size: 17px;">Mobile Number :</label>
            <br>
            <input class="input" type="text" name="mobile" placeholder="Enter a Valid Mobile Number">
            <br> <br>
            <input type="button" value="Save" id="createAccount" onclick="saveLogin()" class="button">
        </form>
        <div class="login-Signup" style=" margin-left: 10em; margin-top: -2.5em;">
            <span class="text">Already Member?</span>
            <button class="button" onclick="loginForm()">Login</button>
        </div>
    </div>
    <div class="login">
        <h2 class="h2"> Login</h2>
        <form id="loginForm" class="formLogin" action="./user/login" method="post">
            <c:if test="${not empty email}">
                <a class="loginError" style="color:red">${errorLogin}</a>
            </c:if>
           <label style="font-size: 17px;">E-Mail :</label>
            <br>
            <input class="input" type="email" name="email" placeholder="Enter a Valid Email">
            <br> <br>
            <label style="font-size: 17px;">Password :</label>
            <br>
            <input class="input" type="password" name="password" placeholder="Enter a Valid Pass Word">
            <br> <br><br>
            <input type="submit" value="Login Now" id="#linkLogin" class="button">

        </form>
        <div class="login-Signup" style=" margin-left: 10em; margin-top: -2.5em;">
            <span class="text">New Member?</span>
            <button class="button" onclick="signUp()">Signup</button>
        </div>
    </div>
</div>

<script type="application/javascript">

    function signUp() {
        $(".login").hide();
        $(".signup").show();
    }

    function loginForm() {
        $(".login").show();
        $(".signup").hide();
    }

    function saveLogin() {
        let password = $("#password").val();
        let conformpassword = $("#conformpassword").val();
        if (conformpassword !== password) {
            $("#passwordError").show(500);
            $("#passwordError").hide(4000);
            return
        }

        let formData = $("#signupForm").serialize()
        console.log(formData)
        $.ajax({
            url: "user/register",
            type: "POST",
            data: formData,
            success: function (data, textStatus, jqXHR) {
                console.log("Success");
                console.log("data");
                $("#saveSuccess").show(500);
                $("#saveSuccess").hide(4000);
                document.getElementById("signupForm").reset();

                },
            error: function (jqXHR, textStatus, errorThrown) {
                $("#saveFailed").show(500);
                $("#saveFailed").hide(4000);
                console.error("Failure");
            }
        });

    }

    /*  function loginValidation() {
          let loginForm = $("#loginForm").serialize()
          console.log(loginForm)
          $.ajax({
              url: "user/login",
              type: "POST",
              data: loginForm,
              success: function (data, textStatus, jqXHR) {
                  console.log("Success");
                  console.log("data");
                  window.location = "./home"
              },
              error: function (jqXHR, textStatus, errorThrown) {
                  console.error("Failure");
              }
          });
      }*/

</script>
</body>
</html>
