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

        //폰트
        Font font1 = new Font("맑은고딕",Font.BOLD, 40);
        c.setFont(font1);

        for(int i=0; i<index.breadList.size(); i++) {
            JPanel panel = new JPanel();
            Bread now_bread = index.breadList.get(i);
            panel.add(new JLabel("<html><br> 선택한 메뉴" + now_bread.getCore()+"<br></html>"));
            panel.add(new JLabel("<html><br> 선택한 빵" + now_bread.getBread()+"<br></html>"));
            panel.add(new JLabel("<html><br> 선택한 치즈" + now_bread.getCheese()+"<br></html>"));
            panel.add(new JLabel("<html><br> 선택한 야채" + now_bread.getVegetables().size()+"개 <br></html>"));
            panel.add(new JLabel("<html><br> 선택한 소스" + now_bread.getSauce().size()+"개 <br></html>"));
            panel.add(new JLabel("<html><br> 세트 여부" + now_bread.getSet()+"<br></html>"));
            panel.add(new JLabel());
            c.add(panel);
        }

        //장바구니 추가

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
