/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package graphicchap8;

import java.awt.*;
import javax.swing.*;


/**
 *
 * @author USER
 */
public class GraphicChap8 extends JPanel {
        public void paint(Graphics g) {

        super.paint(g);

        g.setFont(new Font("Tahoma",Font.ITALIC,22));
        g.drawString("GERMAN-MALAYSIAN INSTITUTE",10,20);
        g.setColor(Color.RED);
        g.drawLine(5, 30, 350, 30);
        g.setColor( Color.blue );
        g.fillRect(50, 40, 15, 80);    
        g.fillRect(50, 40, 70, 15);    
        g.fillRect(50, 110, 70, 15);   
        g.fillRect(105, 70, 15, 50);   
        g.fillRect(95, 70, 15, 15);    
        
        g.fillRect(130, 40, 15, 80);   
        g.fillRect(180, 40, 15, 80);   
        g.fillRect(145, 40, 15, 15);   
        g.fillRect(160, 55, 15, 15);   
        g.fillRect(175, 40, 15, 15);   

        g.fillRect(200, 60, 15, 60);
        g.setColor( Color.red);
        g.fillOval(198, 35, 20, 20);
        

        

    }
        public static void main(String[] args) {  
        GraphicChap8 m=new GraphicChap8();  
        JFrame f=new JFrame();  
        f.add(m);  
        f.setSize(420,420);  
        //f.setLayout(null);  
        f.setVisible(true);  
    }  
  
}  
