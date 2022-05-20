package pages;

import javax.swing.*;
import java.awt.*;

public class orderCheck extends JFrame {

    public orderCheck(){
        setTitle("주문 내역 확인");
        setSize(800,600);


        JPanel check = new JPanel();
        JPanel btns = new JPanel();

        this.add(check);
        check.setLayout(new FlowLayout());

        JLabel text = new JLabel("이대로 결제 하시겠습니까?");
        check.add(text);

        btns.setLayout(new GridLayout(1,2));
        btns.setPreferredSize(new Dimension(220,220));

        JButton confirm = new JButton("이대로 결제");
        btns.add(confirm);

        JButton back = new JButton("처음으로 돌아가기");
        btns.add(back);

        this.setVisible(true);

    }

    //"주문 내역이 정확한가요?">> 이대로 결제/ 처음으로 돌아가기기
}
