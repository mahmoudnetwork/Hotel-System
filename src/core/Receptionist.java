/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Receptionist extends Employee {
	
  static  ArrayList<Guest> em = new  ArrayList<Guest>();
    double Salary;
    
    public Receptionist(String Name, int ID, String Phone, int Age, String Mail, String Address, String State, String Gender,double Salary) {
        super(Name, ID, Phone, Age, Mail, Address, State, Gender,Salary);
        this.Salary = Salary;    
    }
    
    public Receptionist() {
       
    }

    public void CheckRoomAvailabe() {
         }

    
    public void BookRoom() {
       
    }

    public void AddService() {
        
    }

    public void generateddBill() {
        
    }

    public void Addguest(Guest e){
       em.add(e);
    }
    public Guest Searchguest(int id){
         for (Guest e : em) {
             if(e.getID()==id){
                 return e;
             }
         }
    return null;
}
public boolean deletguest(int id){
    int i=0;

     for (Guest e : em) {
             if(e.getID()==id){
                 em.remove(i);
                return true;
             }
             i++;
}
     return false;
}
   /* public ArrayList<Guest> readAllguest() throws ClassNotFoundException, IOException   {
    	Guest h = new Guest();
        ArrayList<Object> a = h.read();

        return (ArrayList<Guest>) (Object) a;

    }
    public int  Searchguest(int id) throws ClassNotFoundException, IOException 
    {
        if (em == null) {
            em = readAllguest();
        }
        
        int i = 0;
        for (Guest x : em) {
            if (x.getID() == id) {
                return i;
            }
            i++;
        }
        return -1;
    }
    public void UpdateEmployeeData()
    {
        
    }

    public boolean deletguest(int id) throws ClassNotFoundException, IOException
    {
    	if (em == null) {
            em = readAllguest();
        }
        int w = Searchguest(id);
        if (w != -1) {
            em.remove(w);
            Guest.doSave();
            return true;
        } else {
            return false;
        }
        
    }*/
    
}
