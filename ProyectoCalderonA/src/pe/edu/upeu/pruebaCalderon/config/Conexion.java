/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.pruebaCalderon.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author alum.fial8
 */
public class Conexion {
     private static Connection conex=null;
   private static final String url="jdbc:mysql://localhost/bd_visitas";
   private static final String usuario="root";
   private static final String clave="root";
   
   
   public static Connection getConexion()
   {
       try{
           Class.forName("com.mysql.jdbc.Driver");
           if(conex==null){
           conex=DriverManager.getConnection(url,usuario,clave);//fffffffffffffff
           
           }else{
           conex=null;
           }
                          
       } catch (ClassNotFoundException | SQLException e) {
             JOptionPane.showMessageDialog(null,e);
       }
      
       return conex;
   }
}
    

