/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public abstract class AddFrame extends MYFrame {
    
    JLabel IDJLabel ;
    JLabel NameJLabel;
    JLabel PhoneJLabel;
    JLabel AgeJLabel;
    JLabel MailJLabel;
    JLabel AddressJLabel;
    JLabel StateJLabel;
    JLabel GenderJLabel;
    /************************/
 static   JTextField IDJTextField;
static    JTextField NameJTextField;
  static  JTextField PhoneJTextField;
   static JTextField AgeJTextField;
   static JTextField MailJTextField;
   static JTextField AddressJTextField;
  static  JTextField StateJTextField;
      static  JTextField GenderJTextField;
    
    public AddFrame(String s) {
        super(s);
        this.IDJLabel     = new JLabel(" ID ") ;
        add(IDJLabel);
        
        this.NameJLabel   = new JLabel(" Name ");
        add(NameJLabel);
        
        this.PhoneJLabel  = new JLabel(" Phone ");
        add(PhoneJLabel);
        
        this.AgeJLabel    = new JLabel(" Age ") ;
        add(AgeJLabel);
        
        this.MailJLabel = new JLabel(" Mail ") ;
        add(MailJLabel);
        
        this.AddressJLabel = new JLabel(" Address ");
        add(AddressJLabel);
        
        this.StateJLabel = new JLabel(" State ");
        add(StateJLabel);
        
        this.GenderJLabel = new JLabel(" Gender ");
        add(GenderJLabel);
        /****************************************************/
        this.IDJTextField     = new JTextField("") ;
        add(IDJTextField);
        
        this.NameJTextField   = new JTextField("");
        add(NameJTextField);
        
        this.PhoneJTextField  = new JTextField("");
        add(PhoneJTextField);
        
        this.AgeJTextField    = new JTextField("") ;
        add(AgeJTextField);
        
        this.MailJTextField = new JTextField("") ;
        add(MailJTextField);
        
        this.AddressJTextField = new JTextField("");
        add(AddressJTextField);
        
        this.StateJTextField = new JTextField("");
        add(StateJTextField);
        
        this.GenderJTextField = new JTextField("");
        add(GenderJTextField);
        
        setLayout(null);
        /*****************************************************/
        this.IDJLabel.setBounds(100,100,100,30);
        this.IDJTextField.setBounds(IDJLabel.getX()+70,IDJLabel.getY(),200,30);
        
        this.NameJLabel.setBounds(IDJLabel.getX(),IDJLabel.getY()+50,100,30);
        this.NameJTextField.setBounds(IDJLabel.getX()+70,IDJLabel.getY()+50,200,30);
        
        this.PhoneJLabel.setBounds(IDJLabel.getX(),IDJLabel.getY()+100,100,30);
        this.PhoneJTextField.setBounds(IDJLabel.getX()+70,IDJLabel.getY()+100,200,30);
        
        this.AgeJLabel.setBounds(IDJLabel.getX(),IDJLabel.getY()+150,100,30);
        this.AgeJTextField.setBounds(IDJLabel.getX()+70,IDJLabel.getY()+150,200,30);
        
        this.MailJLabel.setBounds(IDJLabel.getX(),IDJLabel.getY()+200,100,30);
        this.MailJTextField.setBounds(IDJLabel.getX()+70,IDJLabel.getY()+200,200,30);
        
        this.AddressJLabel.setBounds(IDJLabel.getX(),IDJLabel.getY()+250,100,30);
        this.AddressJTextField.setBounds(IDJLabel.getX()+70,IDJLabel.getY()+250,200,30);
        
        this.StateJLabel.setBounds(IDJLabel.getX(),IDJLabel.getY()+300,100,30);
        this.StateJTextField.setBounds(IDJLabel.getX()+70,IDJLabel.getY()+300,200,30);
        
        this.GenderJLabel.setBounds(IDJLabel.getX(),IDJLabel.getY()+350,100,30);
        this.GenderJTextField.setBounds(IDJLabel.getX()+70,IDJLabel.getY()+350,200,30);
    }

//    @Override
//    public abstract void actionPerformed(ActionEvent ae) ;
    
    
}
