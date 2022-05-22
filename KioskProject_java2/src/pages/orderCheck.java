package pages;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Component.Components.nowBucket;


public class orderCheck extends JFrame {

    public orderCheck(){
        setTitle("주문 내역 확인");
        setSize(800,600);

        Container c = getContentPane();
        c.setBackground(new Color(238,238,238));
        c.setLayout(new GridLayout(5,1));


        JPanel check = new JPanel();
        JPanel nowBucket;
        nowBucket = nowBucket();

        //폰트
        Font font1 = new Font("맑은고딕",Font.BOLD, 40);
        c.setFont(font1);

        JLabel price = new JLabel("<html><br> 총 결제 비용: " + String.valueOf(Menu.price)+"원<br><html>");
        JLabel text = new JLabel("이대로 결제 하시겠습니까?");
        JButton confirm = new JButton("이대로 결제");
        JButton back = new JButton("메뉴 다시 고르기");

        price.setFont(font1);
        text.setFont(font1);

        c.add(nowBucket);
        c.add(price);
        c.add(text);
        c.add(confirm);
        c.add(back);

        this.setVisible(true);

        //eventListener

        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //ㅇㅇㅇㅇ얼마 결제가 완료되었습니다 창 나오게
                // 결제 완료 다이얼로그 띄우기
                JOptionPane.showConfirmDialog(c,Menu.price + "원 결제가 완료되었습니다","Message", JOptionPane.CLOSED_OPTION);

            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Menu();
            }
        });

    }


}
