
package latihanjavacrud;

import java.sql.*;
/**
 *
 * @author ridho
 */
public class KoneksiMysql {
    
    Connection conn = null;
    
    public static Connection MyKoneksi(){
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
             Connection conn = DriverManager.getConnection
        ("jdbc:mysql://localhost/db_java_crud", "root", "");
             
             if(conn != null){
                  System.err.println("Koneksi Terhubung");
             }
            
             return conn;
            
        } catch (Exception e) {
            System.err.println("Error : "+ e);
            return null;
        }
    }
    
}
