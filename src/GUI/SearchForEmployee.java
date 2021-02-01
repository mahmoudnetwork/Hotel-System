/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import core.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class SearchForEmployee extends SearchFrame implements ActionListener {

    public SearchForEmployee(String s) {
        super(s);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == BackButton)
        {
            this.setVisible(false);
            new MenueOfManager("menager Action").setVisible(true);
        }
            if(e.getSource() == resetButton)
            {
                this.SearchKeyText.setText(" "); 
            }
            
                if(e.getActionCommand().equals("Submit"))
                {
                    Manager m =new Manager();
                    
                        Employee x = m.SearchEmploye(Integer.parseInt(SearchKeyText.getText()));
                        this.setVisible(false);
                        new   AddEmployeeGUI("View Employee").setVisible(true);
                        AddEmployeeGUI.view(x);
                        
                }
            }
        
    

    private class action implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
        }
    }
    
}
