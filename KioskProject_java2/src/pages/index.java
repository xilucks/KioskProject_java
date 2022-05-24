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
        JLabel logo = new JLabel(Menu.resize("KioskProject_java2/image/logo.png"));
        JButton start = new JButton("주문 시작하기");
        JButton close = new JButton("닫기");
        JPanel logoArea = new JPanel();
        JPanel buttons = new JPanel();


        //graphic
        setTitle("시작하기");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //container
        Container c = getContentPane();
        c.setBackground(new Color(238,238,238));


        //button 디자인 설정
        GridLayout btns = new GridLayout(2,1, 0, 20);
        buttons.setLayout(btns);
        start.setPreferredSize(new Dimension(250,70));  
        start.setFont(new Font("나눔고딕", Font.BOLD, 20));
        close.setFont(new Font("나눔고딕", Font.BOLD, 20));
        start.setBackground(new Color(0,85,67));
        start.setForeground(Color.WHITE);
        close.setBackground(new Color(0,85,67));
        close.setForeground(Color.WHITE);


        //layout
        c.setLayout(new FlowLayout(FlowLayout.CENTER, 500, 50));
        logoArea.add(logo);
        buttons.add(start);
        buttons.add(close);
        c.add(logoArea, BorderLayout.CENTER);
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
