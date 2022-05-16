package pages;

import item.Bread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class index extends JFrame {
    public static ArrayList<Bread> breadList = new ArrayList<>();
    public index(){

        //set Component
        Button start = new Button("주문 시작하기");
        Button close = new Button("닫기");

        //graphic
        setTitle("시작하기");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel("주문 시작하기"));
        c.add(start);
        c.add(close);

        setSize(500,1000);
        setVisible(true);


        //eventListener
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Main();

            }
        });
        close.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
            }
        });




    }
    public static void main(String[] args) {
        new index();

    }
}
