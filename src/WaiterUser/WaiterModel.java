package WaiterUser;

import DB.DB_connect;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;


 public class WaiterModel {
     
     Connection con;
     Statement st;
     DB_connect db = new DB_connect();

    public void insertTable(String waiter,String order,String ready){
    try
 {
     con=db.ConnectDb();
     st = con.createStatement();
     String insert = "INSERT INTO kitchen (waiter, order_name, ready)" +  "VALUES('"+ waiter +"','"+order+"','"+ready+"');";
     st.executeUpdate(insert);
     
         JOptionPane.showMessageDialog(null, "Data inserted succesfully !");
  }
 catch(Exception e){
 }    
}
    
    public void updateAmount(int amountleftreal,String name){
        try
 {
     con=db.ConnectDb();
     st = con.createStatement();
     String insert = "UPDATE products " + "SET amount_left = '"+ amountleftreal +"' WHERE name in ('"+ name +"')";
     st.executeUpdate(insert);
     
     JOptionPane.showMessageDialog(null, "Data updated succesfully !");
 }
 catch(Exception e){
}    
    }
   
    public void insertBill(String name,String date){
          try
 {
     con=db.ConnectDb();
     st = con.createStatement();
     String insert = "INSERT INTO bills (name, bill)" +  "VALUES('"+ name +"','"+date+"');";
     st.executeUpdate(insert);
 }
 catch(Exception e){
 }   
    }
    
     public void deleteFromInsertTable(int id){
  
  try{
         con = db.ConnectDb();
         st = con.createStatement();
         String query ="delete from kitchen where id = '" + id + "'";
         st.execute(query);
         
         JOptionPane.showMessageDialog(null, "Data deleted succesfully !");

     }  catch (Exception e){
}   
    }
    
}

