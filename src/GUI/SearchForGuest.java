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
public class SearchForGuest extends SearchFrame implements ActionListener{

    public SearchForGuest(String s) {
        super(s);
    }

   

        @Override
        public void actionPerformed(ActionEvent e) {
           if(e.getSource() == BackButton)
        {
            this.setVisible(false);
            new MenueOfReceptionist("Receptionist Action").setVisible(true);
        }
            if(e.getSource() == resetButton)
            {
                this.SearchKeyText.setText(" "); 
            }
            
                if(e.getActionCommand().equals("Submit"))
                {
                    Receptionist m =new Receptionist();
                    
                        Guest x = m.Searchguest(Integer.parseInt(SearchKeyText.getText()));
                        this.setVisible(false);
                        new AddGuestGUI("View Guest").setVisible(true);
                        AddGuestGUI.view(x);
                        
                }
            }
        
    private class action implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent ae) {
            
        }
    }
        
    
        }
    
    

