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
public class MenueOfReceptionist extends MenueFrame implements ActionListener {
    JButton AddServiceButton;
    JButton GeneratBillButton;
    
    public MenueOfReceptionist(String s) {
        super(s);
         AddButton = new JButton("Add Guest");
        add(AddButton);
        AddButton.addActionListener(this);
        
        SearchButton = new JButton("Search for Guest");
        add(SearchButton);
        SearchButton.addActionListener(this);
        
        setLayout(null);
        AddButton.setBounds(100,200,250,40);
        SearchButton.setBounds(AddButton.getX(),AddButton.getY()+50,250,40);
        AddServiceButton = new JButton("Add searvice");
        add(AddServiceButton);
        AddServiceButton.addActionListener(this);
        
        GeneratBillButton = new JButton("Generate Bill");
        add(GeneratBillButton);
        GeneratBillButton.addActionListener(this);
        
        
        setLayout(null);
        AddButton.setBounds(100,200,250,40);
        SearchButton.setBounds(AddButton.getX(),AddButton.getY()+50,250,40);       
        AddServiceButton.setBounds(AddButton.getX(),AddButton.getY()+100,250,40);
        GeneratBillButton.setBounds(AddButton.getX(),AddButton.getY()+150,250,40);
    }

    

        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getSource() == this.AddButton)
            {
                this.setVisible(false);
                new AddGuestGUI("add new Giest").setVisible(true);
            }
            else{
                if(e.getSource() == this.SearchButton)
                {
                    this.setVisible(false);
                    new SearchForGuest("search for Guset").setVisible(true);
                }
                else{
                    
                }
            }
            
        }
        
    
    
    public static void main(String []args)
    {
        MenueOfReceptionist m = new MenueOfReceptionist("dfsf");
        m.setVisible(true);
    }
}
