<%@page import="persistence.ProductDB"%>
<nav class="navbar navbar-expand-lg navbar-light bg-light">
        
        <div class="container">
            
            <a class="navbar-brand" href="#">Navbar</a>
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
              <span class="navbar-toggler-icon"></span>
            </button>

            <div class="collapse navbar-collapse" id="navbarSupportedContent">
              <ul class="navbar-nav mr-auto">
                <li class="nav-item active">
                  <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
                </li>

              </ul>
                
                <div class="my-2 my-lg-0 mr-3">  
                  <a href="#" class="decoration-none">
                      <i class="fas fa-shopping-cart"></i>
                      <span class="badge badge-light"><%= ProductDB.cart.getCart().size() %></span>
                  </a>
              </div>
              <div class="my-2 my-lg-0">
                  
                  <% if (session.getAttribute("user") == null) { %>
                    <a href="login.jsp">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">login</button>
                    </a>
                    <a href="#">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">registro</button>
                    </a>
                  <% } else { %>
                    <a href="#">
                        <button class="btn btn-outline-success my-2 my-sm-0" type="submit">log out</button>
                    </a>
                  <% }%>
                  
                  
              </div>
            </div>
        
        </div>
        
    </nav>