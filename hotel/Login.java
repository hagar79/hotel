/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.reservation2;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Hope
 */
public class Login extends JFrame implements ActionListener
{
     // Objects 
    Container container = getContentPane();
    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");
    
    Login()
    {
        //Calling setLayoutManger() method inside the constructor.
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }
     //Calling setLayoutManger() method inside the constructor. pass null as its argument
     public void setLayoutManager()
    {
        container.setLayout(null);
    }
     public void setLocationAndSize() 
     {
        userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);
        resetButton.setBounds(200, 300, 100, 30);
    }
    public void addComponentsToContainer() 
    {
        container.add(userLabel);
        container.add(passwordLabel);
        container.add(userTextField);
        container.add(passwordField);
        container.add(showPassword);
        container.add(loginButton);
        container.add(resetButton);
    }
    public void addActionEvent() 
    {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent e) //ActionListener contains only one method actionPerformed(ActionEvent e), so if we are implementing the ActionListener interface in any class, then we have to override its method actionPerformed(ActionEvent e) into that class.
    {
        //Coding Part of LOGIN button
        if (e.getSource() == loginButton) 
        {
            String userText;
            String passwordText;
            userText = userTextField.getText();
            passwordText = passwordField.getText();
            if (userText.equalsIgnoreCase("hana") && passwordText.equalsIgnoreCase("1234")) 
            {
                new HotelReservation2().setVisible(true);
                JOptionPane.showMessageDialog(this, "Login Successful");
            } else 
            {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }
 
        }
        //Coding Part of RESET button
        if (e.getSource() == resetButton) 
        {
            userTextField.setText("");
            passwordField.setText("");
        }
       
        if (e.getSource() == showPassword)
        {
            if (showPassword.isSelected()) 
            {
                passwordField.setEchoChar((char) 0);
            } else 
            {
                passwordField.setEchoChar('*');
            }
 
 
        }
    }
}
