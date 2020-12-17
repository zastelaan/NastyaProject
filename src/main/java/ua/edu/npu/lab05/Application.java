package ua.edu.npu.lab05;

import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {

    public Application() {

        setTitle("Форма входу");
        setSize(300, 150);
        JPanel panel = new JPanel();
        this.add(panel);

        panel.setLayout(null);

        JLabel userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        JTextField userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        JLabel passwordLabel = new JLabel("Password");
        passwordLabel.setBounds(10, 50, 80, 25);
        panel.add(passwordLabel);

        JTextField passwordText = new JPasswordField();
        passwordText.setBounds(100, 50, 165, 25);
        panel.add(passwordText);

        JButton button = new JButton("Вхід");
        button.setBounds(100, 80, 80, 25);
        panel.add(button);

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    public static void main(String[] args) {
        Application app = new Application();
    }
}


