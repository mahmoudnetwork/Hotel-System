/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

import Exception.Eception;
import Interface.IPerson;

/**
 *
 * @author User
 */
public abstract class Person implements IPerson{
    Eception d=new Eception();
    private String Name;
    private  int ID;
    private String Phone;
    private int Age;
    private String Mail;
    private String Address;
    private String State;
    private String Gender;
    
    public Person(String Name,int ID, String Phone,int Age,String Mail,String Address,String State,String Gender)
    {
        this.Name=Name;
        this.ID=ID;
        this.Phone=Phone;
        this.Age=Age;
        this.Mail=Mail;
        this.Address=Address;
        this.State=State;
        this.Gender=Gender;
    }
    
    public Person()
    {
        
    }
    
 
    //setter
    public void setName(String Name)
    {
        if(d.checkname(Name)){
        this.Name=Name;}
    }
    //getter
    public String getName()
    {
        
        return Name;
    }
    //setter
    public void setID(int ID)
    {
      if(d.checkId(ID)){
          this.ID=ID;
      }
    }
    //getter
    public int getID()
    {
        return ID;
    }
    //setter
    public void setPhone(String Phone)
    {
        if(d.checkphone(Phone)){
        this.Phone=Phone;}
    }
    //getter
    public String getPhone()
    {
        
        return Phone;
    }
    //setter
    public void setAge(int Age)
    {
        if(d.checkage(Age)){
        this.Age=Age;}
    }
    //getter
    public int getAge()
    {
        return Age;
    
    }
    //setter
    public void setMail(String Mail)
    {
        if(d.checkmail(Mail)){
        this.Mail=Mail;}
    }
    //getter
    public String getMail()
    {
        return Mail;
    }
    //setter
    public void setAddress(String Address)
    {
        if(d.checkaddress(Address)){
        this.Address=Address;}
    }
    //getter
    public String getAddress()
    {
        return Address;
    }
    //setter
    public void setState(String State)
    {
        if(d.checkstate(State)){
        this.State=State;}
    }
    //getter
    public String getState()
    {
        return State;
    }
    //setter
    public void setGender(String Gender)
    {
        if(d.checkgender(Gender)){
        this.Gender=Gender;}
    }
    //getter
    public String getGender()
    {
        return Gender;
    }
}
