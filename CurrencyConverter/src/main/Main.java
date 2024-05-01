package main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main {
	
	public static void converter()
	{
		JFrame f = new JFrame("Converter-v0.1");
		
		JLabel l1, l2, l3, l4;
		JTextField t1, t2;
		JButton b1, b2, b3;
		
		l1 = new JLabel("Lira:");
        l1.setBounds(90, 50, 65, 35);
        l2 = new JLabel("Dollars:");
        l2.setBounds(240, 50, 65, 35);
        l3 = new JLabel("CONVERTER - ver. 0.1 by pRx");
        l3.setBounds(312, 238, 250, 20);
        l4 = new JLabel("Currency is 1 USD = 32.5 TRY");
        l4.setBounds(6, 4, 250, 20);
        
        t1 = new JTextField("");
        t1.setBounds(125, 50, 75, 35);
        t2 = new JTextField("");
        t2.setBounds(292, 50, 75, 35);
        
        b1 = new JButton("TRY");
        b1.setBounds(130, 110, 80, 35);
        b2 = new JButton("USD");
        b2.setBounds(270, 110, 80, 35);
        b3 = new JButton("Close");
        b3.setBounds(160, 170, 150, 45);
        
        b1.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e)
        	{
        		double d = Double.parseDouble(t1.getText());
        		
        		double d1 = (d / 32.5);
        		
        		String str1 = String.format("%.02f", d1);
        		
        		t2.setText(str1);
        	}
        });
        
        b2.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e)
        	{
        		double d2 = Double.parseDouble(t2.getText());
        		
        		double d3 = (d2 * 32.5);
        		
        		String str2 = String.format("%.02f", d3);
        		
        		t1.setText(str2);
        	}
        });
        
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                f.dispose();
            }
        });
        
        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });
        
        f.add(l3);
        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(l4);
        
        f.setLayout(null);
        f.setSize(500, 300);
        f.setVisible(true);
        
        f.setResizable(false);
        
        f.setLocationRelativeTo(null);
	}
	
	public static void main(String args[])
    {
        converter();
    }
}
