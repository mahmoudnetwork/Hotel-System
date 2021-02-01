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
public abstract class SearchFrame extends MYFrame {
    JLabel SearchKeyLabel;
    JTextField SearchKeyText ;
    public SearchFrame(String s)
    {
        super(s);
        
        SearchKeyLabel = new JLabel(" Enter ID ");
        add(SearchKeyLabel);
        SearchKeyText = new JTextField("");
        add(SearchKeyText);
        setLayout(null);
        
        SearchKeyLabel.setBounds(100,220,100,30);
        SearchKeyText.setBounds(SearchKeyLabel.getX()+50,SearchKeyLabel.getY(),200,30);
        //SearchKeyText
    }

//    @Override
  //  public abstract void actionPerformed(ActionEvent ae) ;
        
    protected void reset() {
        SearchKeyText.setText("");
    }
    
}
