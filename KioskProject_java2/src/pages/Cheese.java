/*
ref:
다른 창 띄우기: https://weiqing.tistory.com/192
창 전환하기: https://dinae.tistory.com/27
키오스크 레퍼런스: http://yoonbumtae.com/?p=3167
스타벅스 키오스크 리퍼런스: https://github.com/hjj5471/starbucks
 */


package pages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Component.Components.nowBucket;

//나중에 메소드 따로 모아서 리팩토링 할 필요가 있을듯 코드 너무 지저분함
public class Cheese extends JFrame {

    //resize method

    public Cheese() {
        //        item1.setPreferredSize(new Dimension(300, 50)); //버튼 크기 조절
        //setTitle
        setTitle("메인 메뉴");

        //Component Setting
        JPanel header = new JPanel();
        JButton american = new JButton("아메리칸 치즈", Menu.resize("KioskProject_java2/image/cheese/americanCheese.jpeg"));
        JButton mozzarella = new JButton("모짜렐라 치즈", Menu.resize("KioskProject_java2/image/cheese/MozzarellaCheese.jpeg"));
        JButton shredded = new JButton("슈레드 치즈", Menu.resize("KioskProject_java2/image/cheese/shreddedCheese.jpeg"));
        JButton none = new JButton("치즈 선택안함", Menu.resize("KioskProject_java2/image/cheese/X.png"));
        Button bucketButton = new Button("장바구니");

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
        Font font1 = new Font("맑은고딕",Font.BOLD, 40);
        c.setFont(font1);

        //장바구니
        JPanel nowBucket;
        nowBucket = nowBucket();

        //test data
        c.add(header);
        c.add(menu);
        c.add(nowBucket);
        c.add(bucketButton);


        //set
        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;
        setSize(800,600);
        setVisible(true);

        //eventListener

        american.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.cheese = "아메리칸 치즈";
                new vegetableAndSauce();
            }
        });
        mozzarella.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.cheese = "모짜렐라 치즈";
                new vegetableAndSauce();
            }
        });
        shredded.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.cheese = "슈레드 치즈";
                new vegetableAndSauce();
                    }
        });
        none.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.cheese = "없음";
                new vegetableAndSauce();
                    }
        });

        bucketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new bucket();
                new vegetableAndSauce();
                setVisible(false);
            }
        });


    }


    public static void main(String[] args) {
        new Cheese();
    }
}
