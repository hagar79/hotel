/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.reservation2;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class HotelReservation2 extends JFrame {

    /*
        JMenuBar mm;
        JMenu n1,n2;
        JMenuItem i1,i2,i3,i4,i5;
        HotelReservation2()
        {
            mm = new JMenuBar();
            add(mm);
            n1 = new JMenu ( "HOTEL RESERVATION" );
            mm.add(n1);
            n2 = new JMenu ( " LOGIN ");
            mm.add(n2);
            i1 = new JMenuItem (" GUEST ");
            n1.add(i1);
            i2 = new JMenuItem (" CHECKIN ");
            n2.add(i2);
            i3 = new JMenuItem (" CHECKOUT ");
            n2.add(i3);
            i4 = new JMenuItem (" ADDITIONAL SERVICE ");
            n2.add(i4);
            i4 = new JMenuItem (" LOGIN FORM ");
            n2.add(i4);
            mm.setBounds(0,0,1000,100);
            setLayout(null);
            setBounds(0,0,500,500);
            setVisible(true);
        }
         
        
     */
    public static void main(String[] args) throws ClassNotFoundException, FileNotFoundException, IOException 
    {

        Guest g1 = new Guest();
        g1.setid(100);
        g1.setname("AHMED");
        try (final FileOutputStream fout = new FileOutputStream("hotelreservationsystem.txt");
                final ObjectOutputStream out = new ObjectOutputStream(fout)) {
            out.writeObject(g1);
            out.flush();
            System.out.println("success");
            FileInputStream fin = new FileInputStream("hotelreservationsystem.txt");
            ObjectInputStream in = new ObjectInputStream(fin);
            Guest guest = (Guest) in.readObject();
            System.out.println(guest);
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        //Creating object of LoginFrame class and setting some of its properties
        Login frame1 = new Login();
        frame1.setTitle("Login Form");
        frame1.setVisible(true);
        frame1.setBounds(10, 10, 370, 600);
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame1.setResizable(true);

        //new HotelReservation2().setVisible(true);
        Services fr = new Services();
        fr.setVisible(true);

        Guest fl = new Guest();
        fl.setVisible(true);

        JFrame frame = new JFrame();
        frame.setVisible(true);
        frame.setSize(new Dimension(500, 500));
        frame.setTitle("HOTEL RESERVATION");
        frame.setLayout(new BorderLayout());

        JButton j = new JButton();
        j.setPreferredSize(new Dimension(75, 150));
        j.setBackground(Color.RED);
        j.setFont(new Font("Arial", Font.PLAIN, 40));
        j.setForeground(Color.BLACK);
        j.setText("LOGIN FORM");
        frame.add(j, BorderLayout.SOUTH);
        JPanel north = new JPanel(new BorderLayout());
        JLabel t = new JLabel("HOTEL RESERVATION");
        north.setBackground(Color.WHITE);
        t.setFont(new Font("Arial", Font.PLAIN, 50));
        t.setForeground(Color.BLUE);
        t.setHorizontalAlignment(0);
        t.setVerticalAlignment(1);
        frame.add(north, BorderLayout.NORTH);
        north.add(t);
        JPanel p = new JPanel(new GridLayout(10, 1));
        p.setBackground(Color.WHITE);
        JLabel please_select = new JLabel("PLEASE SELECT");
        p.add(please_select);
        p.add(new JLabel(""));
        please_select.setFont(new Font("Ariel", Font.PLAIN, 50));
        JButton please_select1 = new JButton(" GUEST ");
        JButton please_select2 = new JButton(" TRADITIONAL SERVICE ");
        JButton please_select3 = new JButton(" CHECKIN ");
        JButton please_select4 = new JButton(" CHECKOUT ");
        frame.add(please_select1);
        p.add(please_select1);
        frame.add(please_select2);
        p.add(please_select2);

        frame.add(please_select3);
        p.add(please_select3);
        p.add(please_select4);
        p.add(please_select4);
        p.add(new JLabel(""));
        frame.add(p, BorderLayout.CENTER);
        frame.add(p);

    }

}
