/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FileManage;
import Interface.IFMS;
import core.Employee;
import java.io.*;
import java.util.*;

/**
 *
 * @author Mahmoud Awad
 */
public class FMS  implements IFMS  {
    public void Write(String data,String FilePath,boolean Type)  throws IOException
    {
        PrintWriter writer=new PrintWriter(new BufferedWriter(new FileWriter(FilePath,Type)));
        writer.println(data);
     writer.close();  
    }
    public ArrayList<Object> Read(String FilePath)throws FileNotFoundException
    {
        if(FilePath.equals("Employee.txt")){
        ArrayList <Employee> emp=new ArrayList<Employee>();
                File path=new File("Employee.txt");
                Scanner input=new Scanner(path);
                Employee x;
                    while(input.hasNext())
                    {
                        x=new Employee();
                        String line=input.nextLine();
                        String[]s=Tokens(line,'&');
                        x.setID(Integer.parseInt(s[0]));
                        x.setName(s[1]);
                        x.setMail(s[2]);
                        x.setAddress(s[3]);
                        x.setPhone(s[4]);
                        x.setAge(Integer.parseInt(s[5]));
                        x.setGender(s[6]);
                        x.setState(s[7]);
                        emp.add(x);
                    }
                    return (ArrayList<Object>)(Object) emp;
        }
        return null;
                
    }
        //<-----------------function Tokens--------------->
    public static String [] Tokens(String Line , char seprator){ 
        String [] result = new String [10];
        String word= "";
        int crt = 0;
        for(int i=0 ; i<Line.length() ; i++)
        {
            if(Line.charAt(i)!=seprator){
            word+=Line.charAt(i);
            }
            else{
                result[crt] = word;
                crt++;
                word=new String();
            }
        }
        return result;
    }
    
            
    
}

