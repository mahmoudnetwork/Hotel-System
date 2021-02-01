/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import core.Employee;
import java.awt.Color;
import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JFrame;
import javax.swing.JLabel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

/**
 *
 * @author DELL
 */
public class Graphics extends JFrame{
protected int LW=100 , LH = 30 , TW = 200 , TH = 30 ;
    JLabel TitleLabel;
    JLabel succes ; 
    JLabel fail;
    Graphics(String s) {
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
        PieDataset dataset =createDataset();
        JFreeChart chart= x(dataset,s);
        ChartPanel v=new ChartPanel(chart);
        v.setPreferredSize(new java.awt.Dimension(500,300));
        setContentPane(v);
    }
    private JFreeChart x(PieDataset dataset,String c)
    {
        JFreeChart chart =ChartFactory.createPieChart3D(c, dataset);
        PiePlot3D plot=(PiePlot3D)chart.getPlot();
        plot.setStartAngle(0);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;
    }
    
   /* public Graphics(String t,String c )
    {
        PieDataset dataset =createDataset();
        JFreeChart chart= x(dataset,c);
        ChartPanel v=new ChartPanel(chart);
        v.setPreferredSize(new java.awt.Dimension(500,300));
        setContentPane(v);
    }*/
    
    private PieDataset createDataset()
    {
        
        
        DefaultPieDataset result=new DefaultPieDataset();
        result.setValue("ahmed", 2000);
        result.setValue("mohamed", 3000);
         result.setValue("omar", 300);
          result.setValue("mahmoud", 5000);
        
        return result;
    }

   public static void main(String[] args) {
       Graphics cc=new Graphics(" ");
       cc.pack();
       cc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       cc.setVisible(true);
    }
    
    
}
