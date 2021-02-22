package hotel.reservation2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author salmahelmi
 */
public class CheckIn extends Guest implements ActionListener {

    public int checkinday;
    public int checkinmonth;
    public String roomchoice;
    public int roomprice;

    public CheckIn() {
        super();
    }

    public CheckIn(int checkinday, int checkinmonth, String roomchoice, int roomprice) {

        checkinday = 1;
        checkinmonth = 12;
        roomchoice = "deluxe";
        roomprice = 300;
    }

    public int getroomprice(int roomprice) {
        return roomprice;
    }

    public int setroomprice(int roomprice) {
        return this.roomprice = roomprice;
    }

    private static void BookARoom(int roomNum) {
        String g = JOptionPane.showInputDialog(null, "book a room now", JOptionPane.QUESTION_MESSAGE);
        JTextField t = new JTextField(20);
        String roomName;
        Scanner input = new Scanner(System.in);
        JLabel label = new JLabel("Enter room number (1-6):");
        roomNum = input.nextInt();
        JLabel label1 = new JLabel("Enter name for room   :");
        JFrame f = new JFrame();
        f.add(t);
        f.add(label);
        f.add(label1);
        roomName = input.next();
        CheckIn ch1 = new CheckIn();
        ch1.setroomtype(roomName);
    }

    public static void currency() {
        int choice;

        Scanner input = new Scanner(System.in);

        System.out.println("What would you like to convert?");
        System.out.println("1.EGP to USD?");
        System.out.println("2. USD to EGP?");

        choice = input.nextInt();

        if (choice == 1) {
            System.out.println("please enter the amount that you would like to convert");
            float egp = input.nextFloat();
            float amount1 = (float) (egp / 15.650);
            System.out.println("the amount in usd is:" + amount1);
        } else if (choice == 2) {
            System.out.println("please enter the amount that you would like to convert");
            float usd = input.nextFloat();
            float amount1 = (float) (usd * 15.650);
            System.out.println("the amount in EGP is:" + amount1);
        } else if (choice > 2 || choice < 1) {
            String g = JOptionPane.showInputDialog(null, "Please pick either option 1 or 2.", JOptionPane.WARNING_MESSAGE);
            JOptionPane.showInputDialog(null, "check the option you will choose");
            JCheckBox ch = new JCheckBox("1");
            JCheckBox ch1 = new JCheckBox("2");
            JFrame f = new JFrame();
            f.add(ch);
            f.add(ch1);
        }
    }

    public void empty() {
        ArrayList<RoomType1> check1 = new ArrayList<>();
        System.out.println(check1.isEmpty());
        ArrayList<RoomType2> check2 = new ArrayList<>();
        System.out.println(check2.isEmpty());
        ArrayList<RoomType3> check3 = new ArrayList<>();
        System.out.println(check3.isEmpty());
        ArrayList<RoomType4> check4 = new ArrayList<>();
        System.out.println(check4.isEmpty());
        ArrayList<RoomType5> check5 = new ArrayList<>();
        System.out.println(check5.isEmpty());
        ArrayList<RoomType6> check6 = new ArrayList<>();
        System.out.println(check6.isEmpty());

    }

}
