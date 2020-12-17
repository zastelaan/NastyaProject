package ua.edu.npu.lab05;

import javax.swing.*;
import java.awt.*;

public class Application extends JFrame {

    public Application() {

        setTitle("Пуста форма");
        setSize(250, 150);

        this.setLayout( new GridBagLayout() );

        JButton button = new JButton("Натисніть кнопку");
        this.add(button, new GridBagConstraints());

        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
    }

    public static void main(String[] args) {
        Application app = new Application();
    }
}

