/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class SearchResult extends MYFrame {
    
    JTextArea resultText;
    
    public SearchResult(String s) {
        super(s);
        resultText = new JTextArea(100,100);
       
    }

    
    
}
