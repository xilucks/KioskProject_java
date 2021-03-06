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

import static Component.Components.nowBucket;

//나중에 메소드 따로 모아서 리팩토링 할 필요가 있을듯 코드 너무 지저분함
public class Cheese extends JFrame {

    //resize method

    public Cheese() {

        //setTitle
        setTitle("메인 메뉴");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Component Setting
        JPanel header = new JPanel();
        JButton american = new JButton("아메리칸 치즈", functions.resize("KioskProject_java2/image/cheese/americanCheese.jpeg"));
        JButton mozzarella = new JButton("모짜렐라 치즈", functions.resize("KioskProject_java2/image/cheese/MozzarellaCheese.jpeg"));
        JButton shredded = new JButton("슈레드 치즈", functions.resize("KioskProject_java2/image/cheese/shreddedCheese.jpeg"));
        JButton none = new JButton("치즈 선택안함", functions.resize("KioskProject_java2/image/cheese/X.png"));
        JButton bucketButton = new JButton("장바구니");


        //버튼디자인
        american.setBackground(Color.WHITE);
        mozzarella.setBackground(Color.WHITE);
        shredded.setBackground(Color.WHITE);
        none.setBackground(Color.WHITE);
        bucketButton.setBackground(Color.black);
        bucketButton.setForeground(Color.WHITE);


        //메뉴판 제작
        JPanel menu = new JPanel(new GridLayout(2,2));
        menu.add(american);
        menu.add(mozzarella);
        menu.add(shredded);
        menu.add(none);


        //Container Setting
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.setBackground(new Color(238,238,238));

        header.add(new JLabel("치즈를 골라주세요"));


        //폰트
        Font font1 = new Font("나눔고딕",Font.BOLD, 20);
        bucketButton.setFont(font1);
        bucketButton.setBackground(new Color(0,85,67));
        bucketButton.setForeground(Color.WHITE);


        //장바구니
        JPanel nowBucket;
        nowBucket = nowBucket();


        //add
        c.add(header);
        c.add(menu);
        c.add(nowBucket);
        c.add(bucketButton);


        //set
        setSize(800,600);
        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;

        setVisible(true);


        //eventListener
        american.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.cheese = "아메리칸 치즈";
                new vegetableAndSauce();
                setVisible(false);

            }
        });
        mozzarella.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.cheese = "모짜렐라 치즈";
                new vegetableAndSauce();
                setVisible(false);

            }
        });
        shredded.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.cheese = "슈레드 치즈";
                new vegetableAndSauce();
                setVisible(false);

            }
        });
        none.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.cheese = "없음";
                new vegetableAndSauce();
                setVisible(false);

            }
        });

        bucketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new bucket();
                new vegetableAndSauce();
            }
        });


    }


    public static void main(String[] args) {
        new Cheese();
    }
}
