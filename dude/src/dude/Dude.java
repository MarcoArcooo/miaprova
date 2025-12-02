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
    
    private JTextArea textArea;
    
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
        
        textArea = new JTextArea(1, 5);
        textArea.setEditable(false);
        textArea.setAlignmentX(JTextArea.CENTER_ALIGNMENT);
        textArea.setLineWrap(false);
        textArea.setCaretPosition(0);
        DefaultCaret caret = (DefaultCaret)textArea.getCaret();
        caret.setUpdatePolicy(DefaultCaret.NEVER_UPDATE);
        textArea.setMaximumSize(textArea.getPreferredSize());
        textArea.setOpaque(true);
       
        textArea.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
        
        JButton startButton = new JButton("Start");
        startButton.setAlignmentX(JButton.CENTER_ALIGNMENT);
        startButton.setBackground(blue);
        startButton.setForeground(Color.WHITE);
        startButton.setFocusPainted(false);
        startButton.setOpaque(true);
        startButton.setBorderPainted(false);
        startButton.addActionListener(e -> runCalculation());
        
        mainPanel.add(textArea);
        mainPanel.add(Box.createVerticalStrut(10));
        mainPanel.add(startButton);
        add(mainPanel);
        setVisible(true);
    }
    
    private void runCalculation() {
        textArea.setText("");
        double x1 = 1.0;
        double x2 = 1000.0;
       
            double f = Math.random()/Math.nextDown(1.0);
            double x = x1*(1.0 - f) + x2*f;
            String result = " " + (int)x;
            textArea.setText(result);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new Dude());
    }
    
}
