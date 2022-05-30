/*
ref:
다른 창 띄우기: https://weiqing.tistory.com/192
창 전환하기: https://dinae.tistory.com/27
키오스크 레퍼런스: http://yoonbumtae.com/?p=3167
스타벅스 키오스크 리퍼런스: https://github.com/hjj5471/starbucks
 */


package pages;

import function.functions;
import item.Bread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static Component.Components.nowBucket;
import static pages.index.breadList;

public class Menu extends JFrame {




    //주문 초기화
    public static String core = null;
    public static String bread = null;
    public static String cheese = null;
    public static ArrayList<String> vegetables = new ArrayList<>();
    public static ArrayList<String> sauces = new ArrayList<>();
    public static boolean set = false;
    public static int price = 0;



    public Menu() {

        //setTitle
        setTitle("메뉴를 골라주세요");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Component Setting
        JPanel header = new JPanel();
        header.add(new JLabel("메뉴를 선택해주세요."));
        JButton eggm = new JButton("<html> 에그마요 <br> 4500원 </html>", functions.resize("KioskProject_java2/image/menu/eggm.png"));
        JButton itbmt = new JButton("<html> 이탈리안 BMT <br> 5400원 </html>", functions.resize("KioskProject_java2/image/menu/itbmt.png"));
        JButton lostchicken = new JButton("<html> 로스트 치킨 <br> 6100원 </html>", functions.resize("KioskProject_java2/image/menu/lostchicken.png"));
        JButton meatmball = new JButton("<html> 미트볼 <br> 6500원 </html>", functions.resize("KioskProject_java2/image/menu/meatball.png"));
        JButton bucketButton = new JButton("장바구니");


        //디자인
        eggm.setBackground(Color.WHITE);
        itbmt.setBackground(Color.WHITE);
        lostchicken.setBackground(Color.WHITE);
        meatmball.setBackground(Color.WHITE);
        bucketButton.setBackground(new Color(0,85,67));
        bucketButton.setForeground(Color.WHITE);


        //메뉴판 제작
        JPanel menu = new JPanel(new GridLayout(2, 2));
        menu.add(eggm);
        menu.add(itbmt);
        menu.add(lostchicken);
        menu.add(meatmball);


        //Container Setting
        Container c = getContentPane();
        c.setBackground(new Color(238,238,238));
        c.setLayout(new FlowLayout());


        //Font
        header.setFont(new Font("나눔고딕", Font.PLAIN, 50));
        bucketButton.setFont(new Font("나눔고딕",Font.BOLD, 20));
        
        //test data
        JPanel nowBucket;
        nowBucket = nowBucket();

        //add
        c.add(header);
        c.add(menu);
        c.add(nowBucket);
        c.add(bucketButton);


        //set
        setSize(800, 600);
        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;

        setVisible(true);


        //eventListener
        eggm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                core = "에그마요";
                price = 4500;
                new pages.Bread();
                setVisible(false);
            }
        });
        itbmt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                core = "이탈리안 비엠티";
                price = 5400;
                new pages.Bread();
                setVisible(false);
            }
        });
        lostchicken.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                core = "로스트 치킨";
                price = 6100;
                new pages.Bread();
                setVisible(false);
            }
        });
        meatmball.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                core = "미트볼";
                price = 6500;
                new pages.Bread();
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
        new Menu();
    }
}
