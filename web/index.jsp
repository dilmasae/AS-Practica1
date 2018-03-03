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
    <title>Hello, world!</title>
  </head>
  <body>
      
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
                  <a href="#">
                      <i class="fas fa-shopping-cart"></i>
                  </a>
              </div>
              <div class="my-2 my-lg-0">  
                  <a href="#">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">login</button>
                  </a>
              </div>
            </div>
        
        </div>
        
    </nav>
      

          
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
                  <article class="card">
                    <img class="card-img-top" src="http://www.lorempixel.com/300/300" alt="producto 1">
                    <div class="card-body">
                      <h5 class="card-title">Card title</h5>
                      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                      <a href="#" class="btn btn-primary"><i class="fas fa-cart-plus"></i> 5€ </a>
                    </div>
                  </article>
              </div>
            
              
              <div class="col-sm-4 mt-2">
                  <article class="card">
                    <img class="card-img-top" src="http://www.lorempixel.com/300/300" alt="producto 1">
                    <div class="card-body">
                      <h5 class="card-title">Card title</h5>
                      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                      <a href="#" class="btn btn-primary"><i class="fas fa-cart-plus"></i> 5€ </a>
                    </div>
                  </article>
              </div>
              
              <div class="col-sm-4 mt-2">
                  <article class="card">
                    <img class="card-img-top" src="http://www.lorempixel.com/300/300" alt="producto 1">
                    <div class="card-body">
                      <h5 class="card-title">Card title</h5>
                      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                      <a href="#" class="btn btn-primary"><i class="fas fa-cart-plus"></i> 5€ </a>
                    </div>
                  </article>
              </div>
              
              <div class="col-sm-4 mt-2">
                  <article class="card">
                    <img class="card-img-top" src="http://www.lorempixel.com/300/300" alt="producto 1">
                    <div class="card-body">
                      <h5 class="card-title">Card title</h5>
                      <p class="card-text">Some quick example text to build on the card title and make up the bulk of the card's content.</p>
                      <a href="#" class="btn btn-primary"><i class="fas fa-cart-plus"></i> 6€</a>
                    </div>
                  </article>
              </div>
              
          </div>
          
          
      </section>
    
      <footer class="bg-secondary mt-4">
          <div class="container text-center text-white p-4">
              Dilma
          </div>
      </footer>

    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="js/bootstrap.js"></script> 
    <script defer src="https://use.fontawesome.com/releases/v5.0.8/js/all.js"></script>
  </body>
</html>