/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author User
 */
public abstract class MYFrame extends FrameTitle implements ActionListener {

  static  JButton SubmitButton ; 
   static JButton resetButton;
   static JButton BackButton;
    public MYFrame(String s) {
        super(s);
       this.SubmitButton = new JButton("Submit");
        add(SubmitButton);
        SubmitButton.addActionListener(this);
        resetButton  = new JButton("Reset");
        add(resetButton);
        resetButton.addActionListener(this);
        BackButton = new JButton("Back");
        add(BackButton);
        BackButton.addActionListener(this);
        setLayout(null);
        SubmitButton.setBounds(430,450,90,30);
        resetButton.setBounds(SubmitButton.getX(),SubmitButton.getY()+40,90,30);
        BackButton.setBounds(SubmitButton.getX(),SubmitButton.getY()+80,90,30);
    }
   

        @Override
        public void actionPerformed(ActionEvent ae) {
            throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
    

    //@Override
    //public abstract void actionPerformed(ActionEvent ae) ;
   
}
