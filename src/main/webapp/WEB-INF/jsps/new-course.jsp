<%--
  Created by IntelliJ IDEA.
  User: vish
  Date: 07/07/22
  Time: 10:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style type="text/css">
    div.main {
        width: 500px;
        margin: 50px auto 0px auto;
    }

    div.register {
        background-color: white;
        width: 75%;
        font-size: 18px;
        border-radius: 10px;
        border: 1px solid rgba(255, 255, 255, 0.3);
        box-shadow: 2px 2px 15px rgba(0, 0, 0, 0.3);
        color: #800080;
        display: inline-block;
        margin-top: 1.5em;
        margin-left: 1em;
        }

    .input {
        width: 200px;
        margin: 1px;
        border: none;
        border-bottom: 2px solid #8842d5;
    }
</style>
<div>
    <div class="main">
        <div class="register">
            <h2 style="text-align: center;text-shadow: -15px 10px 10px #ced0d3;transition: all 0.25s ease-out;">
                Submit Courses Details</h2>
            <br>
            <form id="newCourse"  class="newCourse" action="" style="width: 200px; margin-left: 10%">
                <div style="display: none; color: green;" id="saveSuccess"><p>Saved Successfully</p></div>
                <div style="display: none; color: green;" id="saveFailed"><p>Save failed! Try again.</p></div>
                <label style="font-size: 17px;">Course Name :</label>
                <br>
                <input class="input" type="text" name="name" placeholder="Enter Course Name">
                <br><br>
                <label style="font-size: 17px;">Course Duration :</label>
                <br>
                <input class="input" type="text" name="duration" placeholder="Duration In Days">
                <br><br>
                <label style="font-size: 17px;">Course Fee :</label>
                <br>
                <input class="input" type="text" name="fee" placeholder="Enter Fee Amount ">
                <br>
                <div style="margin-top: 10%">
                    <input type="button" value="Submit Details" onclick="saveCourse()" class="button">
                </div>
                </form>
        </div>
    </div>
</div>
<script>

    function saveCourse() {
        let formdata = $("#newCourse").serialize()
        console.log(formdata)
        $.ajax({
            type: "POST",
            url: "courses/insert",
            data: formdata,
            success: function (data, textStatus, jqXHR) {
                console.log("Success");
                console.log("data");
                $("#saveSuccess").show(500);
                $("#saveSuccess").hide(3000);
                document.getElementById("newCourse").reset();
            },
            error: function (jqXHR, textStatus, errorThrown) {
                $("#saveFailed").show(500);
                console.error("Failure");
            }
        });
    }

    function loadAllCourses() {
        window.location = "./all";
    }
</script>