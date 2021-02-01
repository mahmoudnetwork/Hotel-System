/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Guest extends Person implements Serializable{
	
    static ArrayList<Guest> Arr = new ArrayList<Guest>();
    static boolean flage = true;
    
    public Guest(String Name, int ID, String Phone, int Age, String Mail, String Address, String State, String Gender) {
        super(Name, ID, Phone, Age, Mail, Address, State, Gender);
    }
    
    public Guest() {
        //super("null", 0, "null", 0, "null", "null", "null", "null");
    }
    
    public String tostring(){
    	Guest e=new Guest();
    	return e.getID()+e.getName()+e.getMail()+e.getAddress()+e.getPhone()+e.getAge()+e.getGender()+e.getState();
    }
    
    public static Guest guestAt(int index){
        return Arr.get(index);
    }
    
    public void write(Object o) {
        if(flage)
        {
            try {
                doLoad();
            } catch (IOException ex) {
                Logger.getLogger(Guest.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Guest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    	Guest x = ((Guest) o);
        Arr.add(x);
        doSave();
    }
    
    /*public static void doSave(){
        try {
            FileOutputStream fileOut = new FileOutputStream("guest.bin");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(Arr);
            out.close();
            fileOut.close();
        } catch (Exception ee) {
            System.err.println("Can't save");
        }
    }*/
    /*public static void doSave() {
//        ObjectOutputStream Bin=new ObjectOutputStream(new FileOutputStream("students.bin",true));
//        Bin.writeObject(x);
//        Bin.close();

        try {
            FileOutputStream fileOut;
            fileOut = new FileOutputStream("employee.bin");
            try (ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
                out.writeObject(Arr);
            }
            fileOut.close();
        } catch (Exception ee) {
            System.err.println("STU Can't save");
        }
    }*/
    public ArrayList<Object> read() throws ClassNotFoundException, IOException  {
        if (flage) {
                doLoad();
                flage=false;
        }
        return (ArrayList<Object>) (Object) Arr;
    }
    
    public static void doSave() {
        try{
            FileOutputStream fileOut = new FileOutputStream("guest.bin",true);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            int count=0;
            for(Guest x : Arr){
            out.writeObject(x);
            }
            out.close();
            fileOut.close(); 
        }
        catch(Exception ee)
        {
            System.err.println("STU Can't save");
        }
    }
    
    /*public static void doLoad() throws IOException, ClassNotFoundException {
        if (flage) {      
          try{
              ObjectInputStream in  = new ObjectInputStream(new  FileInputStream("guest.bin"));
            Arr = (ArrayList<Guest>) (Object) in.readObject();
            in.close();
            flage = false;
        }
          catch(Exception ee)
          {
           System.out.println("can!load");
          }
        }
        }*/
    public static void doLoad() throws IOException, ClassNotFoundException {
        if (flage) {
            try{
            FileInputStream fileIn =  new FileInputStream("guest.bin");
            ObjectInputStream in;
            in = new ObjectInputStream(fileIn);
            Arr = (ArrayList<Guest>) (Object) in.readObject();
            flage = false;
            }
            catch(Exception ee){System.out.println("can!load");}
            }
            
        }
    public boolean CheckIn(){	
            return false;
	}
    public boolean CheckOut(){
            return false;
        }
    public void RequestServies(){
	
        }
    public boolean PayBill(){
            return false;
    
    }
    
}
