<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Student Registration for Programming Competition</title>
    </head>
    <body>
        <h1>${mainHeader}</h1>
        <h1>Student Registration for Programming Competition</h1><br>
        <h3><form:errors path="student.*" /></h3><br>
        <form action="submitAdmissionForm.html" method="POST">
            <!-- <p>
            Name: <input type="text" name="studentName" />
            </p>
            <p>
            Contact No.: <input type="text" name="studentContact" />
            </p>
            <input type="submit" value="Register Me!"/>
            -->
            <table>
                <tr><td>Student's Name : </td><td><input type="text" name="studentName" 
                                                         /></td></tr>
                <tr><td>Student's Email: </td><td><input type="text" name="studentEmail" 
                                                         /></td></tr>
                <tr><td>Student's Mob No.: </td><td><input type="text" name="studentMobile" 
                                                           /></td></tr>
                <tr><td>Student's Date of Birth: </td><td><input type="text" name="studentDoB" 
                                                                 /></td></tr>
                <tr><td>Student's Skills set : </td><td> <select name='studentSkills' multiple>
                            <option value="Java">Java</option>
                            <option value="C++">C++</option>
                            <option value="C">C</option>
                            <option value="Python">Python</option>
                        </select></td></tr>
                <tr><td></td><td><input type="submit" value="RegisterMe!"/></td></tr>
            </table>
        </form>
    </body>
</html>