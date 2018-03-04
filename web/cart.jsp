
<%@page import="persistence.CartDB"%>
<%@page import="java.util.Map"%>
<%@page import="model.Product"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <%@include file="head.jsp" %>
        <title>Mi carrito</title>
    </head>
    <body>
        
        <%@include file="nav.jsp" %>
        
        <section class="container mt-2">
            
            <h2>Mi carrito</h2>
            
            <% for(Map.Entry<Integer, Integer> item : CartDB.cart.getCart().entrySet()) { %>
                
                <% Product product = ProductDB.getProduct(item.getKey()); %>
                
                    <div class="row mt-2">
            
                        <div class="col-sm-3 col-md-2 cart-img">
                            <% out.println("<img class='img-thumbnail' src="+ product.getImg() +" alt='producto 1'>"); %>
                        </div>

                        <div class="col-sm-7 col-md-8 d-flex flex-wrap align-content-center">
                            <h3 class="w-100 m-0"><%= product.getTitle() %></h3>
                            <p class="w-100 m-0"><%= product.getText() %></p>
                            <p class="w-100 m-0">Cantidad: <%= item.getValue() %></p>
                            <p class="w-100 m-0"><%= product.getPrice() %> €</p>
                        </div>

                        <div class="col-sm-2 d-flex">
                            <i class="fas fa-trash align-self-center"></i>
                        </div>
                
                    </div>
            
            <% } %>
            
        </section>
        
        
        <%@include file="scripts.jsp" %>
    </body>
</html>
