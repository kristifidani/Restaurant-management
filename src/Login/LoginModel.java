package Login;

import DB.DB_connect;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginModel {
    
    DB_connect db = new DB_connect();
    Connection con;
    PreparedStatement ps;
    boolean check = false;
    
    public boolean userRegistered(String username,String password){
        
        con = db.ConnectDb();
        try{
            ps = con.prepareStatement("SELECT `username`, `password` FROM `users` WHERE `username` = ? AND `password` = ?");
            ps.setString(1,username);
            ps.setString(2,password);
 
            ResultSet result = ps.executeQuery();
            if(result.next()){
                check=false;
            }else{
                check=true;
            }
             con.close();
             ps.close();
        } catch (SQLException ex){
            System.out.println(ex);
        }
      return check;
    }
}
