/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pe.edu.upeu.pruebaCalderon.config;

/**
 *
 * @author alum.fial8
 */
public class Conexion {
     private static Connection conex=null;
   private static String url="jdbc:mysql://localhost/bd_visitas";
   private static String usuario="root";
   private static String clave="root";
   
   
   public static Connection getConexion()
   {
       try{
           Class.forName("com.mysql.jdbc.Driver");
       }catch()
       {
           
       }
       return conex;
   }
}
    
}
