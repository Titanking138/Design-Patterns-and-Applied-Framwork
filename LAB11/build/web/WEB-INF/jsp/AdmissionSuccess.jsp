<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html;charset=UTF-8">
        <title>Registration Status</title>
    </head>
    <body>
        <h1>${mainHeader}</h1>
        <h1>Congratulations! You registration for Programming Competition is 
            Successful.</h1>

        <h1>${headerMsg}</h1>
        <table>
            <tr><td>Student's Name :</td> <td>${student.studentName}</td></tr>
            <tr><td>Student's Email :</td> <td>${student.studentEmail}</td></tr>
            <tr><td>Student's Mob. No. :</td><td>${student.studentMobile}</td></tr>
            <tr><td>Student's Date of Birth :</td><td>${student.studentDoB}</td></tr>
            <tr><td>Student's Skills :</td> <td>${student.studentSkills}</td></tr>
        </table>
        <a href="Dashboard.jsp">Visit your Dashboard</a>
    </body>
</html>
