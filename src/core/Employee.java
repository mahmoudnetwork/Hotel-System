/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;
import Interface.IEmployee;
import java.util.*;
import java.io.*;
/**
 *
 * @author User
 */
public class Employee extends Person implements IEmployee ,Serializable{
   
    private double Salary;
    static ArrayList<Employee> Arr = new ArrayList<Employee>();
    static boolean flage = true;
    public void setSalary(double salary){
        this.Salary=salary;
    }

    public double getSalary(){
        return Salary;
    }
    
    public Employee(String Name, int ID, String Phone, int Age, String Mail, String Address, String State, String Gender,double Salary )
    {
        super(Name, ID, Phone, Age, Mail, Address, State, Gender); 
    }

    public Employee() {
        
    }
    
    /*public String tostring(){
    	Employee e=new Employee();
    	return e.getID()+e.getName()+e.getMail()+e.getAddress()+e.getPhone()+e.getAge()+e.getGender()+e.getState()+e.getSalary();
    }*/
    
    public static  Employee employeeAt(int index){
        return Arr.get(index);
    }
    
    /********************************************************************************************************************/
    
    public void write(Object o) throws FileNotFoundException, IOException {
        Employee x = ((Employee) o);
        Arr.add(x);
       // doSave();
    }
    
    public static void doSave() {
        try{
            FileOutputStream fileOut = new FileOutputStream("employee.bin");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(Arr);
            out.close();
            fileOut.close(); 
        }
        catch(Exception ee)
        {
            
        }
    }
    
    /***********************************************************************************************************************/
    
    public ArrayList<Object> read() throws ClassNotFoundException, IOException  {
        if (flage) {
                doLoad();
        }
        return (ArrayList<Object>) (Object) Arr;
    }

    public static void doLoad() throws IOException, ClassNotFoundException {
        if (flage) {
            try{
            FileInputStream fileIn =  new FileInputStream("employee.bin");
            ObjectInputStream in;
            in = new ObjectInputStream(fileIn);
            Arr = (ArrayList<Employee>) (Object) in.readObject();
            flage = false;
            }
            catch(Exception ee){}
            }
            
        }
    
    public void ComingRegiste(String Date)
    {
	
    }
    
    public void LeavingRegiste(String Date)
    {

     }
    
    
 }
