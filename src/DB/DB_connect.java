package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DB_connect {
     
    Connection con;
     private static final String URL = "jdbc:mysql://localhost/restaurant management";
     private static final String USERNAME="root";
     private static final String PASSWORD="root";
     public static String LOGGED_USER=null;
    
     public Connection ConnectDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection(URL,USERNAME,PASSWORD);
            return con;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
