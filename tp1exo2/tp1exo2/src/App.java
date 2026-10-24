import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;
import java.awt.Insets;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class App {
    public static void main(String[] args) {
        Interface();
    }

    private static void Interface() {
        JFrame window = new JFrame("TestJButton : JButton");
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setSize(600, 380);
        window.setLocationRelativeTo(null);

        JPanel content = new JPanel(new BorderLayout(0, 8));
        content.setBorder(BorderFactory.createEmptyBorder(8, 28, 28, 28));

        JPanel choice = new JPanel();
        choice.setBorder(BorderFactory.createTitledBorder("Choisissez un texte"));

        JButton helloButton = new JButton("Hello World!");
        helloButton.setFont(new Font("Serif", Font.BOLD, 19));
        helloButton.setForeground(new Color(20, 55, 155));
        helloButton.setMargin(new Insets(2, 14, 2, 14));
        choice.add(helloButton);

        JPanel display = new JPanel(new BorderLayout());
        display.setBackground(new Color(255, 198, 0));
        display.setBorder(BorderFactory.createLineBorder(new Color(195, 155, 0), 2));

        ImageIcon image = new ImageIcon("src\\Java-Logo.jpg");
        Image scaledImage = image.getImage().getScaledInstance(320, 160, Image.SCALE_SMOOTH);
        JLabel logo = new JLabel(new ImageIcon(scaledImage), SwingConstants.CENTER);
        logo.setOpaque(true);
        logo.setBackground(Color.WHITE);
        logo.setPreferredSize(new Dimension(320, 160));
        display.add(logo, BorderLayout.CENTER);

        JLabel message = new JLabel("Hello World again!");
        message.setFont(new Font("SansSerif", Font.BOLD, 13));
        message.setBorder(BorderFactory.createEmptyBorder(0, 8, 0, 22));
        display.add(message, BorderLayout.EAST);

        helloButton.addActionListener(event -> message.setText("Hello World again!"));

        content.add(choice, BorderLayout.NORTH);
        content.add(display, BorderLayout.CENTER);
        window.setContentPane(content);
        window.setVisible(true);
    }
}
