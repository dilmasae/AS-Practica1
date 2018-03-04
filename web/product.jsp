<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% String id = request.getParameter("id"); %>
<% String img = request.getParameter("img"); %>

<article class="card">
    
    <% out.println("<img class='card-img-top' src="+img+" alt='producto 1'>"); %>
    
    <div class="card-body">
      <h5 class="card-title"><% out.print(request.getParameter("title")); %></h5>
      <p class="card-text"><% out.print(request.getParameter("text")); %></p>
      <form action="FrontServlet" method="POST">
          <% out.println("<input type='hidden' name='idProducto' value="+id+">"); %>
          <input hidden="true" name="command" value="cart.AddCartCommand">
          <button class="btn btn-primary">
              <i class="fas fa-cart-plus"></i> <% out.print(request.getParameter("price")); %>€ 
          </button>
      </form>
    </div>
</article>