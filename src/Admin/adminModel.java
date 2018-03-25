package Admin;

import DB.DB_connect;
import java.sql.Connection;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class adminModel {
    
    Connection con;
     Statement st;
     DB_connect db = new DB_connect();
    
    public void insertProducts(String name, int amount_left, String type, int price){
      try
 {
     con = db.ConnectDb();
     st = con.createStatement();
     String insert = "INSERT INTO products (name, amount_left, type, price)" +  "VALUES('"+ name +"','"+amount_left+"','"+type+"','"+price+"');";
     st.executeUpdate(insert);
    
     JOptionPane.showMessageDialog(null, "Data inserted succesfully !");   
 }
 catch(Exception e){
 }   
}
    
    public void updateProducts(String name, int amount_left, String type, double price, int id){
         try
 {
     con=db.ConnectDb();
     st=con.createStatement();
     String insert = "UPDATE products " + "SET name = '"+ name +"', amount_left = '"+ amount_left +"', type = '"+ type +"', price = '"+ price +"' WHERE id in ('"+ id +"')";
     st.executeUpdate(insert);
     
         JOptionPane.showMessageDialog(null, "Data updated succesfully !");
 }
 catch(Exception e){
}           
    }
    
    public void deleteProducts(int id){
        try{
         
         con = db.ConnectDb();
         st=con.createStatement();
         String query ="delete from products where id = '" + id + "'";
         st.execute(query);
       
         JOptionPane.showMessageDialog(null, "Data deleted succesfully !");
  }  
 catch (Exception e){
  }      
 }
    
     public void addEmployee(String username, String password){
          try
 {
      con=db.ConnectDb();
     st=con.createStatement();
     String insert = "INSERT INTO users (username, password)" +  "VALUES('"+ username +"','"+password+"');";
     st.executeUpdate(insert);
    
     JOptionPane.showMessageDialog(null, "Data inserted succesfully !");
   }
 catch(Exception e){
 }   
     }
     
      public void deleteEmployee(int id){
          try{
       
         con = db.ConnectDb();
         st=con.createStatement();
         String query ="delete from users where id = '" + id + "'";
         st.execute(query);
        
       JOptionPane.showMessageDialog(null, "Data deleted succesfully !");
  
     }  
          catch (Exception e){
        }  
      }
      
       public void deleteBills(int id){
            try{
      
         con = db.ConnectDb();
         st=con.createStatement();
         String query ="delete from bills where id = '" + id + "'";
         st.execute(query);
         
                  JOptionPane.showMessageDialog(null, "Data deleted succesfully !");
  
     }  catch (Exception e){
  }  
       }
}