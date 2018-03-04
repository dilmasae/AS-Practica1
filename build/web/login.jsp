
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="head.jsp" %>
        <title>JSP Page</title>
    </head>
    <body>
        
        <%@include file="nav.jsp" %>
        
        <div class="auth">
            <form action="#" method="POST">
                                
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" class="form-control" id="email" aria-describedby="emailHelp" placeholder="Escribe tu email">
                </div>
                
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" class="form-control" id="password" aria-describedby="emailHelp" placeholder="*****">
                </div>
                
                <button type="submit" class="btn btn-primary w-100">Login</button>
                
            </form>
        </div>
        
        
        <%@include file="scripts.jsp" %>
    </body>
</html>
