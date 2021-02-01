/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import core.Employee;
import core.Manager;
import core.Person;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class loginGUI extends FrameTitle {

    JLabel userLabel ;
    JTextField userText;
    JLabel PassLabel;
    JPasswordField passText;
    JButton LoginButton;
    JButton resetButton;
    public loginGUI(String s) {
        super(s);
        TitleLabel = new JLabel("Authentaction Now :)");
        add(TitleLabel);
        
        userLabel = new JLabel("user name ");
        add(userLabel);
        
        userText = new JTextField("");
        add(userText);
     
        PassLabel = new JLabel("password ");
        add(PassLabel);
        
        passText = new JPasswordField("");
        add(passText);
        
        LoginButton = new JButton("LOG IN");
        add(LoginButton);
        
        resetButton = new JButton("Forget password");
        add(resetButton);
        
        setLayout(null);
        TitleLabel.setBounds(70,200,200,30);
        userLabel.setBounds(TitleLabel.getX()+10,TitleLabel.getY()+30,LW,LH);
        userText.setBounds(userLabel.getX()+100 , userLabel.getY() , TW , TH);
        PassLabel.setBounds(userLabel.getX(),userLabel.getY()+50,LW,LH);
        passText.setBounds(userLabel.getX()+100 , userLabel.getY()+50 , TW , TH);
        LoginButton.setBounds(userLabel.getX() + 100 , userLabel.getY()+120 ,100,50 );
        resetButton.setBounds(userLabel.getX() + 80 , userLabel.getY()+180 ,150,50 );
   //  resetButton.addActionListener(new action());
           LoginButton.addActionListener(new action());
    }

    private class action implements ActionListener{
    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("LOG IN"))
        {
             
            int y =Integer.parseInt( passText.getText());
            if(("admin@yahoo.com".equals(userText.getText())&&y==12345678)){
                setvis();
            new AdminMenu("Admin menue").setVisible(true);
            }
            
             }
        
        
    }
    }
    private void setvis()
    {
        this.setVisible(false);
    }
    public static void main(String [] args)
    {
        loginGUI x = new loginGUI("LOG IN");
        x.setVisible(true);
    }
}
