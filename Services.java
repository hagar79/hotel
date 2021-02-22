/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hotel.reservation2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Services extends JFrame implements ActionListener {

    String[] strings = {"gym", "spa", "safari"};
    JComboBox combo = new JComboBox(strings);
    JLabel label = new JLabel();

    public Services() {
        setLayout(new FlowLayout());
        setSize(500, 200);
        setTitle(" Service");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        combo.setSelectedIndex(1);
        combo.addActionListener(this);
        add(combo);
        add(label);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == combo) {
            JComboBox cb = (JComboBox) e.getSource();
            String msg = (String) cb.getSelectedItem();
            if (msg == "gym") {//String [] str={"1)gym and transportation","2)gym and breakfast","3)gym and dinner"};
                JLabel lab = new JLabel("1 gym and transportation");

                add(lab);
                JLabel lab2 = new JLabel("2 gym and breakfast");

                add(lab2);
                JLabel lab3 = new JLabel("3 gym and dinner");

                add(lab3);
                setVisible(true);
                String x = JOptionPane.showInputDialog("please choose a number");
                int y = Integer.parseInt(x);
                while (y < 1 || y > 3) {
                    x = JOptionPane.showInputDialog("please enter a number between 1 and 3 ");
                    y = Integer.parseInt(x);
                }
                if (y == 1) {
                    String z = JOptionPane.showInputDialog("please pay 500");
                    int h = Integer.parseInt(z);
                    while (h < 500) {
                        z = JOptionPane.showInputDialog("insufficient money please pay 500");
                        h = Integer.parseInt(z);
                    }
                    if (h >= 500) {
                        JOptionPane.showMessageDialog(null, "thanks and enjoy");
                    }

                } else if (y == 2) {
                    String z = JOptionPane.showInputDialog("please pay 300");
                    int h = Integer.parseInt(z);
                    while (h < 300) {
                        z = JOptionPane.showInputDialog("insufficient money please pay 300");
                        h = Integer.parseInt(z);
                    }
                    if (h >= 300) {
                        JOptionPane.showMessageDialog(null, "thanks and enjoy");
                    }

                } else {
                    String z = JOptionPane.showInputDialog("please pay 400");
                    int h = Integer.parseInt(z);
                    while (h < 400) {
                        z = JOptionPane.showInputDialog("insufficient money please pay 400");
                        h = Integer.parseInt(z);
                    }
                    if (h >= 400) {
                        JOptionPane.showMessageDialog(null, "thanks and enjoy");
                    }

                }
            } else if (msg == "spa") {
                JLabel lab = new JLabel("1 spa and transportation");

                add(lab);
                JLabel lab2 = new JLabel("2 spa and breakfast");

                add(lab2);
                JLabel lab3 = new JLabel("3 spa and dinner");

                add(lab3);
                setVisible(true);
                String x = JOptionPane.showInputDialog("please choose a number");
                int y = Integer.parseInt(x);
                while (y < 1 || y > 3) {
                    x = JOptionPane.showInputDialog("please enter a number between 1 and 3 ");
                    y = Integer.parseInt(x);
                }
                if (y == 1) {
                    String z = JOptionPane.showInputDialog("please pay 300");
                    int h = Integer.parseInt(z);
                    while (h < 300) {
                        z = JOptionPane.showInputDialog("insufficient money please pay 300");
                        h = Integer.parseInt(z);
                    }
                    if (h >= 300) {
                        JOptionPane.showMessageDialog(null, "thanks and enjoy");
                    }

                } else if (y == 2) {
                    String z = JOptionPane.showInputDialog("please pay 175");
                    int h = Integer.parseInt(z);
                    while (h < 175) {
                        z = JOptionPane.showInputDialog("insufficient money please pay 175");
                        h = Integer.parseInt(z);
                    }
                    if (h >= 175) {
                        JOptionPane.showMessageDialog(null, "thanks and enjoy");
                    }

                } else {
                    String z = JOptionPane.showInputDialog("please pay 250");
                    int h = Integer.parseInt(z);
                    while (h < 250) {
                        z = JOptionPane.showInputDialog("insufficient money please pay 250");
                        h = Integer.parseInt(z);
                    }
                    if (h >= 250) {
                        JOptionPane.showMessageDialog(null, "thanks and enjoy");
                    }

                }
            } else {
                JLabel lab = new JLabel("1 safari and transportation");

                add(lab);
                JLabel lab2 = new JLabel("2 safari and breakfast");

                add(lab2);
                JLabel lab3 = new JLabel("3 safari and dinner");

                add(lab3);
                setVisible(true);
                String x = JOptionPane.showInputDialog("please choose a number");
                int y = Integer.parseInt(x);
                while (y < 1 || y > 3) {
                    x = JOptionPane.showInputDialog("please enter a number between 1 and 3 ");
                    y = Integer.parseInt(x);
                }
                if (y == 1) {
                    String z = JOptionPane.showInputDialog("please pay 700");
                    int h = Integer.parseInt(z);
                    while (h < 700) {
                        z = JOptionPane.showInputDialog("insufficient money please pay 700");
                        h = Integer.parseInt(z);
                    }
                    if (h >= 700) {
                        JOptionPane.showMessageDialog(null, "thanks and enjoy");
                    }

                } else if (y == 2) {
                    String z = JOptionPane.showInputDialog("please pay 500");
                    int h = Integer.parseInt(z);
                    while (h < 500) {
                        z = JOptionPane.showInputDialog("insufficient money please pay 500");
                        h = Integer.parseInt(z);
                    }
                    if (h >= 500) {
                        JOptionPane.showMessageDialog(null, "thanks and enjoy");
                    }

                } else {
                    String z = JOptionPane.showInputDialog("please pay 600");
                    int h = Integer.parseInt(z);
                    while (h < 600) {
                        z = JOptionPane.showInputDialog("insufficient money please pay 600");
                        h = Integer.parseInt(z);
                    }
                    if (h >= 600) {
                        JOptionPane.showMessageDialog(null, "thanks and enjoy");
                    }

                }

            }
        }

    }
}
