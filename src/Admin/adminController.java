package Admin;

import javax.swing.JOptionPane;

public class adminController {
    
    adminModel a = new adminModel();
    boolean check = false;
    
    public boolean validateAdminAddEmployee(String username, String password){
        
        if(username.isEmpty() || password.isEmpty() ){
            JOptionPane.showMessageDialog(null, "Please enter username and password !");
        }else{
                check=true;
                a.addEmployee(username, password);
            }     
    return check;
    }
    
     public boolean validateAdminAddProduct(String name, String amount_left, String type, String price){
        
        if(name.isEmpty() || type.isEmpty() || amount_left.isEmpty()|| price.isEmpty() ){
            JOptionPane.showMessageDialog(null, "Please enter the data required !!");
        }else{
                check=true;
                a.insertProducts(name,Integer.parseInt(amount_left), type, Integer.parseInt(price));
            }     
    return check;
    }

}

