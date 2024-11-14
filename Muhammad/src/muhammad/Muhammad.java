/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package muhammad;

/**
 *
 * @author USER
 */
import java.awt.*;
//import java.awt.event.*;
import javax.swing.*;

public class Muhammad extends JFrame {
    private JLabel label1, label2;
    private JRadioButton b1;
    private JCheckBox cb1;
    private JButton plainbutton;
    private JTextField TextA;

   
    public Muhammad(){
       super("Teka");
       Container container = getContentPane();
       container.setLayout(new FlowLayout());
       label1 = new JLabel("Siapakah saya?");
      // label1.setToolTipText("this is label1");
       container.add(label1);
       setSize(600,575);
       label1.setLocation(50, 50);
       setVisible(true);
       
        Icon rabbit = new ImageIcon("src/Muhammad/mad.png");
        label2 = new JLabel("", rabbit,SwingConstants.LEFT);
        label2.setToolTipText("");
        container.add(label2);
        label2.setSize(30, 20);
        
        b1 = new JRadioButton("Muhammad");
        container.add(b1);
        
        cb1 = new JCheckBox("Mahmud");
        add(cb1);
        
        plainbutton = new JButton("Muhdzz");
        container.add(plainbutton);
        plainbutton.setSize(100, 30);
        
        TextA = new JTextField ("Isi la Sendiri");
        TextA.setSize(150,50);
        TextA.setBackground(Color.yellow);
        TextA.setForeground(Color.black);
        add(TextA);
    }
    public static void main(String[] args) {
        Muhammad application = new Muhammad();
        application.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
