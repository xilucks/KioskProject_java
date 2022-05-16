package pages;


import item.Bread;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class bucket extends JFrame {

    public bucket(){
        setTitle("장바구니");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel("장바구니"));
        Button tmp = new Button("돌아가기");

        tmp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new index();
            }
        });
        c.add(tmp);

        for(int i=0; i<index.breadList.size(); i++) {
            Bread now_bread = index.breadList.get(i);
            c.add(new JLabel(now_bread.getCore()));


        }

        setSize(500,1000);
        setVisible(true);

    }
    public static void main(String[] args) {
        new bucket();

    }
}
