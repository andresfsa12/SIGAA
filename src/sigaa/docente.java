/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sigaa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andres
 */
public class docente {
            public static void main(String[] args) {
        String usuario = "root";
        String password = "";
        String url = "jdbc:mysql://localhost:3306/mydb";
         Connection conexion;
         Statement statement;
         ResultSet rs;
         
       
    try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
        Logger.getLogger(docente.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    try {
        conexion = DriverManager.getConnection(url,usuario,password);
        statement = conexion.createStatement();
        statement.executeUpdate("UPDATE docente SET NOMBRE = 'Aurora' WHERE ID='45454545' ");
        rs = statement.executeQuery("SELECT * FROM docente");
        rs.next();
        do {
               System.out.println(rs.getInt("ID")+" : "+rs.getString("NOMBRE"));
        }while (rs.next());
        
        } catch (SQLException ex) {
         Logger.getLogger(docente.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
}
