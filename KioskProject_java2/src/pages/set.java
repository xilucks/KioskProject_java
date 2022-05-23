package pages;

import item.Bread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Component.Components.nowBucket;

public class set extends JFrame {

    public set(){
        Container c = getContentPane();
        c.setBackground(new Color(238,238,238));
        c.setLayout(new GridLayout(3,1));
        setTitle("세트 여부를 선택해주세요");

        //폰트
        Font font1 = new Font("맑은고딕",Font.BOLD, 40);

        JPanel nowBucket;
        nowBucket = nowBucket();
        nowBucket.setFont(font1);


        //단픔, 세트 jbutton
        Button pickset = new Button("세트메뉴 선택");
        Button single = new Button("이대로 결제하기");

        JPanel buttonz = new JPanel();
        buttonz.add(single);
        buttonz.add(pickset);


        JPanel header = new JPanel();
        header.add(new JLabel("<html><br><br><br> 세트메뉴를 선택하시겠습니까? </html>"));

        //font
        header.setFont(font1);
        pickset.setFont(font1);
        single.setFont(font1);

        c.add(header);
        c.add(buttonz, new FlowLayout());
        c.add(nowBucket);

        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;
        setSize(800, 600);
        setVisible(true);

        //eventListener
        pickset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.set = true;
                Menu.price += 1500;
                new orderCheck();
            }
        });

        single.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Menu.set = false;
                new orderCheck();
            }
        });

    }

    public static void main(String[] args) {
        new set();
    }
}
