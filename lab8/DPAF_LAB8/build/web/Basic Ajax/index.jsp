<%-- 
    Document   : index
    Created on : 29 Mar, 2022, 2:26:56 PM
    Author     : admin
--%>


<%
    int n = Integer.parseInt(request.getParameter("val"));

    for (int i = 1; i <= 10; i++) {
        out.print(i * n + "<br>");
    }

%>  

