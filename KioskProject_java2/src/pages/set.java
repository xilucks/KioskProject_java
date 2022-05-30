package pages;

import item.Bread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Component.Components.nowBucket;
import static pages.Menu.*;
import static pages.Menu.set;
import static pages.index.breadList;

public class set extends JFrame {

    public set(){
        Container c = getContentPane();
        c.setBackground(new Color(238,238,238));
        c.setLayout(new GridLayout(3,1));
        setTitle("세트 여부를 선택해주세요");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //폰트
        Font font1 = new Font("맑은고딕",Font.BOLD, 30);
        Font font2 = new Font("맑은고딕",Font.BOLD, 20);


        //장바구니
        JPanel nowBucket;
        nowBucket = nowBucket();
        nowBucket.setFont(font2);


        //jbutton
        JButton pickset = new JButton("세트(+1500원)");
        JButton single = new JButton("단품");

        JPanel buttonz = new JPanel();
        buttonz.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        buttonz.add(single);
        buttonz.add(pickset);
        single.setPreferredSize(new Dimension(200,100));
        pickset.setPreferredSize(new Dimension(200,100));

        JPanel header = new JPanel();
        JLabel hd = new JLabel("<HTML><BR><BR> 세트메뉴를 선택하시겠습니까? </HTML>");
        hd.setFont(font1);
        header.add(hd);

        //font
        pickset.setFont(font2);
        single.setFont(font2);

        //디자인
        header.setBackground(new Color(0,85,67));
        hd.setForeground(Color.WHITE);
        pickset.setBackground(new Color(0, 85,67));
        pickset.setForeground(Color.WHITE);
        single.setBackground(Color.white);


        //add
        c.add(header);
        c.add(buttonz, new FlowLayout());
        c.add(nowBucket);


        //set
        setSize(800, 600);
        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;

        setVisible(true);


        //eventListener
        pickset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.set = true;
                Menu.price += 1500;
                Bread bread = new Bread(core, Menu.bread, cheese, vegetables, sauces, set, Menu.price);
                breadList.add(bread);
                new orderCheck();
                setVisible(false);
            }
        });

        single.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                Menu.set = false;
                Bread bread = new Bread(core, Menu.bread, cheese, vegetables, sauces, set, Menu.price);
                breadList.add(bread);
                new orderCheck();
                setVisible(false);

            }
        });

    }

    public static void main(String[] args) {
        new set();
    }
}
