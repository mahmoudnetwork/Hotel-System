/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ClosingWindo implements WindowListener {

     @Override
    public void windowClosing(WindowEvent we) {
        int c = JOptionPane.showConfirmDialog(null, "Are You Sure , Exit from program " );
        if( c == JOptionPane.OK_OPTION)
        {
            System.exit(1);
        }
    }
    
    @Override
    public void windowOpened(WindowEvent we) {
        
    }

    @Override
    public void windowClosed(WindowEvent we) {
        
    }

    @Override
    public void windowIconified(WindowEvent we) {
        
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
        
    }

    @Override
    public void windowActivated(WindowEvent we) {
        
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        
    }
    
}
