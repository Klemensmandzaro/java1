import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random ten = new Random();
        int stan1 = ten.nextInt(5);
        Mieso_nabial jogurt = new Mieso_nabial("jogurt", 5.99, stan1);
        int stan2 = ten.nextInt(5);
        Mieso_nabial boczek = new Mieso_nabial("boczek", 5.34, stan2);
        int stan3 = ten.nextInt(9);
        Slodycze cukierek = new Slodycze("cukierek", 1.99, stan3);
        Produkty[] koszyk = {jogurt, boczek, cukierek};
        JFrame window = new JFrame("Kasa");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        window.setSize(300, 300);
        window.setLayout(new GridLayout(2, 1));
        panel.setBorder(new EmptyBorder(0, 0, 0, 0));
        panel.setPreferredSize(new Dimension( 300,100));
        panel.setBounds(0, 0, 300, 100);
        panel.setBackground(Color.green);
        JPanel panel2 = new JPanel();
        panel2.setBackground(Color.red);
        panel.setPreferredSize(new Dimension( 300,100));
        panel2.add(new JButton("cos"));
        panel2.setBounds(0, 100, 300, 100);

        panel.setLayout(new GridLayout(1, 3));  // Set layout to GridLayout with 1 row and 3 columns

        JButton button = new JButton("jogurt");
        JButton button1 = new JButton("boczek");
        JButton button2 = new JButton("cukierek");

        panel.add(button);
        panel.add(button1);
        panel.add(button2);

        window.add(panel);
        window.add(panel2);
        //window.setSize(300, 100);
        window.setLocationRelativeTo(null);
        window.setVisible(true);
    }
}