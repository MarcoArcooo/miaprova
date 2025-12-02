/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dude;
import java.lang.Math;
import java.awt.Color;
import javax.swing.*;
import javax.swing.text.DefaultCaret;

/**
 *
 * @author marco
 */
public class Dude extends JFrame {
    
    private JTextField textField;
    
    public Dude() {
        setTitle("Random Integer Generator");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(200, 130);
        setLocationRelativeTo(null);
        
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));
        
        // Colors: light blue for background, darker blue for controls
        Color lightBlue = new Color(173, 216, 230); // lightblue
        Color blue = new Color(30, 144, 255); // dodgerblue
        getContentPane().setBackground(lightBlue);
        mainPanel.setBackground(lightBlue);
        
        textField = new JTextField(5);
        textField.setEditable(false);
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setAlignmentX(JTextField.CENTER_ALIGNMENT);
        textField.setMaximumSize(textField.getPreferredSize());
        textField.setOpaque(true);
        textField.setBackground(blue);
        textField.setForeground(Color.WHITE);
        textField.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        
        JButton startButton = new JButton("Random");
        startButton.setAlignmentX(JButton.CENTER_ALIGNMENT);
        startButton.setBackground(blue);
        startButton.setForeground(Color.WHITE);
        startButton.setFocusPainted(false);
        startButton.setOpaque(true);
        startButton.setBorderPainted(false);
        startButton.addActionListener(e -> runCalculation());
        
        mainPanel.add(textField);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(startButton);
        add(mainPanel);
        setVisible(true);
    }
    
    private void runCalculation() {
        textField.setText("");
        double x1 = 1.0;
        double x2 = 1000.0;
       
            double f = Math.random()/Math.nextDown(1.0);
            double x = x1*(1.0 - f) + x2*f;
            textField.setText(String.valueOf((int)x));
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Dude());
    }
    
}
