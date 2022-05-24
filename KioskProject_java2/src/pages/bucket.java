package pages;


import item.Bread;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;


public class bucket extends JFrame {

    public bucket(){
        setTitle("장바구니");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //container
        Container c = getContentPane();
        c.setLayout(new FlowLayout(FlowLayout.CENTER, 400, 10));

        //header: 장바구니
        JPanel header = new JPanel();
        JLabel hd = new JLabel("장바구니");
        header.add(hd);
        header.setBackground(new Color(0,85,67));
        hd.setForeground(Color.WHITE);
        hd.setFont(new Font("나눔고딕", Font.BOLD, 20));
        c.add(header);

        // 주문내역
        for(int i=0; i<index.breadList.size(); i++) {
            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(6,1));
            Bread now_bread = index.breadList.get(i);
            panel.add(new JLabel("<html><br> 선택한 메뉴: " + now_bread.getCore()+"<br></html>"));
            panel.add(new JLabel("<html><br> 선택한 빵: " + now_bread.getBread()+"<br></html>"));
            panel.add(new JLabel("<html><br> 선택한 치즈: " + now_bread.getCheese()+"<br></html>"));
            panel.add(new JLabel("<html><br> 선택한 야채: " + now_bread.getVegetables().size()+"개 <br></html>"));
            panel.add(new JLabel("<html><br> 선택한 소스: " + now_bread.getSauce().size()+"개 <br></html>"));
            panel.add(new JLabel("<html><br> 세트 여부: " + now_bread.getSet()+"<br></html>"));
            panel.add(new JLabel());
            c.add(panel);
        }

        //돌아가기 버튼
        JButton tmp = new JButton("돌아가기");
        tmp.setBackground(new Color(0, 85, 67));
        tmp.setForeground(Color.WHITE);


        tmp.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
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
