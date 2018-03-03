<%@page contentType="text/html" pageEncoding="UTF-8"%>

<article class="card">
    <img class="card-img-top" src="http://www.lorempixel.com/300/300" alt="producto 1">
    <div class="card-body">
      <h5 class="card-title"><% out.print(request.getParameter("title")); %></h5>
      <p class="card-text"><% out.print(request.getParameter("text")); %></p>
      <a href="#" class="btn btn-primary"><i class="fas fa-cart-plus"></i> <% out.print(request.getParameter("price")); %>€ </a>
    </div>
</article>