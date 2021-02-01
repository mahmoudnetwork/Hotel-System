/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import core.Employee;
import core.Guest;
import core.Manager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class AddEmployeeGUI extends AddFrame {

    
    
    JLabel SalaryJLabel;
 static   JTextField SalaryJTextField;
    
    public AddEmployeeGUI(String s) {
        super(s);
        this.SalaryJLabel = new JLabel(" salary ");
        add(SalaryJLabel);
        
        this.SalaryJTextField = new JTextField("");
        add(SalaryJTextField);
        
        setLayout(null);
        
        SalaryJLabel.setBounds(IDJLabel.getX(),IDJLabel.getY()+400,100,30);
        SalaryJTextField.setBounds(IDJLabel.getX()+70,IDJLabel.getY()+400,200,30);
    }

    /*@Override
    public void actionPerformed(ActionEvent ae) {
    
    }*/
  
        public void actionPerformed(ActionEvent e) {
             Manager m =new Manager();
           
            if(e.getSource() ==BackButton)
            {
                this.setVisible(false);
                new MenueOfManager("manager").setVisible(true);
            }
            
                if(e.getActionCommand().equals("Submit") )
                {
                   System.out.println(NameJTextField.getText());
                    Employee x =new Employee();
                    x.setID(Integer.parseInt(IDJTextField.getText()));
                    x.setName(NameJTextField.getText());
                    x.setAddress(AddressJTextField.getText());
                    x.setAge(Integer.parseInt(AgeJTextField.getText()));
                    x.setMail(MailJTextField.getText());
                    x.setGender(GenderJTextField.getText());
                    x.setSalary(Float.parseFloat(SalaryJTextField.getText()));
                    x.setPhone(PhoneJTextField.getText());
                    x.setState(StateJTextField.getText());
                        m.AddEmployee(x);
                   resetinfo();
                      System.out.println(NameJTextField.getText());
                    
                }
                    
          if (e.getActionCommand().equals("Update")) {
            Employee x =new Employee();
                    x.setID(Integer.parseInt(IDJTextField.getText()));
                    x.setName(NameJTextField.getText());
                    x.setAddress(AddressJTextField.getText());
                    x.setAge(Integer.parseInt(AgeJTextField.getText()));
                    x.setMail(MailJTextField.getText());
                    x.setGender(GenderJTextField.getText());
                    x.setSalary(Float.parseFloat(SalaryJTextField.getText()));
                    x.setPhone(PhoneJTextField.getText());
                    x.setState(StateJTextField.getText());
                 if(m.deletemployee(Integer.parseInt(IDJTextField.getText()))){
                     m.AddEmployee(x);
                    resetinfo(); 
                 }
          
          }
        if (e.getActionCommand().equals("Delete")) {
            if (!IDJTextField.getText().equals("")) {
                int q = JOptionPane.showConfirmDialog(rootPane, "Are You Sure ! ");
                if (q != 1) {
                    if (m.deletemployee(Integer.parseInt(IDJTextField.getText()))) {
                    resetinfo();
        }
                }}}}
        
     public static void view(Employee x) {
        //AddEmployeeGUI s = new   AddEmployeeGUI("View Employee");
        
                    IDJTextField.setText(x.getID()+ "");
                    NameJTextField.setText(x.getName());
                    AddressJTextField.setText(x.getAddress());
                    AgeJTextField.setText(x.getAge()+"");
                    MailJTextField.setText(x.getMail());
                    GenderJTextField.setText(x.getGender());
                    SalaryJTextField.setText(x.getSalary()+"");
                    PhoneJTextField.setText(x.getPhone());
                    StateJTextField.setText(x.getState());
        
        SubmitButton.setText("Update");
        resetButton.setText("Delete");

       // s.setVisible(true);
    }
        public static void resetinfo() {
                    IDJTextField.setText("");
                    NameJTextField.setText("");
                    AddressJTextField.setText("");
                    AgeJTextField.setText("");
                    MailJTextField.setText("");
                    GenderJTextField.setText("");
                    SalaryJTextField.setText("");
                    PhoneJTextField.setText("");
                    StateJTextField.setText("");
        }
    
public static void main(String [] args)
{
    AddEmployeeGUI s = new AddEmployeeGUI("Hotel Systm");
    s.setVisible(true);
}
    
    
}
