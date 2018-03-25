package WaiterUser;

import javax.swing.JOptionPane;

public class WaiterController {

    WaiterModel a = new WaiterModel();
    boolean check = false;
    
    public boolean validateKitchenOrder(String waiter,String order,String ready){
        
        if(order.isEmpty()){
            JOptionPane.showMessageDialog(null, "Please enter your order !!");
        }else{
                check=true;
                a.insertTable(waiter, order, ready);
            }     
    return check;
    }
}


