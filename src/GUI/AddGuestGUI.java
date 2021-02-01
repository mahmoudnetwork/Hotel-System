/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import static GUI.AddEmployeeGUI.SalaryJTextField;
import static GUI.AddFrame.NameJTextField;
import static GUI.MYFrame.BackButton;
import core.*;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class AddGuestGUI extends AddFrame {
    
    JLabel RoomNunmberJLabel;
    JTextField RoomNunmberJTextField;
    
    public AddGuestGUI(String s) {
        super(s);
       /* this.RoomNunmberJLabel = new JLabel(" Room_no ");
        add(RoomNunmberJLabel);
        
        this.RoomNunmberJTextField = new JTextField("");
        add(RoomNunmberJTextField);
        
        setLayout(null);
                    getContentPane().setBackground(Color.CYAN);

        RoomNunmberJLabel.setBounds(IDJLabel.getX(),IDJLabel.getY()+400,100,30);
        RoomNunmberJTextField.setBounds(IDJLabel.getX()+70,IDJLabel.getY()+400,200,30);*/
    }



        @Override
        public void actionPerformed(ActionEvent e) {
            Receptionist m =new Receptionist();
           
            if(e.getSource() ==BackButton)
            {
                this.setVisible(false);
                new MenueOfReceptionist("receptionist").setVisible(true);
            }
            
                if(e.getActionCommand().equals("Submit") )
                {
                   System.out.println(NameJTextField.getText());
                    Guest x =new Guest();
                    x.setID(Integer.parseInt(IDJTextField.getText()));
                    x.setName(NameJTextField.getText());
                    x.setAddress(AddressJTextField.getText());
                    x.setAge(Integer.parseInt(AgeJTextField.getText()));
                    x.setMail(MailJTextField.getText());
                    x.setGender(GenderJTextField.getText());
                    x.setPhone(PhoneJTextField.getText());
                    x.setState(StateJTextField.getText());
                        m.Addguest(x);
                   resetinfo();
                      System.out.println(NameJTextField.getText());
                    
                }
                    
          if (e.getActionCommand().equals("Update")) {
            Guest x =new Guest();
                    x.setID(Integer.parseInt(IDJTextField.getText()));
                    x.setName(NameJTextField.getText());
                    x.setAddress(AddressJTextField.getText());
                    x.setAge(Integer.parseInt(AgeJTextField.getText()));
                    x.setMail(MailJTextField.getText());
                    x.setGender(GenderJTextField.getText());
                    x.setPhone(PhoneJTextField.getText());
                    x.setState(StateJTextField.getText());
                 if(m.deletguest(Integer.parseInt(IDJTextField.getText()))){
                     m.Addguest(x);
                    resetinfo(); 
                 }
          
          }
        if (e.getActionCommand().equals("Delete")) {
            if (!IDJTextField.getText().equals("")) {
                int q = JOptionPane.showConfirmDialog(rootPane, "Are You Sure ! ");
                if (q != 1) {
                    if (m.deletguest(Integer.parseInt(IDJTextField.getText()))) {
                    resetinfo();
        }
                }
            }
        }
        }
        
     public static void view(Guest x) {
        
        
                    IDJTextField.setText(x.getID()+ "");
                    NameJTextField.setText(x.getName());
                    AddressJTextField.setText(x.getAddress());
                    AgeJTextField.setText(x.getAge()+"");
                    MailJTextField.setText(x.getMail());
                    GenderJTextField.setText(x.getGender());
                    PhoneJTextField.setText(x.getPhone());
                    StateJTextField.setText(x.getState());
        
        SubmitButton.setText("Update");
        resetButton.setText("Delete");

    
    }
        public static void resetinfo() {
                    IDJTextField.setText("");
                    NameJTextField.setText("");
                    AddressJTextField.setText("");
                    AgeJTextField.setText("");
                    MailJTextField.setText("");
                    GenderJTextField.setText("");
                    PhoneJTextField.setText("");
                    StateJTextField.setText("");
        }
    
        
     
    public static void main(String [] args)
{
    AddGuestGUI s = new AddGuestGUI("Hotel Systm");
    s.setVisible(true);
    
}
}
