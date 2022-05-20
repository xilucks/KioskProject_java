package pages;

import javax.swing.*;
import java.awt.*;

import static Component.Components.nowBucket;

public class set extends JFrame {

    public set(){
        Container c = getContentPane();
        c.setBackground(new Color(50,100,100));
        c.setLayout(new FlowLayout());
        c.add(new JLabel("세트 여부를 선택해주세요"));
        setTitle("단품 or 세트 선택");
        JPanel nowBucket;
        nowBucket = nowBucket();

        //단픔, 세트 jbutton 추가
        Button single = new Button("단품");
        Button pickset = new Button("세트");

        JPanel buttonz = new JPanel();
        buttonz.add(single);
        buttonz.add(pickset);

        c.add(nowBucket);
        c.add(buttonz, new FlowLayout());


        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;
        setSize(800, 600);
        setVisible(true);

    }

    public static void main(String[] args) {
        new set();
    }
}
