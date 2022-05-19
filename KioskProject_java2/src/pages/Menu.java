/*
ref:
다른 창 띄우기: https://weiqing.tistory.com/192
창 전환하기: https://dinae.tistory.com/27
키오스크 레퍼런스: http://yoonbumtae.com/?p=3167
스타벅스 키오스크 리퍼런스: https://github.com/hjj5471/starbucks
 */


package pages;

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
    public static ArrayList<String> sources = new ArrayList<>();
    public static boolean set = false;
    public static int price = 0;


    //resize method
    public static ImageIcon resize(String path){
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage();
        Image reSizeImg = img.getScaledInstance(200,100,Image.SCALE_SMOOTH);
        ImageIcon changeIcon = new ImageIcon(reSizeImg);

        return changeIcon;

    }


    public Menu() {
        //        item1.setPreferredSize(new Dimension(300, 50)); //버튼 크기 조절
        //setTitle
        setTitle("메뉴를 골라주세요");

        //Component Setting
        JPanel header = new JPanel();
        JButton eggm = new JButton(resize("/Users/choisiun/Desktop/Programming/KioskProject_java/KioskProject_java2/image/menu/eggm.png"));
        JButton itbmt = new JButton(resize("/Users/choisiun/Desktop/Programming/KioskProject_java/KioskProject_java2/image/menu/itbmt.png"));
        JButton lostchicken = new JButton(resize("/Users/choisiun/Desktop/Programming/KioskProject_java/KioskProject_java2/image/menu/lostchicken.png"));
        JButton meatmball = new JButton(resize("/Users/choisiun/Desktop/Programming/KioskProject_java/KioskProject_java2/image/menu/meatball.png"));
        JPanel nowOrder = new JPanel();

        //메뉴판 제작
        JPanel menu = new JPanel(new GridLayout(2, 2));
        menu.add(eggm);
        menu.add(itbmt);
        menu.add(lostchicken);
        menu.add(meatmball);

        //현재 주문중인 상품
        int vegetableNum = vegetables.size();
        int sourceNum = sources.size();
        boolean bolSet = set;
        JLabel nowMenu = new JLabel("메뉴" + core);
        JLabel nowBread = new JLabel("빵" + bread);
        JLabel nowCheese = new JLabel("치즈" + cheese);
        JLabel nowVegetables = new JLabel(vegetableNum + "개");
        JLabel nowSources = new JLabel(sourceNum + "개");
        JLabel nowSet = new JLabel("세트유무" + bolSet);

        nowOrder.add(nowMenu);
        nowOrder.add(nowBread);
        nowOrder.add(nowCheese);
        nowOrder.add(nowVegetables);
        nowOrder.add(nowSources);
        nowOrder.add(nowSet);

        //test data
        Button bucketButton = new Button("장바구니");
        Button Test = new Button("test");

        //Container Setting
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        header.add(new JLabel("메인페이지"));

        //test data
        JPanel nowBucket;
        nowBucket = nowBucket();
        c.add(header);
        c.add(menu);
        c.add(nowBucket);
        c.add(bucketButton);
        c.add(Test);

        //set
        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;
        setSize(500, 1000);
        setVisible(true);

        //eventListener
        Test.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                breadList.add(new Bread("a", "a", "a", new ArrayList<>(), new ArrayList<>(), false, 0));
                breadList.add(new Bread("b", "a", "a", new ArrayList<>(), new ArrayList<>(), false, 0));
            }
        });

        eggm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                core = "egg";
                new pages.Bread();
                setVisible(false);
            }
        });
        itbmt.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                core = "itbmt";
                new pages.Bread();
                setVisible(false);
            }
        });
        lostchicken.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                core = "lostchicken";
                new pages.Bread();
                setVisible(false);
            }
        });
        meatmball.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                core = "meatball";
                new pages.Bread();
                setVisible(false);
            }
        });

        bucketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new bucket();
                new pages.Bread();

            }
        });


    }


    public static void main(String[] args) {
        new Menu();
    }
}
