package pages;

import item.Bread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Component.Components.nowBucket;


public class orderCheck extends JFrame {

    public orderCheck(){
        setTitle("주문 내역 확인");
        setSize(800,600);
        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container c = getContentPane();
        c.setBackground(new Color(238,238,238));
        c.setLayout(new GridLayout(6,1));


        JPanel check = new JPanel();
        JPanel nowBucket;
        nowBucket = nowBucket();

        //폰트
        Font font1 = new Font("맑은고딕",Font.BOLD, 20);
        c.setFont(font1);

        JLabel order = new JLabel("<html><br> 주문 내역 <br></html>");
        JLabel price = new JLabel("<html><br> 총 결제 비용: " + String.valueOf(Menu.price)+"원<br><html>");
        JLabel text = new JLabel("이대로 결제 하시겠습니까?");
        JButton moremenu = new JButton("메뉴 더 고르기");
        JButton confirm = new JButton("결제하기");

        price.setFont(font1);
        text.setFont(font1);
        order.setFont(font1);

        c.add(order);
        c.add(nowBucket);
        c.add(price);
        c.add(text);
        c.add(confirm);
        c.add(moremenu);

        this.setVisible(true);

        //eventListener

        moremenu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // 장바구니에 추가
                

                JOptionPane.showConfirmDialog(c,"추가되었습니다","Message", JOptionPane.CLOSED_OPTION);

                new Menu();
                setVisible(false);


            }
        });

        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showConfirmDialog(c,Menu.price + "원 결제가 완료되었습니다","Message", JOptionPane.CLOSED_OPTION);
                //전체창 닫기
                setVisible(false);

            }
        });

    }


}
