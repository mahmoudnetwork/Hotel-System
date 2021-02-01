/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;


import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author User
 */
public abstract class FrameTitle extends JFrame {
    protected int LW=100 , LH = 30 , TW = 200 , TH = 30 ;
    JLabel TitleLabel;
    JLabel succes ; 
    JLabel fail;
    
    public FrameTitle(String s)
    {
        
        super(s);
        setSize(550, 650);
        this.TitleLabel = new JLabel(s);
        add(TitleLabel);
        
        this.succes = new JLabel("the Quary Don Succes !");
        add(succes);
        succes.setVisible(false);
        
        this.fail = new JLabel("Sorry.this Quary can`t work!");
        add(fail);
        fail.setVisible(false);
        
        setLayout(null);
       TitleLabel.setBounds(50, 10, 200, 40);
       succes.setBounds(TitleLabel.getX()+50,TitleLabel.getY() , 150 , 40);
       fail.setBounds(TitleLabel.getX()+50, TitleLabel.getY(), 150, 40);
       
                   getContentPane().setBackground(Color.CYAN);

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
       addWindowListener(new ClosingWindo());
    }
    /*
    public static void main(String [] args)
    {
        FrameTitle m = new FrameTitle("yahia abdullah");
        m.setVisible(true);
    }*/

    //@Override
   // public abstract void actionPerformed(ActionEvent ae);
}
