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
 * @author Mahmoud Awad
 */
public class AdminMenu extends FrameTitle implements ActionListener{
    JButton btn1;
    JButton btn2;
    public AdminMenu(String title) {
        super(title);
        btn1=new JButton("Manager");
        add(btn1);
        btn1.addActionListener(this);
        btn2=new JButton("Receptionist");
        add(btn2);
        btn2.addActionListener(this);
        btn1.setBounds(TitleLabel.getBounds().x+100, TitleLabel.getBounds().y+150, 200, 40);
        btn2.setBounds(btn1.getBounds().x, TitleLabel.getBounds().y+200, 200, 40);

    }
    public static void main(String[] args) {
        AdminMenu m=new AdminMenu("This is our Project");
        m.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.btn1)
        {
            this.setVisible(false);
            new MenueOfManager("Manager menue").setVisible(true);
        }
        else{
            if(e.getSource() == this.btn2)
            {
                new MenueOfReceptionist("Receptionist Actions").setVisible(true);
                this.setVisible(false);
               // new MenueOfReceptionist("Receptionist Actions").setVisible(true);
            }
        }
    }
    
    
   
}
