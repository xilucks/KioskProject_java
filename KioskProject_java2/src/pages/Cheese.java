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
        JButton american = new JButton(Menu.resize("C:\\Users\\HONG SEO I\\Desktop\\Project\\2022\\Kiosk_project\\KioskProject_java2\\image\\cheese\\americanCheese.jpeg"));
        JButton mozzarella = new JButton(Menu.resize("C:\\Users\\HONG SEO I\\Desktop\\Project\\2022\\Kiosk_project\\KioskProject_java2\\image\\cheese\\MozzarellaCheese.jpeg"));
        JButton shredded = new JButton(Menu.resize("C:\\Users\\HONG SEO I\\Desktop\\Project\\2022\\Kiosk_project\\KioskProject_java2\\image\\cheese\\shreddedCheese.jpeg"));
        JButton none = new JButton(Menu.resize("C:\\Users\\HONG SEO I\\Desktop\\Project\\2022\\Kiosk_project\\KioskProject_java2\\image\\cheese\\X.png"));
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
        header.add(new JLabel("빵을 골라주세요"));

        //장바구니
        JPanel nowBucket;
        nowBucket = nowBucket();

        //test data
        c.add(header);
        c.add(menu);
        c.add(bucketButton);
        c.add(nowBucket);

        //set
        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;
        setSize(600,800);
        setVisible(true);

        //eventListener

        american.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.cheese = "american";
                new vegetable();
            }
        });
        mozzarella.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                        Menu.bread = "mozzarella";
                new vegetable();
                    }
        });
        shredded.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                        Menu.bread = "shredded";
                new vegetable();
                    }
        });
        none.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                        Menu.bread = "none";
                new vegetable();
                    }
        });

        bucketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new bucket();
                new vegetable();
                setVisible(false);
            }
        });


    }


    public static void main(String[] args) {
        new Cheese();
    }
}
