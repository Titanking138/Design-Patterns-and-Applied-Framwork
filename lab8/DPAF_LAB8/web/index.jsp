<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <script type="text/javascript" src="checkuserId.js"></script>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>UniqueUser</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">

</head>
<body onload="init()">
    <br><br><br>
    <div class="row">
        <div class="col-3"></div>
        <div class="col-6 bg-light">
            <h1>Kindly Fill up the Form</h1>
            <hr><hr>
            <form name="registrationForm" action="register">
                <table border="0" cellpadding="5">
                    <tr>
                        <td>User Id:</td>
                        <td><input type="textfield" name="userid" id="userid" onchange="doChecking();"/></td>
                        <td><div id="status"></div></td>
                    </tr>
                    <tr>
                        <td>Name:</td>
                        <td><input type="textfield" name="name"/></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td>Semester:</td>
                        <td><input type="textfield" name="name"/></td>
                        <td></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="submit"/></td>
                        <td></td>
                    </tr>
                </table>
            </form> 
        </div>
        <div class="col-3"></div>
    </div>
</body>
</html>