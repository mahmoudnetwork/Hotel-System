
package core;

import Interface.ILogin;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;


public class Manager extends Employee implements  ILogin{
private double pas;
     static   ArrayList<Employee> em = new ArrayList<Employee>();
    public Manager(String Name, int ID, String Phone, int Age, String Mail, String Address, String State, String Gender,double Salary,double pas) {
        super(Name, ID, Phone, Age, Mail, Address, State, Gender,Salary);
      this.pas=pas;
    }
    
    public Manager()
    {
        
    }
    
   

    public void AddEmployee(Employee e){
    em.add(e);
  //  e.write(e);
}
public Employee SearchEmploye(int id){
         for (Employee e : em) {
             if(e.getID()==id){
                 return e;
             }
         }
    return null;
}
public boolean deletemployee(int id){
    int i=0;

     for (Employee e : em) {
             if(e.getID()==id){
                 em.remove(i);
                return true;
             }
             i++;
}
     return false;
}
/*public ArrayList<Employee> readAllemployee() throws ClassNotFoundException, IOException   {
    Employee h = new Employee();
    ArrayList<Object> a = h.read();

    return (ArrayList<Employee>) (Object) a;
}*/
/*public int  SearchEmployee(int id) throws ClassNotFoundException, IOException 
{
    if (em == null) {
        em = readAllemployee();
    }
    
    int i = 0;
    for (Employee x : em) {
        if (x.getID() == id) {
            return i;
        }
        i++;
    }
    return -1;
}*/

/*public Employee  SearchEmploye(int id) throws ClassNotFoundException, IOException 
{
    if (em == null) {
        em = readAllemployee();
    }
    
    int i = 0;
    for (Employee x : em) {
        if (x.getID() == id) {
            return x;
        }
        i++;
    }
    return null;
}*/
public void UpdateEmployeeData()
{
    
}

/*public boolean FireEmployee(int id) throws ClassNotFoundException, IOException
{
	if (em == null) {
        em = readAllemployee();
    }
    int w = SearchEmployee(id);
    if (w != -1) {
       
        em.remove((Integer)w);
        return true;
    } else {
        return false;
    }
}
public void GetReport()
{
	
}*/

    @Override
    public Object Login(String userName, String PassWord) {
        if(userName.equals("mohamed@yahoo.com") && PassWord.equals("20140497"))
        {
            return new Manager();
        }
        return null;
    }

}
