/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Network;

import java.io.IOException;
import javax.swing.JFrame;

/**
 *
 * @author ASUS
 */
public class Ch9NEClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Client cl=new Client("Reciptionist");
        cl.setVisible(true);
        cl.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        Client cl2=new Client("Guest");
        cl2.setVisible(true);
        cl2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
}
