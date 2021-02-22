package hotel.reservation2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author salmahelmi
 */
public class Guest extends JFrame implements ActionListener {

    Scanner input = new Scanner(System.in);

    public String CheckNationality;
    public String name;
    public int age;
    public int Nationalid;
    public String checkindate;
    public int checkoutdate;
    public int roomnum;
    public String roomtype;

    public double deposit;

    public Guest() {
        JOptionPane.showMessageDialog(null, "would you like to choose your room now");
        JFrame f = new JFrame();
        JComboBox choice = new JComboBox(new String[]{"yes", "no"});
        f.add(choice);
        JLabel l = new JLabel();
        setLayout(new FlowLayout());
        setSize(500, 200);
        setTitle(" Guest ");
        choice.setSelectedIndex(1);
        choice.addActionListener(this);
        add(choice);
        add(l);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public Guest(String CheckNationality, String name, int age, int Nationalid, String checkindate, int checkoutdate, int roomnum, String roomtype, boolean checkroom, double deposit) {
        this.CheckNationality = CheckNationality;
        this.name = name;
        this.age = age;
        this.Nationalid = Nationalid;
        this.checkindate = checkindate;
        this.checkoutdate = checkoutdate;
        this.roomnum = roomnum;
        this.roomtype = roomtype;
        this.deposit = deposit;
    }

    public String getname(String name) {
        System.out.println("Please Enter Your Name");
        String num = input.nextLine();
        return num;
    }

    public String setname(String name) {
        return this.name = name;
    }

    public int getage(int age) {
        System.out.println("Enter Your Age");
        int age1 = input.nextInt();
        return age1;
    }

    public int setage(int age) {
        return this.age = age;
    }

    public int getid(int Nationalid) {
        System.out.println("Enter Your National ID ");
        int num1 = input.nextInt();
        return num1;
    }

    public int setid(int Nationalid) {
        return this.Nationalid = Nationalid;
    }

    public String getcheckin(String checkindate) {
        System.out.println("Enter CheckIn Date ");
        String date1 = input.nextLine();
        return date1;
    }

    public String setsheckin(String checkindate) {
        return this.checkindate = checkindate;
    }

    public int getcheckout(int checkoutdate) {
        return checkoutdate;
    }

    public int setsheckout(int checkindate) {
        return this.checkoutdate = checkoutdate;
    }

    public void actionPerformed(ActionEvent e) {

        JFrame f = new JFrame();
        System.out.println("Which Room Would You Like To Select ?");
        System.out.println("*************");
        RoomType1 roomtype1 = new RoomType1("Deluxe Room ", 111);
        System.out.println(" 1) Deluxe Room");
        roomtype1.getRoomDetails();
        System.out.println("*************");
        RoomType2 roomtype2 = new RoomType2("Deluxe Room ", 222);
        System.out.println(" 2) Honeymoon - Package");
        roomtype2.getRoomDetails();
        System.out.println("*************");
        RoomType3 roomtype3 = new RoomType3(" Family Suite (2 Adults) ", 333);
        System.out.println(" 3) Family Suite (2 Adults)");
        roomtype3.getRoomDetails();
        System.out.println("*************");
        RoomType4 roomtype4 = new RoomType4("Junior Family Suite (2 Adults) ", 444);
        System.out.println(" 4)Junior Family Suite (2 Adults)");
        roomtype4.getRoomDetails();
        System.out.println("*************");
        RoomType5 roomtype5 = new RoomType5(" Aqua Suite ", 555);
        System.out.println(" 5)Aqua Suite");
        roomtype5.getRoomDetails();
        System.out.println("*************");
        RoomType6 roomtype6 = new RoomType6(" Deluxe Triple Room ", 666);
        System.out.println(" 6)Deluxe Triple Room");
        roomtype6.getRoomDetails();
        System.out.println("*************");
        System.out.println("Please Enter Your Select Number");
        String g = JOptionPane.showInputDialog(null, "which room is your choice", JOptionPane.QUESTION_MESSAGE);
        JComboBox finalroom = new JComboBox(new String[]{" 1) Deluxe Room", " 2) Honeymoon - Package", " 3) Family Suite (2 Adults)", " 4)Junior Family Suite (2 Adults)", " 5)Aqua Suite", " 6)Deluxe Triple Room"});
        f.add(finalroom);

    }

    public int setroomnum(int roomnum) {
        return this.roomnum = roomnum;
    }

    public String getroomtype(String roomtype) {
        return roomtype;
    }

    public String setroomtype(String roomtype) {
        return this.roomtype = roomtype;
    }

    public double getdeposit(double deposit) {
        return deposit;
    }

    public double setdeposit(double deposit) {
        return this.deposit = deposit;
    }

    public String getCheckNationality() {
        System.out.println("Please Enter Your Nationality");
        String x = input.nextLine();
        return x;
    }

    public void setCheckNationality(String CheckNationality) {
        this.CheckNationality = CheckNationality;
    }

    public void prices() {
        JOptionPane.showMessageDialog(null, "press ok if you would like to know the prices");
        JFrame f = new JFrame();
        JButton b = new JButton("ok");
        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JLabel label = new JLabel("here is our price list");
            }
        };
        b.addActionListener(listener);
        f.add(b);
        ArrayList<Integer> arrlist = new ArrayList<Integer>(6);

        arrlist.add(1500);
        arrlist.add(2200);
        arrlist.add(3300);
        arrlist.add(4500);
        arrlist.add(5000);
        arrlist.add(6500);

        System.out.println("single=" + arrlist.get(0));
        System.out.println("double=" + arrlist.get(1));
        System.out.println("triple=" + arrlist.get(2));
        System.out.println("honeymoon=" + arrlist.get(3));
        System.out.println("sweet=" + arrlist.get(4));
        System.out.println("deluxe=" + arrlist.get(5));

    }

}
