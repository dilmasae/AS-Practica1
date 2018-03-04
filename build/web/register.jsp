
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
            <form action="#" method="POST">
                
                <div class="form-group">
                    <label for="name">Nombre</label>
                    <input type="text" class="form-control" id="name" aria-describedby="emailHelp" placeholder="Escribe tu nombre" required>
                </div>
                
                <div class="form-group">
                    <label for="lastName">Apellido</label>
                    <input type="text" class="form-control" id="lastName" aria-describedby="emailHelp" placeholder="Escribe tu apellido" required>
                </div>
                
                <div class="form-group">
                    <label for="birthDate">Apellido</label>
                    <input type="date" class="form-control" id="birthDate" aria-describedby="emailHelp" placeholder="dd/mm/yyyy" required>
                </div>
                                
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" class="form-control" id="email" aria-describedby="emailHelp" placeholder="Escribe tu email" required>
                </div>
                
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" class="form-control" id="password" aria-describedby="emailHelp" placeholder="*****" required>
                </div>
                
                <button type="submit" class="btn btn-primary w-100">Crear usuario</button>
                
            </form>
        </div>
        
        
        <%@include file="scripts.jsp" %>
    </body>
</html>
