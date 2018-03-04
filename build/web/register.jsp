
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<% if(session.getAttribute("user") != null) response.sendRedirect("index.jsp"); %>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="head.jsp" %>
        <title>Registro</title>
    </head>
    <body>
        
        <%@include file="nav.jsp" %>
        
        <div class="auth">
            <form action="FrontServlet" method="POST">
                
                <% if(request.getAttribute("message") != null) { %>
                    <div class="alert alert-success" role="alert">${message}</div>
                <% }%>
                <% if(request.getAttribute("error") != null) { %>
                    <div class="alert alert-danger" role="alert">${error}</div>
                <% }%>
                
                <div class="form-group">
                    <label for="name">Nombre</label>
                    <input type="text" name="name" class="form-control" id="name" aria-describedby="emailHelp" placeholder="Escribe tu nombre" required>
                </div>
                
                <div class="form-group">
                    <label for="lastName">Apellido</label>
                    <input type="text" name="lastName" class="form-control" id="lastName" aria-describedby="emailHelp" placeholder="Escribe tu apellido" required>
                </div>
                
                <div class="form-group">
                    <label for="birthDate">Apellido</label>
                    <input type="date" name="birthDate" class="form-control" id="birthDate" aria-describedby="emailHelp" placeholder="dd/mm/yyyy" required>
                </div>
                                
                <div class="form-group">
                    <label for="email">Email</label>
                    <input type="email" name="email" class="form-control" id="email" aria-describedby="emailHelp" placeholder="Escribe tu email" required>
                </div>
                
                <div class="form-group">
                    <label for="password">Password</label>
                    <input type="password" name="password" class="form-control" id="password" aria-describedby="emailHelp" placeholder="*****" required>
                </div>
                
                <input hidden="true" name="command" value="auth.RegisterCommand">
                <button type="submit" class="btn btn-primary w-100">Crear usuario</button>
                
            </form>
        </div>
        
        
        <%@include file="scripts.jsp" %>
    </body>
</html>
