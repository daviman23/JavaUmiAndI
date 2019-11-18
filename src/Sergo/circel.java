package Sergo;

import javax.swing.*;
import java.awt.*;

public class circel {
        public static void main(String[] args) {
            JFrame window = new MainWindow();
            //window.paint();
        }
}
    class MainWindow extends JFrame{
        MainWindow() {
            super("Main window for game");
            setSize(400,300);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setVisible(true);
        }
        public void paint(Graphics g){
            g.drawOval(150,100,75,75);
            g.setColor(Color.RED);
        }


    }
