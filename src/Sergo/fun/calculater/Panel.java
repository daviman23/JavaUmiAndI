package Sergo.fun.calculater;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import static java.awt.Font.BOLD;
import static java.awt.Font.textRequiresLayout;

public class Panel extends JPanel {
    private JButton numbers[] = new JButton[10];
    private Font font = new Font("SanSerif", Font.BOLD, 20);
    private JTextField output = new JTextField();
    private JButton backspace =new JButton("<"), equ = new JButton("=");
    private JButton plus = new JButton("+"), minus = new JButton("-"), multi = new JButton("X"), div = new JButton(":");
    public Panel(){
            setLayout(null);
            setFocusable(true);
            grabFocus();

        equ.setBounds(130,225,50,50);
        equ.setFont(font);
        add(equ);

        backspace.setBounds(10,225,50,50);
        backspace.setFont(font);
        add(backspace);

        plus.setBounds(190,70,50,50);
        plus.setFont(font);
        add(plus);

        minus.setBounds(190,120,50,50);
        minus.setFont(font);
        add(minus);

        multi.setBounds(190,170,50,50);
        multi.setFont(font);
        add(multi);

        div.setBounds(190,225, 50,50);
        div.setFont(font);
        add(div);

        numbers[0] = new JButton( "0");
        numbers[0].setBounds(70,225,50 , 50);
        numbers[0].setFont(font);
        add(numbers[0]);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                numbers[i * 3 + j + 1] = new JButton((i * 3 + j + 1) + "");
                numbers[i * 3 + j + 1].setBounds(i * (50 + 10) + 10,j * (50 + 1) + 70,50 , 50);
                numbers[i * 3 + j + 1].setFont(font);
                add(numbers[i * 3 + j + 1]);
            }
        }

        output.setBounds(10,10,230,50);
        output.setFont(font);
        output.setEditable(false);
        add(output);

        ActionListener l = (ActionEvent e) ->{
            JButton b = (JButton) e.getSource();
            output.setText(output.getText() + b.getText());
        };

        for (JButton b : numbers){
            b.addActionListener(l);
        }
        addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                char symbol = e.getKeyChar();

                if(!Character.isDigit(symbol))
                    return;

                else
                    output.setText(output.getText() + symbol);
            }
        });
    }
}
