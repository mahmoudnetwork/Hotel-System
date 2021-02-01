
package core;
import GUI.loginGUI;
import java.util.*;
import java.io.*;

public class core {

    
    public static void main(String[] args) throws IOException, ClassNotFoundException{
     new loginGUI("").setVisible(true);
        Manager mahmoud= new Manager("mahmoud maher@yahoo.com", 2015, "011565105", 155632, "hgsdhgs@yahoo", "dokki", "single", "f",2000.00,12345678);
        /*Receptionist g=new Receptionist();
        System.out.printf("%20s\n%27s","1.Manger","2.Receptionist\n");
        int CheckUser;//check access as a manager or receptionist
        Scanner input=new Scanner(System.in);
        CheckUser = input.nextInt(); //enter employee selection 
                    while (!(CheckUser == 1||CheckUser == 2)) {  //while to check if employee selection false or true   
                        System.out.println("WRONG Selection!!!");
                        System.out.printf("%20s\n%27s","1.Manger","2.Receptionist\n");
                        CheckUser = input.nextInt();
                    }
        if(CheckUser==1) //if CheckUser = 1 do manager action 
        {
            int CheckSelction;
            do{
            System.out.printf("%20s\n%23s\n   %24s\n %20s\n %13s\n","1.AddEmployee","2.SearchEmployee","3.UpdateEmployeeData","4.FireEmployee","5.Exit\n");
            CheckSelction = input.nextInt();
            while (!(CheckSelction >= 1&&CheckSelction <= 5)) {    
            System.out.println("WRONG Selection!!!");
            System.out.printf("%20s\n%23s\n   %24s\n %20s\n %13s\n","1.AddEmployee","2.SearchEmployee","3.UpdateEmployeeData","4.FireEmployee","5.Exit\n");
            CheckSelction = input.nextInt();
        }
            if(CheckSelction==1){   
                String Name, Phone,  Mail, Address, State,  Gender;
                int ID ,Age ;
                double Salary;
                int SaveOrEdite =2;
               do{ 
                System.out.println("Enter Employee Data :-");
                System.out.print("ID : ");
                ID = input.nextInt();
               
                System.out.print("Name : ");
                Name = input.next();
                
                System.out.print("Phone : ");
                Phone = input.next();
                
                System.out.print("Age : ");
                Age = input.nextInt();
                
                System.out.print("Mail : ");
                Mail = input.next();
                
                System.out.print("Address : ");
                Address = input.next();
                
                System.out.print("State : ");
                State = input.next();
                
                System.out.print("Gender : ");
                Gender = input.next();
                 System.out.print("Salary : ");
                Salary = input.nextDouble();
               
                
               
                
                System.out.println("Press 1 To Save Data"
                                    +"\nPress 2 To Edit Data");
                SaveOrEdite = input.nextInt();
                if(SaveOrEdite == 1 ){
                Employee e=new Employee( Name,  ID, Phone,  Age,  Mail,Address,State,Gender,Salary);
                   mahmoud.AddEmployee(e);
                    System.out.println("-----------------------\n"
                                       +"press 2 to add onther new employee Or anather number to Exit from add Employee");
                SaveOrEdite =  input.nextInt();
                
                }
               //end of if statement
               }while(SaveOrEdite==2);
            }//CheckSelection==1
                                //<-----------------implement of function *SearchEmployee*---------------->
                        if(CheckSelction==2){
                        	 System.out.print("Search For Student \nPlease Enter S_ID : ");
                        	 int id,w;
                             id = input.nextInt();
                             w = mahmoud.SearchEmployee(id);
                             if (w != -1) {
                                 System.out.println("Student Found :)");
                                 System.out.println( Employee.employeeAt(w).toString());
                                 System.out.println();
                             } else {
                                 System.out.println("Not found :(");
                             }
                                 
                        }
                           // <---------------------implement of function *FireEmployee*-------------->
                        if(CheckSelction==4){
                        System.out.println("enter the id of employee you want to fire");
                        int id;
                        id=input.nextInt();
                     if( mahmoud.FireEmployee(id)){
                            System.out.println("delet accpt"); 
                             }
                     else{
                    	 System.out.println("eroor"); 
                     }
        }
            
                System.out.println("<---------------------------->");
                if(CheckSelction==5){
                break;}
                }while(CheckSelction<=5&&CheckSelction>=1);
    }//<--------check user 1 "do manager"
        if(CheckUser==2) //if CheckUser = 1 do manager action 
        {
            int CheckSelction;
            do{
            System.out.printf("%20s\n%23s\n   %24s\n %20s\n %13s\n","1.Addguest","2.Searchguest","3.UpdateguestData","4.deletguest","5.Exit\n");
            CheckSelction = input.nextInt();
            while (!(CheckSelction >= 1&&CheckSelction <= 5)) {    
            System.out.println("WRONG Selection!!!");
            System.out.printf("%20s\n%23s\n   %24s\n %20s\n %13s\n","1.Addguest","2.Searchguest","3.UpdateguestData","4.deletguest","5.Exit\n");
            CheckSelction = input.nextInt();
        }
            if(CheckSelction==1){   
                String Name, Phone,  Mail, Address, State,  Gender;
                int ID ,Age ;
                int SaveOrEdite =2;
               do{ 
                System.out.println("Enter guest Data :-");
                System.out.print("ID : ");
                ID = input.nextInt();
               
                System.out.print("Name : ");
                Name = input.next();
                
                System.out.print("Phone : ");
                Phone = input.next();
                
                System.out.print("Age : ");
                Age = input.nextInt();
                
                System.out.print("Mail : ");
                Mail = input.next();
                
                System.out.print("Address : ");
                Address = input.next();
                
                System.out.print("State : ");
                State = input.next();
                
                System.out.print("Gender : ");
                Gender = input.next();
               
               
                
               
                
                System.out.println("Press 1 To Save Data"
                                    +"\nPress 2 To Edit Data");
                SaveOrEdite = input.nextInt();
                if(SaveOrEdite == 1 ){
                Guest e=new  Guest( Name,  ID, Phone,  Age,  Mail,Address,State,Gender);
                   g.Addguest(e);
                    System.out.println("-----------------------\n"
                                       +"press 2 to add onther new employee Or anather number to Exit from add Employee");
                SaveOrEdite =  input.nextInt();
                
                }
               //end of if statement
               }while(SaveOrEdite==2);
            }//CheckSelection==1
                                //<-----------------implement of function *SearchEmployee*---------------->
                        if(CheckSelction==2){
                        	 System.out.print("Search For Student \nPlease Enter S_ID : ");
                        	 int id,w;
                             id = input.nextInt();
                             w = g.Searchguest(id);
                             if (w != -1) {
                                 System.out.println("Student Found :)");
                                 System.out.println( Guest.guestAt(w).toString());
                                 System.out.println();
                             } else {
                                 System.out.println("Not found :(");
                             }
                                 
                        }
                           // <---------------------implement of function *FireEmployee*-------------->
                        if(CheckSelction==4){
                        System.out.println("enter the id of employee you want to fire");
                        int id;
                        id=input.nextInt();
                     if( g.deletguest(id)){
                            System.out.println("delet accpt"); 
                             }
                     else{
                    	 System.out.println("eroor"); 
                     }
        }
            
                System.out.println("<---------------------------->");
                if(CheckSelction==5){
                break;}
                }while(CheckSelction<=5&&CheckSelction>=1);
    }*///<--------check user 1 "do manager"
       
}//<-----------MAIN
}//<----------Class HOTEL_SYSTEM
