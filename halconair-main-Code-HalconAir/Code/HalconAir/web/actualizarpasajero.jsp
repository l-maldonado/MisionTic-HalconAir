<%-- 
    Document   : actualizar
    Created on : 22/09/2021, 4:57:30 p. m.
    Author     : toliv
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Actualizar</title>
        <!--        <link rel="stylesheet" href="css/style.css">  -->
        <link href="css/bootstrap.css" rel="stylesheet" type="text/css"/>
    </head>
    <body>
        <div class="container mt-4 "> 
            <div class="card">
                <div class="card-header">
                    <h3>Actualizar registro Pasajero</h3>
                </div>
                    <br/> 
                <div class="card-body">
                    <form action="PasajeroControlador?accion=actualizar" method="POST" autocomplete="off">
                        <input class="form-control" id="id_pasajero" name="id_pasajero" type="hidden" 
                               value="<c:out value="${pasajero.id_pasajero}" />" />
                        <label>Documento:</label>
                        <input class="form-control" id="docu_clie" name="docu_clie" type="text" 
                               value="<c:out value="${pasajero.docu_clie}" />" />
                        <label>Tipo Documento:</label>
                        <input class="form-control" id="tipodocu_clie" name="tipodocu_clie" type="text" 
                               value="<c:out value="${pasajero.tipodocu_clie}" />" />
                        <label>Nombre:</label>
                        <input class="form-control" id="nombre_clie" name="nombre_clie" type="text" 
                               value="<c:out value="${pasajero.nombre_clie}" />" />
                        <label>Apellido:</label>
                        <input class="form-control" id="apellido_clie" name="apellido_clie" type="text" 
                               value="<c:out value="${pasajero.apellido_clie}" />" />
                        <label>Fecha Nacimiento:</label>
                        <input class="form-control" id="fechanac_clie" name="fechanac_clie" type="text" 
                               value="<c:out value="${pasajero.fechanac_clie}" />" />
                        <label>Direccion:</label>
                        <input class="form-control" id="direccion_clie" name="direccion_clie" type="text" 
                               value="<c:out value="${pasajero.direccion_clie}" />" />
                        <label>Telefono:</label>
                        <input class="form-control" id="telefono_clie" name="telefono_clie" type="text" 
                               value="<c:out value="${pasajero.telefono_clie}" />" />

                        <br/> 
                        <button id="guardar" name="guardar" type="submit">Guardar</button>
                        <a href="PasajeroControlador?accion=pasajerotbl">Regresar</a>
    
                    </form>
                </div>

            </div>
        </div>
    </body>
</html>
