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
        JLabel logo = new JLabel(Menu.resize("C:\\Users\\HONG SEO I\\Desktop\\Project\\2022\\Kiosk_project\\KioskProject_java2\\image\\logo.png"));
        Button start = new Button("주문 시작하기");
        Button close = new Button("닫기");
        JPanel logoArea = new JPanel();
        JPanel buttons = new JPanel();


        //graphic
        setTitle("시작하기");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        logoArea.add(logo);
        buttons.add(start);
        buttons.add(close);
        c.add(logoArea, BorderLayout.CENTER);
        c.add(buttons, BorderLayout.WEST);


        //display setting
        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;
        logo.setHorizontalAlignment(JLabel.CENTER); //로고 가운데 정렬
        setSize(600,800);
        setVisible(true);


        //eventListener
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Menu();
                setVisible(false);

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
