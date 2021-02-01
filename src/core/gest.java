/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package core;

/*import Interface.IFileBinary;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 
public class Guest_ extends Person implements Serializable , IFileBinary{
    
    static ArrayList<Guest_> GuestArray = new ArrayList<Guest_>();
    public boolean flage = true ;
    
    public Guest_(String Name, int ID, String Phone, int Age, String Mail, String Address, String State, String Gender) {
        super(Name, ID, Phone, Age, Mail, Address, State, Gender);
    }
    public Guest_()
    {
        super();
    }

    @Override
    public void Write(Object O) {
        if(flage)
        {
            try {
                doLoad();
            } catch (IOException ex) {
                Logger.getLogger(Guest_.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Guest_.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        Guest_ x = (Guest_) O;
        GuestArray.add(x);
        try {
            doSave();
        } catch (IOException ex) {
            Logger.getLogger(Guest_.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    @Override
    public ArrayList<Object> Read() {
        if(flage)
        {
            try {
                doLoad();
            } catch (IOException ex) {
                Logger.getLogger(Guest_.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Guest_.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return (ArrayList<Object>) (Object) GuestArray;
    }
    
    
    public void doLoad() throws FileNotFoundException, IOException, ClassNotFoundException
    {
        if(flage){
            try{
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Guest_.bin")); 
        GuestArray = (ArrayList<Guest_>) (Object) in.readObject();
        in.close();
        flage = false;
            }catch(Exception e){System.err.println("Doload not work");}
            }
    }
    
    public void doSave() throws IOException 
    {
       // try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Guest_.bin"));
            ArrayList<Object> m = (ArrayList<Object>) (Object) GuestArray;
            out.writeObject(m);
            out.close();
       /* } catch (IOException ex) {
            Logger.getLogger(Guest_.class.getName()).log(Level.SEVERE, null, ex);
        }*/
 /*   }
   
    public static void main(String [] args)
    {
        Guest_ yahia = new Guest_();
        int x , ch=5 ;
        Scanner input = new Scanner(System.in);
        while(ch>0)
        {
            x = input.nextInt();
            if(x==1)
            {
                System.out.print("name : ");
                yahia.setName(input.next());
                System.out.print("id : ");
                yahia.setID(input.nextInt());
                System.out.print("Age : ");
                yahia.setAge(input.nextInt());
                System.out.print("mail : ");
                yahia.setMail(input.next());
                yahia.Write(yahia);
            }
            else{
                if(x == 2)
                {
                    ArrayList<Guest_> mohamed  = new ArrayList<Guest_>();
                    mohamed = (ArrayList<Guest_>) (Object) yahia.Read();
                    for(Guest_ pp : mohamed)
                    {
                        System.out.println("name : " +pp.getName() + "\n"
                                         + "ID : " +pp.getID() + "\n"
                                          +"mail : " + pp.getMail());
                    }
                }
            }
            ch = input.nextInt();
        }
    }
    
}
*/

