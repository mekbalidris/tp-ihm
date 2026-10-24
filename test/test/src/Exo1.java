import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;


public class Exo1 extends JFrame{

    public Exo1(){
        JLabel label = new JLabel("Sign in");
        JPanel pan = new JPanel();
        pan.setBackground(Color.gray);
        pan.setLayout(null);
        label.setBounds(150,10,200,50);
        Font font1 = new Font("Garamond", Font.BOLD, 20);
        label.setFont(font1);
        pan.add(label);

        JLabel emaillabel = new JLabel("Email:");
        JLabel passwordlabel = new JLabel("Password:");

        emaillabel.setLayout(null);
        emaillabel.setBounds(50,90,100,50);
        emaillabel.setFont(font1);
        pan.add(emaillabel);

        passwordlabel.setLayout(null);
        passwordlabel.setBounds(50,140,100,50);
        passwordlabel.setFont(font1);
        pan.add(passwordlabel);

        JTextField emailfField = new JTextField();
        JPasswordField passwordfField = new JPasswordField();

        emailfField.setLayout(null);
        emailfField.setBounds(150,100,200,25);
        emailfField.setFont(font1);
        pan.add(emailfField);

        passwordfField.setLayout(null);
        passwordfField.setBounds(150,150,200,25);
        passwordfField.setFont(font1);
        pan.add(passwordfField);

        JRadioButton rad1 = new JRadioButton("I am a new customer");
        JRadioButton rad2 = new JRadioButton("I am an old customer");

        rad1.setLayout(null);
        rad1.setBounds(50,200,250,25);
        rad1.setFont(font1);
        pan.add(rad1);
        rad1.setBackground(Color.gray);


        rad2.setLayout(null);
        rad2.setBounds(50,225,250,25);
        rad2.setFont(font1);
        pan.add(rad2);
        rad2.setBackground(Color.gray);

        ButtonGroup customerGroup = new ButtonGroup();
        customerGroup.add(rad1);
        customerGroup.add(rad2);

        JButton signInButton = new JButton("Sign in");
        signInButton.setBounds(200,250,100,25);
        pan.add(signInButton);

        JLabel forgotPasswordLabel = new JLabel(
                "<html><a href=''>Forgot your password?</a></html>");
        forgotPasswordLabel.setBounds(25,300,200,25);
        forgotPasswordLabel.setFont(font1);
        pan.add(forgotPasswordLabel);


        this.getContentPane().add(pan);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Sign in");
        this.setSize(500,450);
        this.setMinimumSize(new Dimension(400,400));
        this.setResizable(true);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}