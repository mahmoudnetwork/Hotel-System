/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graphics;

import java.util.ArrayList;
import java.util.Locale;
import javax.swing.JFrame;
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
public class creat_panel extends JFrame{
    private JFreeChart x(PieDataset dataset,String c)
    {
        JFreeChart chart =ChartFactory.createPieChart3D(c, dataset);
        PiePlot3D plot=(PiePlot3D)chart.getPlot();
        plot.setStartAngle(0);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;
    }
    
    public creat_panel(String t,String c )
    {
        PieDataset dataset =createDataset();
        JFreeChart chart= x(dataset,c);
        ChartPanel v=new ChartPanel(chart);
        v.setPreferredSize(new java.awt.Dimension(500,300));
        setContentPane(v);
    }
    
    private PieDataset createDataset()
    {
        DefaultPieDataset result=new DefaultPieDataset();
        result.setValue("yaseer", 99);
        result.setValue("ahmed", 50);
        
        return result;
    }

    
   /* private JFreeChart x(PieDataset dataset,String c)
    {
        JFreeChart chart =ChartFactory.createPieChart3D(c, dataset, true, true, false);
        PiePlot3D plot=(PiePlot3D)chart.getPlot();
        plot.setStartAngle(0);
        plot.setDirection(Rotation.CLOCKWISE);
        plot.setForegroundAlpha(0.5f);
        return chart;
    }*/
    
}