import Exception.Eception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class  gest implements Serializable {
    Eception d=new Eception();
    private String Name;
    private  int ID;
    private String Phone;
    private int Age;
    private String Mail;
    private String Adress;
    private String State;
    private String Gender;
    //tring Name, int ID, String Phone, int Age, String Mail, String Address, String State, String Gender
   public gest(String Name, int ID, String Phone, int Age, String Mail, String Address, String State, String Gender)
   {
       this.Name = Name;
       this.ID = ID; 
       this.Phone = Phone ;
       this.Age = Age ;
       this.Mail = Mail;
       this.Adress = Address;
       this.State = State;
       this.Gender = Gender;
   }
   
    static ArrayList<gest> Gest = new ArrayList<gest>();
    public static boolean flage = true;
    
    public void tostString()
    {
        if(flage) try {
            doLoad();
        } catch (IOException ex) {
            Logger.getLogger(gest.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(gest.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for(gest l : Gest)
        {
            System.out.println(l.Name);
            System.out.println(l.ID);
            System.out.println(l.Mail);
            System.out.println("--------------------------------------");
        }
        
        
    }
    public gest()
    {
        
    }
    
   /* public static void doload()
    {
        if(flage){
        try{
            FileInputStream filein = new FileInputStream("employee.bin");
            ObjectInputStream in = new ObjectInputStream(filein);
            Gest = (ArrayList<gest>) (Object) in.readObject();
            in.close();
            
        }
        catch(Exception e)
        {
            System.out.println("no doload work");
        }
        }
    }*/
     public static void doLoad() throws IOException, ClassNotFoundException {
        if (flage) {
            try{
            FileInputStream fileIn =  new FileInputStream("employee.bin");
            ObjectInputStream in;
            in = new ObjectInputStream(fileIn);
            Gest = (ArrayList<gest>) (Object) in.readObject();
            flage = false;
            }
            catch(Exception ee){}
            }
            
        }
    
    public static void doSave() {
        try{
            FileOutputStream fileOut = new FileOutputStream("employee.bin");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(Gest);
            out.close();
            fileOut.close(); 
        }
        catch(Exception ee)
        {
            
        }
    }
    /*public static void doSave()
    {
        try{
            FileOutputStream Fileout = new FileOutputStream("gest.bin");
            ObjectOutputStream out = new ObjectOutputStream(Fileout);
            out.writeObject(Gest);
            out.close();
            Fileout.close();
        }catch(Exception e)
        {
            System.out.println("save not work ");
        }
        
    }*/
            
    public void write(Object O)
    {
        if(flage){
            try {
                doLoad();
            } catch (IOException ex) {
                Logger.getLogger(gest.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(gest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        gest x = ((gest) O);
        Gest.add(x);
        doSave();
    }
    
    public ArrayList<Object> read()
    {
        if(flage)
        {
            try {
                doLoad();
            } catch (IOException ex) {
                Logger.getLogger(gest.class.getName()).log(Level.SEVERE, null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(gest.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        return (ArrayList<Object>) (Object) Gest;
    }
    
    
    
    
    
    
    
    
    
    void setName(String name)
    {
        this.Name = name;
    }
    
    void setid(int id)
    {
        this.ID = id;
    }
    void setPhone(String s)
    {
        Phone = s ;
    }
    void setAge(int s)
    {
        Age = s;
    }
    
    void setmail(String s)
    {
        this.Mail = s;
    }
    void setGender(String s)
    {
        
    }



    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
       /* gest [] m = new gest[3];
        m[0] = new gest("yahia abdullah" , 1 , "01156510548" , 20 , "yahia@yahoo.com" );
        m[1] = new gest("mohamed abdullah" , 2 , "01156510548" , 10 , "mohamed@yahoo.com" );
        m[2] = new gest("asmaa abdullah" , 3 , "01156510548" , 14 , "asmaa@yahoo.com" );
        //m[3] = new gest("shimaa abdullah" , 4 , "01156510548" , 12 , "shimaa@yahoo.com" );
        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("yahia.bin"));
        out.writeObject(m);
        out.close();
        ArrayList<gest>  mohamed = new ArrayList<gest>();
        ObjectInputStream in =new ObjectInputStream(new FileInputStream("yahia.bin"));
        gest [] n = new gest[3];
        n =  (gest[]) in.readObject();*/
        
        int ch=100 , x=-1;
        gest m = new gest();
        System.out.println("1-to add"
                + "/n"
                + "2-to read"
                + "9-to close");
        Scanner in = new Scanner(System.in);
        while(ch != 9)
        {
            System.out.println("enter x");
            x=in.nextInt();
            if(x==1)
            {
                
                System.out.println("mane : ");
                m.setName(in.next());
                System.out.println("id :");
                m.setid(in.nextInt());
                System.out.println("mail");
                m.setmail(in.next());
                m.write(m);
                 
            }
            else{
            if(x == 2)
            {
               m.tostString();
            }
                System.out.println("Enter ch");
                ch = in.nextInt();
        }
        }
    }

    
    
}
