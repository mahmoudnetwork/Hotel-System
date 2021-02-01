/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Mahmoud Awad
 */
public interface IBill {
    //setter
    public void setBillNo(int BillNo);
    public void setGuestID(int GuestID);
    //getter
    public int getBillNo();
    public int getGuestID();
    
    
}
