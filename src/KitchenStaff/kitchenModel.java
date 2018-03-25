package KitchenStaff;

import DB.DB_connect;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class kitchenModel {
    
     Connection con;
     Statement st;
     DB_connect db = new DB_connect();
     
    public void updateProduct(int id ,String ready){
         try
 {
     con=db.ConnectDb();
     st = con.createStatement();
     String insert = "UPDATE kitchen " + "SET ready = '"+ id +"', ready = '"+ ready +"' WHERE id in ('"+ id +"')";
     st.executeUpdate(insert);
    
     JOptionPane.showMessageDialog(null, "Data updated succesfully !");
 }
 catch(Exception e){
}    
    }
}
