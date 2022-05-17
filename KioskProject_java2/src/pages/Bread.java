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
import java.util.ArrayList;

import static pages.index.breadList;

public class Bread extends JFrame {

    //resize method
    public static ImageIcon resize(String path){
        ImageIcon icon = new ImageIcon(path);
        Image img = icon.getImage();
        Image reSizeImg = img.getScaledInstance(200,100,Image.SCALE_SMOOTH);
        ImageIcon changeIcon = new ImageIcon(reSizeImg);

        return changeIcon;

    }
    public Bread() {
        //        item1.setPreferredSize(new Dimension(300, 50)); //버튼 크기 조절
        //setTitle
        setTitle("메인 메뉴");

        //Component Setting
        JPanel header = new JPanel();
        JButton Flat = new JButton(resize("/Users/choisiun/Desktop/Programming/KioskProject_java/KioskProject_java2/image/bread/Flat.jpeg"));
        JButton Heaty = new JButton(resize("/Users/choisiun/Desktop/Programming/KioskProject_java/KioskProject_java2/image/bread/Heaty.jpeg"));
        JButton wheat = new JButton(resize("/Users/choisiun/Desktop/Programming/KioskProject_java/KioskProject_java2/image/bread/wheat.jpeg"));
        JButton white = new JButton(resize("/Users/choisiun/Desktop/Programming/KioskProject_java/KioskProject_java2/image/bread/white.jpeg"));
        Button bucketButton = new Button("장바구니");
        //메뉴판 제작
        JPanel menu = new JPanel(new GridLayout(2,2));
        menu.add(Flat);
        menu.add(Heaty);
        menu.add(wheat);
        menu.add(white);

        //Container Setting
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        header.add(new JLabel("빵을 골라주세요"));

        //test data
        c.add(header);
        c.add(menu);
        c.add(bucketButton);

        //set
        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;
        setSize(500,1000);
        setVisible(true);

        //eventListener

        Flat.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.bread = "egg";
            }
        });
         Heaty.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Menu.bread = "itbmt";
                    }
                });
         wheat.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Menu.bread = "lostchicken";
                    }
                });
         white.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        Menu.bread = "meatball";
                    }
                });

        bucketButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new bucket();
                new pages.Bread();
                setVisible(false);
            }
        });


    }


    public static void main(String[] args) {
        new Bread();
    }
}