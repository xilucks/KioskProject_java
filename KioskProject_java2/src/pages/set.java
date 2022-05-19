package pages;

import javax.swing.*;
import java.awt.*;

import static Component.Components.nowBucket;

public class set extends JFrame {

    public set(){
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        setTitle("야채와 소스를 골라주세요");
        JPanel nowBucket;
        nowBucket = nowBucket();


        c.add(nowBucket);


        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;
        setSize(500, 1000);
        setVisible(true);

    }

    public static void main(String[] args) {
        new set();
    }
}
