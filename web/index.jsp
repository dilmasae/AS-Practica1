<%-- 
    Author     : Edilma Alvarado
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="css/bootstrap.min.css" >
    <link rel="stylesheet" href="css/styles.css" >
    <title>Dilma</title>
  </head>
  <body>
      
        <%@include file="nav.jsp" %>

        <section class="container my-carousel">
            <div id="carouselExampleControls" class="carousel slide" data-ride="carousel">
                <div class="carousel-inner">
                  <div class="carousel-item active">
                      <img class="d-block w-100" src="http://www.lorempixel.com/1400/500" alt="First slide">
                  </div>
                  <div class="carousel-item">
                    <img class="d-block w-100" src="http://www.lorempixel.com/1400/500" alt="Second slide">
                  </div>
                  <div class="carousel-item">
                    <img class="d-block w-100" src="http://www.lorempixel.com/1400/500" alt="Third slide">
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
              
              <div class="col-sm-4 mt-2">
                  <jsp:include page='product.jsp'>
                        <jsp:param name="img" value="http://www.lorempixel.com/300/300"/>
                        <jsp:param name="title" value="Card title 1"/>
                        <jsp:param name="text" value="Some quick example text to build on the card title and make up the bulk of the card's content."/>
                        <jsp:param name="price" value="5"/>
                  </jsp:include>
              </div>
            
              
              <div class="col-sm-4 mt-2">
                    <jsp:include page='product.jsp'>
                        <jsp:param name="img" value="http://www.lorempixel.com/300/300"/>
                        <jsp:param name="title" value="Card title 2"/>
                        <jsp:param name="text" value="Some quick example text to build on the card title and make up the bulk of the card's content."/>
                        <jsp:param name="price" value="10"/>
                  </jsp:include>
              </div>
              
              <div class="col-sm-4 mt-2">
                    <jsp:include page='product.jsp'>
                        <jsp:param name="img" value="http://www.lorempixel.com/300/300"/>
                        <jsp:param name="title" value="Card title 3"/>
                        <jsp:param name="text" value="Some quick example text to build on the card title and make up the bulk of the card's content."/>
                        <jsp:param name="price" value="45"/>
                  </jsp:include>
              </div>
              
              <div class="col-sm-4 mt-2">
                    <jsp:include page='product.jsp'>
                        <jsp:param name="img" value="http://www.lorempixel.com/300/300"/>
                        <jsp:param name="title" value="Card title"/>
                        <jsp:param name="text" value="Some quick example text to build on the card title and make up the bulk of the card's content."/>
                        <jsp:param name="price" value="10"/>
                    </jsp:include>
              </div>
              
          </div>
          
      </section>
    
      <%@include file="footer.jsp" %>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="js/bootstrap.js"></script> 
    <script defer src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
  </body>
</html>