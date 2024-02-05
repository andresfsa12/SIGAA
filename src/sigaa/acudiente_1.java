package sigaa;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Scanner;

public class acudiente_1 {
    
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
        Logger.getLogger(acudiente_1.class.getName()).log(Level.SEVERE, null, ex);
         }
    
    try {
        conexion = DriverManager.getConnection(url,usuario,password);
        statement = conexion.createStatement();
        statement.executeUpdate("INSERT INTO acudiente (ID, NOMBRE, APELLIDO, N_CELULAR, DIRECCION)  VALUES ('22222', 'Bibiana', 'Vargas', '318888888', 'Cra 51 20 15') ");
        rs = statement.executeQuery("SELECT * FROM acudiente"); 
        rs.next();
        do {
               System.out.println(rs.getInt("ID")+" : "+rs.getString("NOMBRE"));
        }while (rs.next());
        
        } catch (SQLException ex) {
         Logger.getLogger(acudiente_1.class.getName()).log(Level.SEVERE, null, ex);
         }
    }
    
}

