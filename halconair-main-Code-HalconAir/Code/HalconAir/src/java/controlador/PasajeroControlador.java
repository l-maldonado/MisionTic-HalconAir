/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Pasajero;
import modelo.PasajeroDAO;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author toliv
 */
@WebServlet(name = "PasajeroControlador", urlPatterns = {"/PasajeroControlador"})

public class PasajeroControlador extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        try {
            PasajeroDAO pasajeroDAO = new PasajeroDAO();

        } catch (ClassNotFoundException ex) {
            Logger.getLogger(PasajeroControlador.class.getName()).log(Level.SEVERE, null, ex);
        }

        String accion;
        RequestDispatcher dispatcher = null;

        accion = request.getParameter("accion");

        if (accion == null || accion.isEmpty()) {
            dispatcher = request.getRequestDispatcher("pasajerotbl.jsp");
            List<Pasajero> listaPasajero;
            listaPasajero = PasajeroDAO.listarPasajero();
            request.setAttribute("lista", listaPasajero);
        } else if (accion.equals("nuevo")) {
            dispatcher = request.getRequestDispatcher("addpasajero.jsp");
        } else if (accion.equals("insertar")) {
            String docu_clie = request.getParameter("docu_clie");
            String tipodocu_clie = request.getParameter("tipodocu_clie");
            String nombre_clie = request.getParameter("nombre_clie");
            String apellido_clie = request.getParameter("apellido_clie");
            String fechanac_clie = request.getParameter("fechanac_clie");
            String direccion_clie = request.getParameter("direccion_clie");
            String telefono_clie = request.getParameter("telefono_clie");

            Pasajero pasajero = new Pasajero(0, docu_clie, tipodocu_clie, nombre_clie,
                    apellido_clie, fechanac_clie, direccion_clie, telefono_clie);
            PasajeroDAO.insertarPasajero(pasajero);

            dispatcher = request.getRequestDispatcher("pasajerotbl.jsp ");
            List<Pasajero> listaPasajero;
            listaPasajero = PasajeroDAO.listarPasajero();
            request.setAttribute("lista", listaPasajero);

        } else if (accion.equals("modificar")) {
            
            dispatcher = request.getRequestDispatcher("actualizarpasajero.jsp");
            double id_pasaj =  Double.parseDouble(request.getParameter("id_pasajero") ) ;
            int id_pasajero;
            //id_pasajero =  Integer.parseInt(request.getParameter("id_pasajero") ) ;
            id_pasajero =  (int) id_pasaj ;
            
            Pasajero pasajero = PasajeroDAO.mostrarPasajero(id_pasajero);
            request.setAttribute("pasajero", pasajero);
            

        } else if (accion.equals("actualizar")) {
            //int id_pasajero = Integer.parseInt(request.getParameter("id_pasajero"));
            double id_pasaj =  Double.parseDouble(request.getParameter("id_pasajero") ) ;
            int id_pasajero;
            id_pasajero =  (int) id_pasaj ;

            String docu_clie = request.getParameter("docu_clie");
            String tipodocu_clie = request.getParameter("tipodocu_clie");
            String nombre_clie = request.getParameter("nombre_clie");
            String apellido_clie = request.getParameter("apellido_clie");
            String fechanac_clie = request.getParameter("fechanac_clie");
            String direccion_clie = request.getParameter("direccion_clie");
            String telefono_clie = request.getParameter("telefono_clie");

            Pasajero pasajero = new Pasajero(id_pasajero, docu_clie, tipodocu_clie, nombre_clie,
                    apellido_clie, fechanac_clie, direccion_clie, telefono_clie);
            PasajeroDAO.actualizarPasajero(pasajero);

            dispatcher = request.getRequestDispatcher("pasajerotbl.jsp");
            List<Pasajero> listaPasajero;
            listaPasajero = PasajeroDAO.listarPasajero();
            request.setAttribute("lista", listaPasajero);

        } else if (accion.equals("eliminar")) {
            //id_pasajero = Integer.parseInt(request.getParameter("id_pasajero"));
            double id_pasaj =  Double.parseDouble(request.getParameter("id_pasajero") ) ;
            int id_pasajero;
            id_pasajero =  (int) id_pasaj ;

            PasajeroDAO.eliminarPasajero(id_pasajero);

            dispatcher = request.getRequestDispatcher("pasajerotbl.jsp");
            List<Pasajero> listaPasajero;
            listaPasajero = PasajeroDAO.listarPasajero();
            request.setAttribute("lista", listaPasajero);
        } else {
            dispatcher = request.getRequestDispatcher("pasajerotbl.jsp");
            List<Pasajero> listaPasajero;
            listaPasajero = PasajeroDAO.listarPasajero();
            request.setAttribute("lista", listaPasajero);
        }

        dispatcher.forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Descripcion";
    }

}
