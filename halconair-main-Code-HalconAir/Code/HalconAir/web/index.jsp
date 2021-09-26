<%-- 
    Document   : index
    Created on : 4/09/2021, 6:25:58 p. m.
    Author     : toliv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <meta http-equiv="X-UA-Compatible" content="ie=edge">
        <title>Aerolínea HalconAir</title>
        <link rel="stylesheet" href="https://necolas.github.io/normalize.css/8.0.0/normalize.css">
        <link href="https://fonts.googleapis.com/css?family=Krub:400,700" rel="stylesheet">
        <!--  <link rel="stylesheet" href="css/style.css"> -->

        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <header class="header">
            <h1 class="text-center">Aerolínea HalconAir - MinTic 2022</h1>
        </header>

        <div class="container-fluid text-center">
            <nav class=" navbar navbar-expand-lg navbar-dark border-5 border-bottom bg-primary ">
                <button class="navbar-toggler" data-target="MenuNavegacion" data-toggle="collapse">
                    <span class="navbar-toggler-icon"></span>
                </button>

                <div id="MenuNavegacion" class="collapse navbar-collapse">   
                    <ul class="navbar-nav mr-auto ">
                        <li class="navbar-item active"><a class="nav-link" href="#">Inicio</a></li>
                        <li class="navbar-item active"><a class="nav-link" href="#">Nosotros</a></li>
                        <li class="navbar-item active"><a class="nav-link" href="#">Clientes</a></li>
                        <li class="navbar-item dropdown active">
                            <a class="nav-link dropdown-toggle" href="#" 
                               role="button" data-toggle="dropdown" >Mantenimiento</a>
                            <ul class="dropdown-menu"> 
                                <li><a class="dropdown-item" href="PasajeroControlador">Pasajero</a></li>
                                <li><a class="dropdown-item" href="#">Aeropuero</a></li>
                                <li><a class="dropdown-item" href="#">Avión</a></li>
                                <li><a class="dropdown-item" href="#">Vuelos</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>

            </nav>

        </div>


        <footer class="footer">
            <p>Todos los derechos reservados.</p>
        </footer>

        <script src="./js/bootstrap.bundle.min.js"></script>


    </body>

</html>
