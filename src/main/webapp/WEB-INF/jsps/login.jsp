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
  <jsp:include page="header.jsp" />
</head>
<body>
  <form action="/user/login" id="loginForm">
      <!--
        Email: <input >
        Password: <input >
        <input submit>
       -->
  </form>
<!--
 New to this site? <button> Signup here </button>
 -->
  <form id="signupForm" action="/user/signup">

  </form>
<script type="application/javascript">
    function signup(){
        // hide login form
        // show signup form
    }
</script>
</body>
</html>
