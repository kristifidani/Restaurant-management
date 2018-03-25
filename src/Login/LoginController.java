package Login;

import WaiterUser.WaiterGui;
import DB.DB_connect;
import javax.swing.JOptionPane;

public class LoginController {
    
    LoginModel lm = new LoginModel();
    boolean check = false;
    
    public boolean validateLogin(String username,String password){
        
        if(username.isEmpty() || password.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter your username and password !");
        }else{
            
            if(lm.userRegistered(username,password)){
                JOptionPane.showMessageDialog(null, "Please enter the correct information !");
            }else{
                check=true;
                DB_connect.LOGGED_USER=username;
                WaiterGui waiter = new WaiterGui();
                waiter.setVisible(true);
                }
            }
        return check;
    }  
}
