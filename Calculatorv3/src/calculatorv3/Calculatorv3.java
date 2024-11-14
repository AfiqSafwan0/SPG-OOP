/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculatorv3;

/**
 *
 * @author USER
 */

//link of the video
//https://youtu.be/dfhmTyRTCSQ?si=1vH-L0mCxb4Hcjdt

import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public abstract class Calculatorv3 implements ActionListener{
    
    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[10];
    JButton[] functionButtons = new JButton[8];
    JButton addButton, subButton, mulButton, divButton;
    JButton decButton, equButton, delButton, clrButton;
    JPanel panel;
    Font fontLarge = new Font("Times new roman", Font.BOLD, 30); 
    Font fontMedium = new Font("Sitka text", Font.BOLD, 25); 
    
    double num1 = 0, num2 = 0, result = 0;
    char operator;
    String expression = ""; // This will hold the step-by-step expression
    boolean decimalUsed = false; // Flag to track if the decimal point was entered

    // Constructor
    Calculatorv3() {
        frame = new JFrame("CalculatorAS");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(420, 550);
        frame.setLayout(null);
        frame.getContentPane().setBackground(Color.DARK_GRAY); 

        ImageIcon icon = new ImageIcon(getClass().getResource("/image.png"));
        frame.setIconImage(icon.getImage());

        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(fontLarge);  
        textfield.setEditable(false);
        textfield.setBackground(Color.WHITE); 
        textfield.setForeground(Color.BLACK); 
        frame.add(textfield);

        addButton = new JButton("+");
        subButton = new JButton("-");
        mulButton = new JButton("×");
        divButton = new JButton("÷");
        decButton = new JButton(".");
        equButton = new JButton("=");
        delButton = new JButton("CE");
        clrButton = new JButton("C");

        functionButtons[0] = addButton;
        functionButtons[1] = subButton;
        functionButtons[2] = mulButton;
        functionButtons[3] = divButton;
        functionButtons[4] = decButton;
        functionButtons[5] = equButton;
        functionButtons[6] = delButton;
        functionButtons[7] = clrButton;

        for (int i = 0; i < 8; i++) {
            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(fontMedium); 
            functionButtons[i].setBackground(Color.BLACK);  
            functionButtons[i].setForeground(Color.ORANGE); 
            functionButtons[i].setFocusable(false);
        }

        for (int i = 0; i < 10; i++) {
            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(fontLarge); 
            numberButtons[i].setBackground(Color.LIGHT_GRAY);  
            numberButtons[i].setForeground(Color.BLACK);  
            numberButtons[i].setFocusable(false);
        }

        panel = new JPanel();
        panel.setBounds(50, 100, 300, 300);
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        panel.setBackground(Color.DARK_GRAY);  

        panel.add(numberButtons[1]);
        panel.add(numberButtons[2]);
        panel.add(numberButtons[3]);
        panel.add(addButton);
        panel.add(numberButtons[4]);
        panel.add(numberButtons[5]);
        panel.add(numberButtons[6]);
        panel.add(subButton);
        panel.add(numberButtons[7]);
        panel.add(numberButtons[8]);
        panel.add(numberButtons[9]);
        panel.add(mulButton);
        panel.add(decButton);
        panel.add(numberButtons[0]);
        panel.add(equButton);
        panel.add(divButton);

        frame.add(panel);
        delButton.setBounds(50, 430, 145, 50);
        clrButton.setBounds(205, 430, 145, 50);
        frame.add(delButton);
        frame.add(clrButton);

        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource() == numberButtons[i]) {
                textfield.setFont(fontLarge);  
                textfield.setText(textfield.getText().concat(String.valueOf(i)));
                expression = expression.concat(String.valueOf(i)); // Update expression
            }
        }
        if (e.getSource() == decButton) {
            if (!decimalUsed) {  // Prevent multiple decimals in a number
                textfield.setFont(fontLarge); 
                textfield.setText(textfield.getText().concat("."));
                expression = expression.concat("."); // Update expression
                decimalUsed = true;  // Set flag to true after decimal point is entered
            }
        }
        if (e.getSource() == addButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '+';
            textfield.setText("");
            expression = expression.concat(" + "); // Add operator to the expression
            decimalUsed = false;  // Reset decimal flag after an operator
        }
        if (e.getSource() == subButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '-';
            textfield.setText("");
            expression = expression.concat(" - "); // Add operator to the expression
            decimalUsed = false;  // Reset decimal flag after an operator
        }
        if (e.getSource() == mulButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '*';
            textfield.setText("");
            expression = expression.concat(" × "); // Add operator to the expression
            decimalUsed = false;  // Reset decimal flag after an operator
        }
        if (e.getSource() == divButton) {
            num1 = Double.parseDouble(textfield.getText());
            operator = '/';
            textfield.setText("");
            expression = expression.concat(" ÷ "); // Add operator to the expression
            decimalUsed = false;  // Reset decimal flag after an operator
        }
        if (e.getSource() == equButton) {
            num2 = Double.parseDouble(textfield.getText());
            expression = expression.concat(" = "); // Add equal sign to expression
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    result = num1 / num2;
                    break;
            }
            // If result is a whole number, display it without decimal point
            if (result == (int) result && !decimalUsed) {
                expression = expression.concat(String.valueOf((int) result));
            } else {
                expression = expression.concat(String.valueOf(result));
            }
            textfield.setText(expression); // Display full expression with result
            num1 = result;
            decimalUsed = false;  // Reset decimal flag after a result
        }
        if (e.getSource() == clrButton) {
            textfield.setText("");
            expression = ""; // Clear expression
            decimalUsed = false;  // Reset decimal flag
        }
        if (e.getSource() == delButton) {
            String str = textfield.getText();
            textfield.setText("");
            expression = expression.substring(0, expression.length() - 1); // Update expression
            for (int i = 0; i < str.length() - 1; i++) {
                textfield.setText(textfield.getText() + str.charAt(i));
            }
        }
    }

    public static void main(String[] args) {
        new Calculatorv3() {};
    }

    private void setIconImage(Image icon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}