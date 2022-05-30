/*
ref:
다른 창 띄우기: https://weiqing.tistory.com/192
창 전환하기: https://dinae.tistory.com/27
키오스크 레퍼런스: http://yoonbumtae.com/?p=3167
스타벅스 키오스크 리퍼런스: https://github.com/hjj5471/starbucks
 */


package pages;

import function.functions;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static Component.Components.nowBucket;
import static pages.index.breadList;

public class Bread extends JFrame {

    public Bread() {
        //        item1.setPreferredSize(new Dimension(300, 50)); //버튼 크기 조절
        //setTitle
        setTitle("빵 종류 선택");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Component Setting
        JPanel header = new JPanel();
        JButton Flat = new JButton("플랫브레드", functions.resize("KioskProject_java2/image/bread/Flat.jpeg"));
        JButton Heaty = new JButton("하티", functions.resize("KioskProject_java2/image/bread/Heaty.jpeg"));
        JButton wheat = new JButton("위트", functions.resize("KioskProject_java2/image/bread/wheat.jpeg"));
        JButton white = new JButton("화이트", functions.resize("KioskProject_java2/image/bread/white.jpeg"));
        JButton bucketButton = new JButton("장바구니");
        JLabel hd = new JLabel("빵을 골라주세요");

        //버튼디자인
        Flat.setBackground(Color.WHITE);
        Heaty.setBackground(Color.WHITE);
        wheat.setBackground(Color.WHITE);
        white.setBackground(Color.WHITE);
        bucketButton.setBackground(Color.black);
        bucketButton.setForeground(Color.WHITE);


        //메뉴판 제작
        JPanel menu = new JPanel(new GridLayout(2,2));
        menu.add(Flat);
        menu.add(Heaty);
        menu.add(wheat);
        menu.add(white);

        //Container Setting
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(new Color(238,238,238));
        header.add(hd);

        //font
        Font font1 = new Font("나눔고딕",Font.BOLD, 20);
        bucketButton.setFont(font1);
        bucketButton.setBackground(new Color(0,85,67));
        bucketButton.setForeground(Color.WHITE);

        //장바구니
        JPanel nowBucket;
        nowBucket = nowBucket();

        //test data
        c.add(header);
        c.add(menu);
        c.add(nowBucket);
        c.add(bucketButton);


        //set
        setSize(800,600);
        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;

        setVisible(true);


        //eventListener

        Flat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.bread = "플랫브래드";
                new Cheese();
                setVisible(false);

            }
        });
         Heaty.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 Menu.bread = "하티";
                 new Cheese();
                 setVisible(false);

             }
         });
         wheat.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 Menu.bread = "위트";
                 new Cheese();
                 setVisible(false);

             }
         });
         white.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                 Menu.bread = "화이트";
                 new Cheese();
                 setVisible(false);

             }
         });

        bucketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new bucket();
            }
        });


    }


    public static void main(String[] args) {
        new Bread();
    }
}
