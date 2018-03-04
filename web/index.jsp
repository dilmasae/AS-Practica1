<%-- 
    Author     : Edilma Alvarado
--%>
<%@page import="model.Product"%>
<%@page import="persistence.ProductDB"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <%@include file="head.jsp" %>
    <title>Venta de manualidades</title>
  </head>
  <body>
      
        <%@include file="nav.jsp" %>

        <section class="container my-carousel">
            <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
                <div class="carousel-inner">
                  <div class="carousel-item active">
                      <img class="d-block w-100" src="https://images.unsplash.com/photo-1486064315680-99051c121070?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=493a321d49a7bd6e16797204dea30902&auto=format&fit=crop&w=1500&q=80" alt="First slide">
                  </div>
                  <div class="carousel-item">
                    <img class="d-block w-100" src="https://images.unsplash.com/photo-1493259606967-571afaef3d81?ixlib=rb-0.3.5&s=1af272f01a0af41e96fd5cf665c8569a&auto=format&fit=crop&w=1500&q=80" alt="Second slide">
                  </div>
                  <div class="carousel-item">
                    <img class="d-block w-100" src="https://images.unsplash.com/photo-1511032881274-ce38e9144ea6?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjEyMDd9&s=e4625836df223357718cfc52a138a365&auto=format&fit=crop&w=1500&q=80" alt="Third slide">
                  </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleControls" role="button" data-slide="prev">
                  <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                  <span class="sr-only">Previous</span>
                </a>
                <a class="carousel-control-next" href="#carouselExampleControls" role="button" data-slide="next">
                  <span class="carousel-control-next-icon" aria-hidden="true"></span>
                  <span class="sr-only">Next</span>
                </a>
            </div>
        </section>
          
      <section class="container mt-2 products">
          
          <div class="row">
              
              <% for(Product product : ProductDB.getProducts()) { %>
              
              <div class="col-sm-4 mt-2">
                  <jsp:include page='product.jsp'>
                        <jsp:param name="id" value="<%= product.getId() %>"/>
                        <jsp:param name="img" value="<%= product.getImg() %>"/>
                        <jsp:param name="title" value="<%= product.getTitle() %>"/>
                        <jsp:param name="text" value="<%= product.getText() %>"/>
                        <jsp:param name="price" value="<%= product.getPrice() %>"/>
                  </jsp:include>
              </div>
              
              <% } %>
              
          </div>
          
      </section>
    
      <%@include file="footer.jsp" %>

    <%@include file="scripts.jsp" %>
  </body>
</html>