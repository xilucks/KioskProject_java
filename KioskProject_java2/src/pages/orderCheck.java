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
        c.setLayout(new FlowLayout());


        JPanel check = new JPanel();
        JPanel btns = new JPanel();
        JPanel nowBucket;
        nowBucket = nowBucket();

        JLabel price = new JLabel("<html><br> 총 결제 비용: " + String.valueOf(Menu.price)+"원<br><html>");
        JLabel text = new JLabel("이대로 결제 하시겠습니까?");
        JButton confirm = new JButton("이대로 결제");
        JButton back = new JButton("메뉴 다시 고르기");

        c.add(nowBucket);
        c.add(price);
        c.add(text);
        c.add(confirm);
        c.add(back);

        this.setVisible(true);

        confirm.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //ㅇㅇㅇㅇ얼마 결제가 완료되었습니다 창 나오게
                // 결제 완료 다이얼로그 띄우기
                // 다이얼로그의 확인 버튼 색상, 버튼 폰트
                JOptionPane.showConfirmDialog(c,Menu.price + "원 결제가 완료되었습니다","Message", JOptionPane.CLOSED_OPTION);
                new index();


            }
        });

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new Menu();
            }
        });

    }

    //"주문 내역이 정확한가요?">> 이대로 결제/ 처음으로 돌아가기기
    //이벤트리스너

}
