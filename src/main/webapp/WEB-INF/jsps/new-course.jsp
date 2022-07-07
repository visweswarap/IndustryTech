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
    <style type = "text/css">
        div.main{
            width: 500px;
            margin: 100px auto 0px auto;
        }
        div.register{
            background-color: rgba(0,0,0,0.5);
            width: 100%;
            font-size: 18px;
            border-radius: 10px;
            border: 1px solid rgba(255,255,255,0.3);
            box-shadow: 2px 2px 15px rgba(0,0,0,0.3);
            height: 80%;
            margin-left: 80%;
            margin-top: -122%;
        }
    </style>
</head>
<body>
<div>
<div style="background-image: url('./images/Capture2.PNG'); width: 850px; height: 500px; border: 2px solid; color: pink;
 margin-top: 10%;" >

</div>
<div class="main">
    <div class="register">
        <h2 style="text-align: center;text-shadow: -15px 10px 10px #ced0d3;transition: all 0.25s ease-out;">
            Submit Courses Details</h2>
    <form id="register" action=/courses/new" method="get" style="width: 200px;">
       <label style="font-weight: 800;font-size: 17px;">Course Name :</label>
        <br>
        <input id="CorseName" type="text"  name="Cname" placeholder="Enter Course Name;"
               style="width: 300px;margin: 2px;padding: 3px; border-radius: 8px;" >
        <br><br>
        <label style="font-weight: 800;font-size: 17px;">Course Duration :</label>
        <br>
        <input id="Duration" type="text"  name="Duration" placeholder="Duration In Days"
               style="width: 300px;margin: 2px;padding: 3px;border-radius: 8px;">
        <br><br>
        <label style="font-weight: 800;font-size: 17px;">Course Fee :</label>
        <br>
        <input id="Cfee" type="text"  name="Cfee" placeholder="Fee in Rs : "
               style="width: 300px;margin: 2px;padding: 3px;border-radius: 8px;" >
        <br><br>
        <label style="font-weight: 800;font-size: 17px;">Created By :</label>
        <br>
        <input id="create" type="number"  name="create" placeholder="Created By <Name>"
               style="width: 300px;margin: 2px;padding: 3px;border-radius: 8px;">
        <br><br>
        <label style="font-weight: 800;font-size: 17px;">Modified By :</label>
        <br>
        <input id="modify" type="text"  name="modify" placeholder="Modified By<Name>"
               style="width: 300px;margin: 2px;padding: 3px;border-radius: 8px;">
        <br><br>
        <input type="submit" value="Submit Details" class="button" style=" background-color: white; color: black;
                border: 2px solid #4CAF50;padding: 10px 16px;text-align: center;margin: 4px 2px;
                transition-duration: 0.4s;cursor: pointer;border-radius: 8px;">
        <br><br>
        <input type="submit" value="List Of Courses" class="button" style=" background-color: white; color: black;
                border: 2px solid #008CBA;padding: 10px 16px;text-align: center;margin: 4px 2px;
                transition-duration: 0.4s;cursor: pointer;border-radius: 8px;">
    </form>
    </div>
</div>
</div>>
</body>
</html>
