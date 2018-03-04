
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% if(session.getAttribute("user") != null) response.sendRedirect("index.jsp"); %>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="head.jsp" %>
        <title>JSP Page</title>
    </head>
    <body>
        
        <%@include file="nav.jsp" %>
        
        <div class="auth">
            <form action="FrontServlet" method="POST">

                <% if(request.getAttribute("message") != null) { %>
                    <div class="alert alert-danger" role="alert">${message}</div>
                <% }%>
                
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" name="email" class="form-control" id="email" aria-describedby="emailHelp" placeholder="Escribe tu email" required>
                </div>
                
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" name="password" class="form-control" id="password" aria-describedby="emailHelp" placeholder="*****" required>
                </div>
                
                <input hidden="true" name="command" value="auth.LoginCommand">
                <button type="submit" class="btn btn-primary w-100">Login</button>
                
            </form>
        </div>
        
        
        <%@include file="scripts.jsp" %>
    </body>
</html>
