<%-- 
    Document   : Mantenimiento
    Created on : 23/09/2021, 10:56:37 a. m.
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
        <title>Datos Pasajeros</title>
        <link rel="stylesheet" href="https://necolas.github.io/normalize.css/8.0.0/normalize.css">
        <link href="https://fonts.googleapis.com/css?family=Krub:400,700" rel="stylesheet">
        <link rel="stylesheet" href="css/style.css">
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/> 
    </head>
    <body>
        <div class="container mt-4"> 
            <header class="header">
                <h1>MinTic <span>2022</span></h1>
            </header>

            <div class="container mt-4"> 
                <div class="card"> 
                    <div class="card-header ">
                        <h3>Mantenimiento Tabla Pasajeros</h3>
                    </div> 
                    <div class="card-header ">
                        <a class="btn btn-primary
                           " href="PasajeroControlador?accion=nuevo">Nuevo registro</a>
                    </div> 
                    
                    <div class="card-body">
                        <table class="table table-hover">
                            <thead>
                                <tr>
                                    <th>Documento</th>
                                    <th>TipoDoc</th>
                                    <th>Nombre</th>
                                    <th>Apellido</th>
                                    <th>Fecha Nac</th>
                                    <th>Direccion</th>
                                    <th>Telefono</th>
                                    <th>Acciones</th>
                                    <th></th>
                                </tr>
                            </thead>
                            <tbody>
                                <c:forEach var="pasajero" items="${lista}" >
                                    <tr>
                                        <td> <c:out value="${pasajero.docu_clie}" /> </td>
                                        <td> <c:out value="${pasajero.tipodocu_clie}" />  </td>
                                        <td> <c:out value="${pasajero.nombre_clie}" />  </td>
                                        <td> <c:out value="${pasajero.apellido_clie}" />  </td>
                                        <td> <c:out value="${pasajero.fechanac_clie}" />  </td>
                                        <td> <c:out value="${pasajero.direccion_clie}" />  </td>
                                        <td> <c:out value="${pasajero.telefono_clie}" />  </td>
                                        <td> <a class="btn btn-warning"
                                                href="PasajeroControlador?accion=modificar&id_pasajero=
                                                <c:out value="${pasajero.id_pasajero}"/>">Modificar</a> </td>
                                        <td> <a class="btn btn-danger"
                                                href="PasajeroControlador?accion=eliminar&id_pasajero=
                                                <c:out value="${pasajero.id_pasajero}"/>">Eliminar</a> </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>  
                    </div>
                </div>

            </div>
            <footer class="footer">
                <p>Todos los derechos reservados.</p>
            </footer>

        </div>

    </body>

</html>
