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
public class MenueOfManager extends MenueFrame implements ActionListener{
    
    JButton FireButton;
    JButton GetReportButton;
    
    public MenueOfManager(String s) {
        super(s);
         AddButton = new JButton("Add Employee");
         
        add(AddButton);
        AddButton.addActionListener(this);
        SearchButton = new JButton("Search For Emoloyee");
        add(SearchButton);
        SearchButton.addActionListener(this);
        setLayout(null);
        AddButton.setBounds(100,200,250,40);
        SearchButton.setBounds(AddButton.getX(),AddButton.getY()+50,250,40);
        FireButton = new JButton("Back");
        add(FireButton);
        FireButton.addActionListener(this);
        GetReportButton = new JButton("Get Report");
        add(GetReportButton);
        GetReportButton.addActionListener(this);
        AddButton.setText("Add Employee");
        SearchButton.setText("Search For Emoloyee");
        
        //setLayout(null);
        FireButton.setBounds(AddButton.getX(),AddButton.getY()+150,250,40);
        GetReportButton.setBounds(AddButton.getX(),AddButton.getY()+100,250,40);
    }

   
        @Override
        public void actionPerformed(ActionEvent e) {
            if(e.getActionCommand() == "Add Employee")
            {
                
                this.setVisible(false);
                new AddEmployeeGUI("add new Employee").setVisible(true);
            }
            else{
                if(e.getActionCommand()=="Search For Emoloyee")
                {
                    this.setVisible(false);
                    new SearchForEmployee("Search For Emoloyee").setVisible(true);
                }
                else{
                    if(e.getSource() == this.GetReportButton);
                    {
                        //this.setVisible(false);
                        new Graphics("Salary Rate").setVisible(true);
                    }
                }
                if(e.getSource() == this.FireButton){
                    this.setVisible(false);
                    new AdminMenu( "admin menue").setVisible(true);
                }
                    
            }
        }
    
    
    public static void main(String []args)
    {
        MenueOfManager m = new MenueOfManager("Welcom manger :)");
        m.setVisible(true);
    }
    
}
