/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import javax.swing.JFrame;

/**
 *
 * @author DELL
 */
public class Graphics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       creat_panel cc=new creat_panel("test", "compare");
       cc.pack();
       cc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       cc.setVisible(true);
    }
    
}
