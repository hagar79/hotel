package hotel.reservation2;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class CheckOut extends JFrame implements ActionListener
{

    Scanner input = new Scanner(System.in);

    public double DurationCost;
    public int CheckOutDate;
    public double ExtraServices;

    public CheckOut() {

    }

    public CheckOut(double DurationCost, int CheckOutDate, double ExtraServices) {
        this.DurationCost = DurationCost;
        this.CheckOutDate = CheckOutDate;
        this.ExtraServices = ExtraServices;
    }

    public JTextField getDurationCost(double DurationCost) {
        JTextField jtfDurationCost = new JTextField("your duration cost is:...LE");
        System.out.println("your duration cost is:...LE");
        return jtfDurationCost;
    }

    public double setDurationCost(double DurationCost) {
        return this.DurationCost = DurationCost;
    }

    public Date getCheckOutDate(Format CheckOutDate) {
        Date checkoutdate = new Date();
        System.out.println("your check out date is:../../..");
        return checkoutdate;
    }
    SimpleDateFormat s = new SimpleDateFormat("yyyy/MM/dd");

    public int setCheckOutDate(int CheckOutDate) {
        return this.CheckOutDate = CheckOutDate;
    }

    public String getExtraServices(String ExtraServices) {
        JOptionPane.showMessageDialog(null, "Whould you like to pay for you extra services cash or by visa?");
        JFrame f = new JFrame();
        JComboBox choice = new JComboBox(new String[]{"yex", "no"});
        f.add(choice);
        System.out.println("the cost for your extra services is:...LE");

        System.out.println("Please Select Number");
        int num = input.nextInt();
        switch (num) {
            case 0 :
                
                {
                    String Extservices1 = "Gym";
                    System.out.println("Gym");
                    return Extservices1;
                }

            case 1 :
                
                 {
                    String Extservices2 = "Spa";
                    System.out.println("Spa");
                    return Extservices2;
                }

            case 2 :
                
                 {
                    String Extservices3 = "Safari";
                    System.out.println("Safari");
                    return Extservices3;
                }

            case 3 :
                
                 {
                    String Extservices4 = "Transportation";
                    System.out.println("Transportations");
                    return Extservices4;
                }
        }
        return ExtraServices;
    }

    public double setExtraServices(double ExtraServices) {
        return this.ExtraServices = ExtraServices;
    }

    JButton jbtDone = new JButton("Done");

    @Override
    public void actionPerformed(ActionEvent e)
    {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
