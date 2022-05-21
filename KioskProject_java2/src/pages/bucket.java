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

        for(int i=0; i<index.breadList.size(); i++) {
            JPanel panel = new JPanel();
            Bread now_bread = index.breadList.get(i);
            panel.add(new JLabel("<html><br> 선택한 메뉴" + now_bread.getCore()+"<br></html>"));
            panel.add(new JLabel("선택한 빵" + now_bread.getBread()));
            panel.add(new JLabel("선택한 치즈" + now_bread.getCheese()));
            panel.add(new JLabel());
            c.add(panel);
        }

        Button tmp = new Button("돌아가기");

        tmp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new index();
            }
        });
        c.add(tmp);


        setSize(400,600);
        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;
        setVisible(true);

    }
    public static void main(String[] args) {
        new bucket();

    }
}
