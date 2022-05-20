package pages;

import item.Bread;
import java.awt.Font;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class index extends JFrame {
    public static ArrayList<Bread> breadList = new ArrayList<>();
    public index(){

        //FONT
        Font font1 = new Font("Malgun Gothic",Font.PLAIN, 40);


        //set Component
        JLabel logo = new JLabel(Menu.resize("C:\\Users\\HONG SEO I\\Desktop\\Project\\2022\\Kiosk_project\\KioskProject_java2\\image\\logo.png"));
        Button start = new Button("주문 시작하기");
        Button close = new Button("닫기");

        JPanel logoArea = new JPanel();
        JPanel buttons = new JPanel();

        //graphic
        setTitle("시작하기");
        Container c = getContentPane();
        c.setBackground(new Color(50,100,100));
        start.setFont(font1);
        close.setFont(font1);

        c.setLayout(new FlowLayout(FlowLayout.CENTER, 500,50));
        logoArea.add(logo);
        buttons.add(start);
        buttons.add(close);
        c.add(logoArea, BorderLayout.NORTH);
        c.add(buttons, BorderLayout.SOUTH);


        //display setting
        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;
        logo.setHorizontalAlignment(JLabel.CENTER); //로고 가운데 정렬
        setSize(800,600);
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
