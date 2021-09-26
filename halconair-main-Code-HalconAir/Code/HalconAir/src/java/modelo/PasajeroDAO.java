/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author toliv
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class PasajeroDAO {

    static Connection conexion;

    public PasajeroDAO() throws ClassNotFoundException {
        Conexion con = new Conexion();
        conexion = con.getConexion();
    }

    public static List<Pasajero> listarPasajero() {
        PreparedStatement ps;
        ResultSet rs;
        List<Pasajero> lista = new ArrayList<>();

        try {
            ps = conexion.prepareStatement("SELECT * FROM pasajero");
            rs = ps.executeQuery();
            while (rs.next()) {
                int id_pasajero = rs.getInt("id_pasajero");
                String docu_clie = rs.getString("docu_clie");
                String tipodocu_clie = rs.getString("tipodocu_clie");
                String nombre_clie = rs.getString("nombre_clie");
                String apellido_clie = rs.getString("apellido_clie");
                String fechanac_clie = rs.getString("fechanac_clie");
                String direccion_clie = rs.getString("direccion_clie");
                String telefono_clie = rs.getString("telefono_clie");
                Pasajero pasajero = new Pasajero(id_pasajero, docu_clie, tipodocu_clie,
                        nombre_clie, apellido_clie, fechanac_clie, direccion_clie, telefono_clie);
                lista.add(pasajero);

            }
            return lista;

        } catch (SQLException e) {
            System.out.println("Error Listar  " + e.getMessage());
            return null;
        }

    }

    public static Pasajero mostrarPasajero(int _id_pasajero) {
        PreparedStatement ps;
        ResultSet rs;
        Pasajero pasajero = null;

        try {
            ps = conexion.prepareStatement("SELECT * FROM pasajero WHERE id_pasajero=?");
            ps.setInt(1, _id_pasajero);
            rs = ps.executeQuery();
            while (rs.next()) {
                int id_pasajero = rs.getInt("id_pasajero");
                String docu_clie = rs.getString("docu_clie");
                String tipodocu_clie = rs.getString("tipodocu_clie");
                String nombre_clie = rs.getString("nombre_clie");
                String apellido_clie = rs.getString("apellido_clie");
                String fechanac_clie = rs.getString("fechanac_clie");
                String direccion_clie = rs.getString("direccion_clie");
                String telefono_clie = rs.getString("telefono_clie");
                pasajero = new Pasajero(id_pasajero, docu_clie, tipodocu_clie,
                        nombre_clie, apellido_clie, fechanac_clie, direccion_clie, telefono_clie);
            }
            return pasajero;

        } catch (SQLException e) {
            System.out.println("Error Mostrar " + e.getMessage());
            return null;
        }
    }

    public static boolean insertarPasajero(Pasajero pasajero) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("INSERT INTO pasajero (docu_clie,tipodocu_clie,"
                    + "nombre_clie,apellido_clie,fechanac_clie,direccion_clie,telefono_clie) "
                    + "VALUES (?,?,?,?,?,?,?)");
            ps.setString(1, pasajero.getDocu_clie());
            ps.setString(2, pasajero.getTipodocu_clie());
            ps.setString(3, pasajero.getNombre_clie());
            ps.setString(4, pasajero.getApellido_clie());
            ps.setString(5, pasajero.getFechanac_clie());
            ps.setString(6, pasajero.getDireccion_clie());
            ps.setString(7, pasajero.getTelefono_clie());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println("Error Insertar " + e.getMessage());
            return false;
        }
    }

    public static boolean actualizarPasajero(Pasajero pasajero) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("UPDATE pasajero SET docu_clie=?,"
                    + "tipodocu_clie=?,nombre_clie=?,apellido_clie=?,fechanac_clie=?,"
                    + "direccion_clie=?,telefono_clie=? WHERE id_pasajero=? ");
            ps.setString(1, pasajero.getDocu_clie());
            ps.setString(2, pasajero.getTipodocu_clie());
            ps.setString(3, pasajero.getNombre_clie());
            ps.setString(4, pasajero.getApellido_clie());
            ps.setString(5, pasajero.getFechanac_clie());
            ps.setString(6, pasajero.getDireccion_clie());
            ps.setString(7, pasajero.getTelefono_clie());
            ps.setInt(8, pasajero.getId_pasajero());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println("Error Actualizar " + e.getMessage());
            return false;
        }
    }

    public static boolean eliminarPasajero(int _id_pasajero) {
        PreparedStatement ps;

        try {
            ps = conexion.prepareStatement("DELETE FROM pasajero "
                    + " WHERE id_pasajero=? ");
         
            ps.setInt(1, _id_pasajero);
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.out.println("Error Eliminar " + e.getMessage());
            return false;
        }
    }

}
