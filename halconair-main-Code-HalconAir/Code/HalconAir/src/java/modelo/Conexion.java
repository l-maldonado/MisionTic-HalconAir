/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author to
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import java.sql.SQLException;

public class Conexion {
    private final String conectorjdbc= "jdbc:mysql:";
    private final String host= "localhost:3306";
    private final String baseDatos= "halconair";
    private final String username= "admin";
    private final String password= "admin123";

    private Connection conexion;
     
    public Connection getConexion() throws ClassNotFoundException  {
        try {
            
            String conectaDb = conectorjdbc+"//"+host+"/"+baseDatos+"?serverTimezone=UTC";
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(conectaDb,username,password);
            if (conexion != null) {
                System.out.println("Conexion exitosa a la Base de Datos ");
            }

        } catch(SQLException e ) {
            System.out.println("Error de conexion a la BD " + e.getMessage());
        }
        return conexion;
    }
   
   
    
}
