package pages;

import item.Bread;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static Component.Components.nowBucket;
import static pages.Menu.*;
import static pages.index.breadList;


public class orderCheck extends JFrame {

    public orderCheck(){
        //금액정산

        setTitle("주문 내역 확인");
        setSize(800,600);
        setLocationRelativeTo(null);    //디스플레이 가운데 정렬;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        Container c = getContentPane();
        c.setBackground(new Color(238,238,238));
        c.setLayout(new GridLayout(6,1));
        

        JPanel check = new JPanel();
        /*check.setAlignmentX(CENTER_ALIGNMENT);
        check.setAlignmentY(CENTER_ALIGNMENT);
        */

        JPanel nowBucket = new JPanel();

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
            nowBucket.add(panel);
        }

        //폰트
        Font font1 = new Font("맑은고딕",Font.BOLD, 20);
        c.setFont(font1);

        //금액정산
        int nowPrice = 0;
        for(int i=0; i<index.breadList.size(); i++) {
            nowPrice += breadList.get(i).price;

        }

        JLabel order = new JLabel("<html><br> 주문 내역 <br></html>");
        JLabel price = new JLabel("<html><br> 총 결제 비용: " + String.valueOf(nowPrice)+"원<br><html>");
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

                JOptionPane.showConfirmDialog(c, "장바구니에 추가되었습니다","Message", JOptionPane.CLOSED_OPTION);

                //초기화
                core = null;
                bread = null;
                cheese = null;
                vegetables = new ArrayList<>();
                sauces = new ArrayList<>();
                set = false;

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

    public static void main(String[] args) {
        new orderCheck();
    }


}
